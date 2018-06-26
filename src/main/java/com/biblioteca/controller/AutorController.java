package com.biblioteca.controller;

import com.biblioteca.dto.Autor;
import com.biblioteca.service.AutorService;
import com.biblioteca.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.NoSuchElementException;

@Controller
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/autores")
    public String showAuthors(@RequestParam( name = "searchIdAutor", required = false, defaultValue = "")String idAutor, Model model) throws NoSuchElementException{

        if(idAutor.isEmpty()){
            model.addAttribute("autores", this.autorService.mostrarTodos());
            return "/autor/autores";
        }else {

            try {
                model.addAttribute("autores", this.autorService.buscarPorId(Integer.parseInt(idAutor)).get());
                return "/autor/autores";
            }catch(NoSuchElementException e){
                model.addAttribute("msj", "Id de Usuario no Encontrado (" + e.getMessage() + ")");
                return "error";
            }
        }
    }

    @GetMapping("/autores/eliminar")
    public String deleteAuthor(@RequestParam( name = "deleteIdAutor", required = false, defaultValue = "") String idAutor, Model model){

        this.autorService.elminarPorId(Integer.parseInt(idAutor));
        model.addAttribute("autores", this.autorService.mostrarTodos());

        return "/autor/autores";
    }

    @GetMapping("/autores/editar")
    public String editAuthor(@RequestParam( name = "editIdAutor", required = false, defaultValue = "") String idAutor, Model model){

        if(!idAutor.isEmpty()){
            model.addAttribute("autor", this.autorService.buscarPorId(Integer.parseInt(idAutor)));
        }

        return "/autor/editarAutor";
    }

    @PostMapping("/autores/editar")
    public String editedAuthor(@Valid Autor autor, Model model){

        this.autorService.actualizar(autor);
        model.addAttribute("autores", this.autorService.mostrarTodos());

        return "/autor/autores";
    }

    @GetMapping("/autores/registrar")
    public String registerAuthor(Model model){
        model.addAttribute("autor", new Autor());
        return "/autor/registroAutor";
    }

     @PostMapping("/autores/registrar")
    public String registeredAuthor(@Valid Autor autor, Model model){
        this.autorService.guardar(autor);
        model.addAttribute("autores", this.autorService.mostrarTodos());
        return "/autor/autores";
     }

}
