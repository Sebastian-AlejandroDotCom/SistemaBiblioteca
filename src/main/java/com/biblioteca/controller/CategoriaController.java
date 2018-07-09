package com.biblioteca.controller;


import com.biblioteca.dto.Categoria;
import com.biblioteca.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("categorias")
    public String showCategories(@RequestParam(name = "searchIdCategoria", required = false, defaultValue = "") String idCategoria, Model model){

        if(idCategoria.isEmpty()){
            try{
                model.addAttribute("categorias", this.categoriaService.mostrarTodos());
                return "/categoria/categorias";
            }catch (Exception e){
                model.addAttribute("msj", "No se ha podido cargar la lista de Categorias. (" + e.getMessage() + ")");
                return "error";
            }
        }else{
            try{
                model.addAttribute("categorias", this.categoriaService.buscarPorId(Integer.parseInt(idCategoria)).get());
                return "/categoria/categorias";
            }catch (Exception e){
                model.addAttribute("msj", "Id de Categoría no Encontrado. (" + e.getMessage() + ")");
                return "error";
            }
        }
    }

    @GetMapping("/categorias/editar")
    public String editCategory(@RequestParam(name = "editIdCategoria", required = false, defaultValue = "") String idCategoria, Model model){
        try{
            model.addAttribute("categoria", this.categoriaService.buscarPorId(Integer.parseInt(idCategoria)).get());
            return "/categoria/editarCategoria";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Edición. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @PostMapping("/categorias/editar")
    public String editedCategory(@Valid Categoria categoria, Model model){

        try{
            this.categoriaService.actualizar(categoria);
            model.addAttribute("categorias", this.categoriaService.mostrarTodos());
            return "/categoria/categorias";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Editar Categoría. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @GetMapping("/categorias/registrar")
    public String registerCategory(Model model){
        try{
            model.addAttribute("categoria", new Categoria());
            return "/categoria/registroCategoria";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido cargar la vista de Registro. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @PostMapping("/categorias/registrar")
    public String registeredCategory(@Valid Categoria categoria, Model model){
        try{
            this.categoriaService.guardar(categoria);
            model.addAttribute("categorias", this.categoriaService.mostrarTodos());
            return "/categoria/categorias";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Registrar Categoría. (" + e.getMessage() + ")");
            return "error";
        }
    }

    @GetMapping("/categorias/eliminar")
    public String deleteCategory(@RequestParam(name = "deleteIdCategoria", required = false, defaultValue = "") String idCategoria, Model model){
        try {
            this.categoriaService.elminarPorId(Integer.parseInt(idCategoria));
            model.addAttribute("categorias", this.categoriaService.mostrarTodos());
            return "/categoria/categorias";
        }catch (Exception e){
            model.addAttribute("msj", "No se ha podido Eliminar Categoria. (" + e.getMessage() + ")");
            return "error";
        }
    }
}
