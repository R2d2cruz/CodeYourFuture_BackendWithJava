package com.egg.biblioteca.controladores;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.AutorServicio;
import com.egg.biblioteca.servicios.EditorialServicio;
import com.egg.biblioteca.servicios.LibroServicio;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/registrar") // localhost:8080/libro/registrar
    public String registrar(ModelMap model) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        model.addAttribute("autores", autores);
        model.addAttribute("editoriales", editoriales);
        return "libro_form.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {

        List<Libro> libros = libroServicio.listarLibros();
        modelo.addAttribute("libros", libros);
        return "libro_list.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
            @RequestParam(required = false) Integer ejemplares, @RequestParam String idAutor,
            @RequestParam String idEditorial, ModelMap modelo) {
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        // Validación para idAutor
        if (!esUUIDValido(idAutor)) {
            modelo.put("error", "El ID del autor no es un UUID válido.");
            return "libro_form.html"; // Volver a mostrar el formulario
        }

        // Validación para idEditorial
        if (!esUUIDValido(idEditorial)) {
            modelo.put("error", "El ID de la editorial no es un UUID válido.");
            return "libro_form.html"; // Volver a mostrar el formulario
        }

        try {
            libroServicio.crearLibro(isbn, titulo, ejemplares, UUID.fromString(idAutor), UUID.fromString(idEditorial));
            modelo.put("exito", "El libro se guardo de forma exitosa");
        } catch (MiException ex) {
            // Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null,
            // ex);
            modelo.put("error", ex.getMessage());
            return "libro_form.html"; // Volver a mostrar el formulario
        }

        return "redirect:/libro/lista"; // Redirige a la página donde se lista los libros
    }

    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {
        // Obtener el libro por ISBN
        Libro libro = libroServicio.getOne(isbn);
        modelo.put("libro", libro);

        // Obtener la lista de autores y editoriales
        List<Autor> autores = autorServicio.listarAutores();
        List<Editorial> editoriales = editorialServicio.listarEditoriales();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        // Retornar la vista
        return "libro_modificar.html";
    }

    @PostMapping("/{isbn}")
    public String modificar(@PathVariable Long isbn,
            @RequestParam String titulo,
            @RequestParam int ejemplares,
            @RequestParam String idAutor,
            @RequestParam String idEditorial,
            ModelMap modelo) {
        try {
            // Guardar los cambios en la base de datos
            libroServicio.modificarLibro(isbn, titulo, ejemplares, UUID.fromString(idAutor),
                    UUID.fromString(idEditorial));

            // Redirigir a la lista de libros después de modificar
            return "redirect:/libro/lista";
        } catch (MiException ex) {
            // En caso de error, se agrega el mensaje de error y se vuelve a la página de
            // modificar libro
            modelo.put("error", ex.getMessage());
            return "libro_modificar.html"; // Volver a la página de modificación
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