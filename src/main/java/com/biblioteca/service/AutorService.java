package com.biblioteca.service;

import com.biblioteca.dao.AutorDAO;
import com.biblioteca.dto.Autor;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorDAO autorDAO;

    public Iterable<Autor> mostrarTodos() {
        return this.autorDAO.findAll();
    }

    public Optional<Autor> buscarPorId(Integer id){
        try{
            return this.autorDAO.findById(id);
        }catch (ExceptionService e){
            throw new ExceptionService(e.getMessage());
        }
    }

    public void elminarPorId(Integer id){
        this.autorDAO.deleteById(id);
    }

    public void actualizar(Autor autor){
        this.autorDAO.save(autor);
    }

    public void guardar(Autor autor){
        this.autorDAO.save(autor);
    }
}
