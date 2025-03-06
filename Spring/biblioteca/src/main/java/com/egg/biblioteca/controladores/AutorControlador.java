package com.egg.biblioteca.controladores;

import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;

@Controller
@RequestMapping("/autor") // localhost:8080/autor
public class AutorControlador {

    @Autowired
    private  AutorServicio autorServicio;

    @GetMapping("/registrar") // localhost:8080/autor/registrar
    public String registrar() {
        return "autor_form.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {

        List<Autor> autores = autorServicio.listarAutores();
        modelo.addAttribute("autores", autores);
        return "autor_list.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {
        try {
            autorServicio.crearAutor(nombre); // llamo a mi servicio para persistir

            modelo.put("exito", "El autor se guardo correctamente");
        } catch (MiException ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            modelo.put("error", ex.getMessage());
            return "autor_form.html";
        }
        return "index.html";

    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        if (!esUUIDValido(id)) {
            modelo.put("error", "El ID del autor no es un UUID válido.");
            return "libro_list.html"; // Volver a mostrar el formulario
        }

        modelo.put("autor", autorServicio.getOne(UUID.fromString(id)));


        return "autor_modificar.html";
    }


    @PostMapping("/{id}")
    public String modificar(@PathVariable String id, @RequestParam String nombre, ModelMap modelo) {
        if (!esUUIDValido(id)) {
            modelo.put("error", "El ID del autor no es un UUID válido.");
            return "redirect:/autor/lista"; // Volver a mostrar el formulario
        }
        
        try {
            autorServicio.modificarAutor(nombre, UUID.fromString(id));


            return "redirect:/autor/lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "autor_modificar.html";
        }
    }

    // Método para verificar si una cadena es un UUID válido
    private boolean esUUIDValido(String id) {
        try {
            UUID.fromString(id);
            return true; // Es un UUID válido
        } catch (IllegalArgumentException e) {
            return false; // No es un UUID válido
        }
    }

}
