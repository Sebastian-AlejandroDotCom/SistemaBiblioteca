package com.biblioteca.service;

import com.biblioteca.dao.EditorialDAO;
import com.biblioteca.dto.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {

    @Autowired
    private EditorialDAO editorialDAO;

    public Iterable<Editorial> mostrarTodas () {
        return this.editorialDAO.findAll();
    }

    public Editorial buscar(Integer id){
        return this.editorialDAO.findById(id).get();
    }

    public void eliminar(Integer id){
        this.editorialDAO.deleteById(id);
    }

    public void actualizar(Editorial editorial){
        this.editorialDAO.save(editorial);
    }

    public void guardar(Editorial editorial){
        this.editorialDAO.save(editorial);
    }
}

