// src/main/java/com/example/demo/cadastrousuarios/service/ClienteService.java
package com.example.demo.cadastrousuarios.service;

import com.example.demo.cadastrousuarios.model.Cliente;
import com.example.demo.cadastrousuarios.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
