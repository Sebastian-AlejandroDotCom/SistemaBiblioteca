package com.biblioteca.controller;

import com.biblioteca.dto.Editorial;
import com.biblioteca.service.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    @GetMapping("/editoriales")
    public String showPublishers(@RequestParam(name = "searchIdEditorial", required = false, defaultValue = "") String idEditorial, Model model){

        if(idEditorial.isEmpty()){
            model.addAttribute("editoriales", this.editorialService.mostrarTodas());
        }else{
            model.addAttribute("editoriales", this.editorialService.buscar(Integer.parseInt(idEditorial)));
        }

        return "/editorial/editoriales";
    }

    @GetMapping("/editoriales/editar")
    public String editEditorial(@RequestParam(name = "editIdEditorial", required = false, defaultValue = "") String idEditorial, Model model){

        if(!idEditorial.isEmpty()){
            model.addAttribute("editorial", this.editorialService.buscar(Integer.parseInt(idEditorial)));
        }
        return "/editorial/editarEditorial";
    }

    @PostMapping("/editoriales/editar")
    public String editedEditorial(@Valid Editorial editorial, Model model){

        this.editorialService.actualizar(editorial);
        model.addAttribute("editoriales", this.editorialService.mostrarTodas());
        return "/editorial/editoriales";
    }

    @GetMapping("/editoriales/registrar")
    public String registerEditorial(Model model){

        model.addAttribute("editorial", new Editorial());
        return "/editorial/registroEditorial";
    }

    @PostMapping("/editoriales/registrar")
    public String registeredEditorial(@Valid Editorial editorial, Model model){

        this.editorialService.guardar(editorial);
        model.addAttribute("editoriales", this.editorialService.mostrarTodas());
        return "/editorial/editoriales";
    }

    @GetMapping("/editoriales/eliminar")
    public String deleteEditorial(@RequestParam(name = "deleteIdEditorial", required = false, defaultValue = "") String idEditorial, Model model){

        this.editorialService.eliminar(Integer.parseInt(idEditorial));
        model.addAttribute("editoriales", this.editorialService.mostrarTodas());
        return "/editorial/editoriales";
    }
}
