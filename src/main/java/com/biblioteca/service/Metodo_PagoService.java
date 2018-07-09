package com.biblioteca.service;

import com.biblioteca.dao.Metodo_PagoDAO;
import com.biblioteca.dto.Metodo_Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Metodo_PagoService {

    @Autowired
    private Metodo_PagoDAO metodo_pagoDAO;

    public Iterable<Metodo_Pago> mostrarTodos() {
        return this.metodo_pagoDAO.findAll();
    }

    public Optional<Metodo_Pago> buscarPorId(Integer id){
        return this.metodo_pagoDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.metodo_pagoDAO.deleteById(id);
    }

    public void actualizar(Metodo_Pago metodo_pago){
        this.metodo_pagoDAO.save(metodo_pago);
    }

    public void guardar(Metodo_Pago metodo_pago){
        this.metodo_pagoDAO.save(metodo_pago);
    }
}
