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
            try {
                model.addAttribute("editoriales", this.editorialService.mostrarTodas());
                return "/editorial/editoriales";
            }catch (Exception e){
                model.addAttribute("msj", "No se ha podido cargar la lista de Editoriales. (" + e.getMessage() + ")");
                return "error";
            }
        }else{
            try {
                model.addAttribute("editoriales", this.editorialService.buscar(Integer.parseInt(idEditorial)));
                return "/editorial/editoriales";
            }
            catch (Exception e){
                model.addAttribute("msj", "Id de Editorial no Encontrado. (" + e.getMessage() + ")");
                return "error";
            }
        }
    }

    @GetMapping("/editoriales/editar")
    public String editEditorial(@RequestParam(name = "editIdEditorial", required = false, defaultValue = "") String idEditorial, Model model){

        try{
            model.addAttribute("editorial", this.editorialService.buscar(Integer.parseInt(idEditorial)));
            return "/editorial/editarEditorial";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Edición. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @PostMapping("/editoriales/editar")
    public String editedEditorial(@Valid Editorial editorial, Model model){

        try {
            this.editorialService.actualizar(editorial);
            model.addAttribute("editoriales", this.editorialService.mostrarTodas());
            return "/editorial/editoriales";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Editar Editorial. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @GetMapping("/editoriales/registrar")
    public String registerEditorial(Model model){

        try {
            model.addAttribute("editorial", new Editorial());
            return "/editorial/registroEditorial";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Registro. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @PostMapping("/editoriales/registrar")
    public String registeredEditorial(@Valid Editorial editorial, Model model){

        try {
            this.editorialService.guardar(editorial);
            model.addAttribute("editoriales", this.editorialService.mostrarTodas());
            return "/editorial/editoriales";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Registrar Editorial. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @GetMapping("/editoriales/eliminar")
    public String deleteEditorial(@RequestParam(name = "deleteIdEditorial", required = false, defaultValue = "") String idEditorial, Model model){

        try {
            this.editorialService.eliminar(Integer.parseInt(idEditorial));
            model.addAttribute("editoriales", this.editorialService.mostrarTodas());
            return "/editorial/editoriales";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Eliminar Editorial. (" + e.getMessage() + ")");
            return "error";
        }
    }
}
