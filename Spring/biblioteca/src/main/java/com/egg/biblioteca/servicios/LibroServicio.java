package com.egg.biblioteca.servicios;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public void crearLibro(Long isbn, String titulo, int ejemplares, UUID idAutor, UUID idEditorial) throws MiException{
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();
        Autor autor = autorRepositorio.findById(idAutor).get();

        Libro libro = new Libro();// Instancio un objeto del tipo Autor
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAlta(new Date(0));
        libro.setEjemplares(ejemplares);

        libro.setAutor(autor);

        libro.setEditorial(editorial);

        libroRepositorio.save(libro); // Persisto el dato en mi BBDD
    }

    @Transactional(readOnly = true)
    public List<Libro> listarLibros() {

        List<Libro> libros = libroRepositorio.findAll();

        return libros;
    }

    @Transactional
    public void modificarLibro(Long isbn, String titulo, int ejemplares, UUID idAutor, UUID idEditorial) throws MiException{
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Libro> respuestaLibro = libroRepositorio.findById(isbn);
        if (respuestaEditorial.isPresent() && respuestaAutor.isPresent() && respuestaLibro.isPresent()) {
            Editorial editorial = respuestaEditorial.get();
            Autor autor = respuestaAutor.get();
            Libro libro = respuestaLibro.get();

            libro.setTitulo(titulo);
            libro.setEjemplares(ejemplares);

            libro.setAutor(autor);

            libro.setEditorial(editorial);

            libroRepositorio.save(libro); // Persisto el dato en mi BBDD

        }
    }

    private void validar(Long isbn, String titulo, int ejemplares, UUID idAutor, UUID idEditorial) throws MiException {
        if (isbn == null || isbn <= 0) {
            throw new MiException("El ISBN no puede ser nulo o menor o igual a cero");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El título no puede ser nulo o estar vacío");
        }
        if (ejemplares <= 0) {
            throw new MiException("El número de ejemplares debe ser mayor que cero");
        }
        if (idAutor == null) {
            throw new MiException("El ID del autor no puede ser nulo");
        }
        if (idEditorial == null) {
            throw new MiException("El ID de la editorial no puede ser nulo");
        }
    }

}
