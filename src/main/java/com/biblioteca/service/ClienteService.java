package com.biblioteca.service;

import com.biblioteca.dao.ClienteDAO;
import com.biblioteca.dto.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    public Iterable<Cliente> mostrarTodos() {
        return this.clienteDAO.findAll();
    }

    public Optional<Cliente> buscarPorId(Integer id){
        return this.clienteDAO.findById(id);
    }

    public void elminarPorId(Integer id){
        this.clienteDAO.deleteById(id);
    }

    public void actualizar(Cliente cliente){
        this.clienteDAO.save(cliente);
    }

    public void guardar(Cliente cliente){
        this.clienteDAO.save(cliente);
    }
}
