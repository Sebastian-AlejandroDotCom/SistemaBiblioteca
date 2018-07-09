package com.biblioteca.service;

import com.biblioteca.dao.Trabajador_CorreoDAO;
import com.biblioteca.dto.Trabajador_Correo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Trabajador_CorreoService {

    @Autowired
    private Trabajador_CorreoDAO trabajador_correoDAO;

    public Iterable<Trabajador_Correo> mostrarTodos() {
        return this.trabajador_correoDAO.findAll();
    }

    public Optional<Trabajador_Correo> buscarPorId(Integer id){
        return this.trabajador_correoDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.trabajador_correoDAO.deleteById(id);
    }

    public void actualizar(Trabajador_Correo trabajador_correo){
        this.trabajador_correoDAO.save(trabajador_correo);
    }

    public void guardar(Trabajador_Correo trabajador_correo){
        this.trabajador_correoDAO.save(trabajador_correo);
    }
}
