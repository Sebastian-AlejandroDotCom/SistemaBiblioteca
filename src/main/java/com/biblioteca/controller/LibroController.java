package com.biblioteca.controller;

import com.biblioteca.dto.Libro;
import com.biblioteca.service.EditorialService;
import com.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;
    @Autowired
    private EditorialService editorialService;

    @GetMapping("/libros")
    public String showBooks(@RequestParam(name = "searchISBN", required = false , defaultValue = "") String isbn, Model model){

        if (isbn.isEmpty()){

            model.addAttribute("libros", libroService.mostrarTodos());
            model.addAttribute("editoriales", editorialService.mostrarTodas());

        }
        else {

            model.addAttribute("libros", libroService.buscarPorIsbn(isbn));
            model.addAttribute("editoriales", editorialService.mostrarTodas());

        }
        return "/libro/libros";
    }

    @GetMapping("/libros/registrar")
    public String registerBook(Model model){
        model.addAttribute("libro", new Libro());
        model.addAttribute("editoriales", editorialService.mostrarTodas());
        return "/libro/registroLibro";
    }

    @PostMapping("/libros/registrar")
    public String registeredBook(@Valid Libro libro, Model model){

        libroService.guardar(libro);
        model.addAttribute("libros", libroService.mostrarTodos());
        model.addAttribute("editoriales", editorialService.mostrarTodas());

        return "/libro/libros";
    }

    @GetMapping("/libros/editar")
    public String editBook(@RequestParam(name = "editISBN", required = false , defaultValue = "") String isbn, Model model){

        if (!isbn.isEmpty()){
            model.addAttribute("libro", libroService.buscarPorIsbn(isbn));
            model.addAttribute("editoriales", editorialService.mostrarTodas());
        }

        return "/libro/editarLibro";
    }

    @PostMapping("/libros/editar")
    public String editedBook(@Valid Libro libro, Model model){

        libroService.actualizar(libro);
        model.addAttribute("libros", libroService.mostrarTodos());
        model.addAttribute("editoriales", editorialService.mostrarTodas());

        return "/libro/libros";
    }

    @GetMapping("/libros/eliminar")
    public String deleteBook(@RequestParam(name = "deleteISBN", required = false , defaultValue = "") String isbn, Model model){

        libroService.eliminar(isbn);
        model.addAttribute("libros", libroService.mostrarTodos());
        model.addAttribute("editoriales", editorialService.mostrarTodas());

        return "/libro/libros";
    }
}