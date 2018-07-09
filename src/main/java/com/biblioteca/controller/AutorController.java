package com.biblioteca.controller;

import com.biblioteca.dto.Autor;
import com.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/autores")
    public String showAuthors(@RequestParam( name = "searchIdAutor", required = false, defaultValue = "")String idAutor, Model model) {

        if(idAutor.isEmpty()){

            try {
                model.addAttribute("autores", this.autorService.mostrarTodos());
                return "/autor/autores";
            }catch (Exception e){
                model.addAttribute("msj", "No se ha podido cargar la lista de Autores. (" + e.getMessage() + ")");
                return "error";
            }

        }else {

            try {
                model.addAttribute("autores", this.autorService.buscarPorId(Integer.parseInt(idAutor)).get());
                return "/autor/autores";
            }catch(Exception e){
                model.addAttribute("msj", "Id de Autor no Encontrado. (" + e.getMessage() + ")");
                return "error";
            }
        }
    }

    @GetMapping("/autores/eliminar")
    public String deleteAuthor(@RequestParam( name = "deleteIdAutor", required = true, defaultValue = "") String idAutor, Model model){

        try {
            this.autorService.elminarPorId(Integer.parseInt(idAutor));
            model.addAttribute("autores", this.autorService.mostrarTodos());
            return "/autor/autores";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Eliminar Autor. (" + e.getMessage() + ")");
            return "error";
        }

    }

    @GetMapping("/autores/editar")
    public String editAuthor(@RequestParam( name = "editIdAutor", required = true, defaultValue = "") String idAutor, Model model){

        try {
            model.addAttribute("autor", this.autorService.buscarPorId(Integer.parseInt(idAutor)).get());
            return "/autor/editarAutor";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Edición. (" + e.getMessage() + ")");
            return "error";
        }

    }

    @PostMapping("/autores/editar")
    public String editedAuthor(@Valid Autor autor, Model model){

        try {
            this.autorService.actualizar(autor);
            model.addAttribute("autores", this.autorService.mostrarTodos());
            return "/autor/autores";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Editar Autor. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @GetMapping("/autores/registrar")
    public String registerAuthor(Model model){
        try {
            model.addAttribute("autor", new Autor());
            return "/autor/registroAutor";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Registro. (" + e.getMessage() + ")");
            return "error";
        }
    }

     @PostMapping("/autores/registrar")
    public String registeredAuthor(@Valid Autor autor, Model model){
        try {
            this.autorService.guardar(autor);
            model.addAttribute("autores", this.autorService.mostrarTodos());
            return "/autor/autores";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Registrar Autor. (" + e.getMessage() + ")");
            return "error";
        }
     }

}
