package com.egg.mercaderia.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.egg.mercaderia.entidades.Usuario;
import com.egg.mercaderia.enumeraciones.Rol;
import com.egg.mercaderia.excepciones.MiException;
import com.egg.mercaderia.repositorios.UsuarioRepositorio;

import jakarta.servlet.http.HttpSession;

@Service
public class UsuarioServicio implements UserDetailsService {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Transactional
    public void registrarUsuario(MultipartFile archivo, String nombre, String apellido, String email, String password,
            String password2)
            throws MiException {
        validar(nombre, apellido, email, password, password2);

        Usuario usuario = new Usuario();

        usuario.setEmail(email);
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.USER);

        usuarioRepositorio.save(usuario);
    }

    @Transactional
    public void actualizarUsuario(UUID id, MultipartFile archivo, String nombre, String apellido, String email,
            String password,
            String password2) throws MiException {
        validar(nombre, apellido, email, password, password2);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);
            usuario.setEmail(email);

            usuario.setPassword(new BCryptPasswordEncoder().encode(password));

            usuarioRepositorio.save(usuario);
        }
    }

    @Transactional(readOnly = true)
    public Usuario getOne(UUID id) {
        return usuarioRepositorio.getReferenceById(id);
    }

    private void validar(String nombre, String apellido, String email, String password, String password2)
            throws MiException {

        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("el nombre no puede ser nulo o estar vacío");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new MiException("el apellido no puede ser nulo o estar vacío");
        }
        if (email == null || email.isEmpty()) {
            throw new MiException("el email no puede ser nulo o estar vacío");
        }
        if (password == null || password.isEmpty() || password.length() <= 5) {
            throw new MiException("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }
        if (!password.equals(password2)) {
            throw new MiException("Las contraseñas ingresadas deben ser iguales");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);

        if (usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList<>();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());

            permisos.add(p);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario);

            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
        } else {
            return null;
        }

    }

}
