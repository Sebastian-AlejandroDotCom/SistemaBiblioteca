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
            try {
                model.addAttribute("libros", libroService.mostrarTodos());
                model.addAttribute("editoriales", editorialService.mostrarTodas());
                return "/libro/libros";
            }catch (Exception e){
                model.addAttribute("msj", "No se ha podido cargar la lista de Libros. (" + e.getMessage() + ")");
                return "error";
            }
        }
        else {
            try {
                model.addAttribute("libros", libroService.buscarPorIsbn(isbn));
                model.addAttribute("editoriales", editorialService.mostrarTodas());
                return "/libro/libros";
            }catch (Exception e){
                model.addAttribute("msj", "Id de Libro no Encontrado. (" + e.getMessage() + ")");
                return "error";
            }
        }
    }

    @GetMapping("/libros/registrar")
    public String registerBook(Model model){
        try {
            model.addAttribute("libro", new Libro());
            model.addAttribute("editoriales", editorialService.mostrarTodas());
            return "/libro/registroLibro";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Registro. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @PostMapping("/libros/registrar")
    public String registeredBook(@Valid Libro libro, Model model){

        try {
            libroService.guardar(libro);
            model.addAttribute("libros", libroService.mostrarTodos());
            model.addAttribute("editoriales", editorialService.mostrarTodas());
            return "/libro/libros";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Registrar Libro. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @GetMapping("/libros/editar")
    public String editBook(@RequestParam(name = "editISBN", required = false , defaultValue = "") String isbn, Model model){

        try{
            model.addAttribute("libro", libroService.buscarPorIsbn(isbn));
            model.addAttribute("editoriales", editorialService.mostrarTodas());
            return "/libro/editarLibro";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Edición. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @PostMapping("/libros/editar")
    public String editedBook(@Valid Libro libro, Model model){

        try {
            libroService.actualizar(libro);
            model.addAttribute("libros", libroService.mostrarTodos());
            model.addAttribute("editoriales", editorialService.mostrarTodas());
            return "/libro/libros";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Editar Libro. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @GetMapping("/libros/eliminar")
    public String deleteBook(@RequestParam(name = "deleteISBN", required = false , defaultValue = "") String isbn, Model model){

        try {
            libroService.eliminar(isbn);
            model.addAttribute("libros", libroService.mostrarTodos());
            model.addAttribute("editoriales", editorialService.mostrarTodas());
            return "/libro/libros";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Eliminar Libro. (" + e.getMessage() + ")");
            return "error";
        }
    }
}