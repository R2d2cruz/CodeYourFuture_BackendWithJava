package com.egg.biblioteca.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.UsuarioServicio;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/") // Acá es donde realizamos el mapeo
    public String index() {
        return "index.html"; // Acá es que retornamos con el método.
    }

    @GetMapping("/registrar")
    public String registrar() {
        return "registro.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(HttpSession session) {
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }
        return "inicio.html";
    }


    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo) {
        if (error != null) {
            modelo.put("error", "Usuario o Contraseña inválidos!");
        }
        return "login.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam("nombre") String nombre,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("password2") String password2,
            ModelMap modelo) {
        try {
            // Intentar registrar al usuario utilizando el servicio
            usuarioServicio.registrarUsuario(nombre, email, password, password2);

            // Si todo es correcto, redirigir a la vista index.html y pasar mensaje de éxito
            modelo.put("exito", "Tu usuario ha sido registrado con exito!");
            return "index.html"; // Nombre de la vista
        } catch (MiException ex) {
            // Si hay un error, devolver al formulario con un mensaje de error
            modelo.put("error", ex.getMessage());
            return "registro.html"; // Nombre del formulario de registro
        }
    }
}
