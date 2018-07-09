package com.biblioteca.service;

import com.biblioteca.dao.VentaDAO;
import com.biblioteca.dto.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaDAO ventaDAO;

    public Iterable<Venta> mostrarTodos() {
        return this.ventaDAO.findAll();
    }

    public Optional<Venta> buscarPorId(Integer id){
        return this.ventaDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.ventaDAO.deleteById(id);
    }

    public void actualizar(Venta venta){
        this.ventaDAO.save(venta);
    }

    public void guardar(Venta venta){
        this.ventaDAO.save(venta);
    }
}
