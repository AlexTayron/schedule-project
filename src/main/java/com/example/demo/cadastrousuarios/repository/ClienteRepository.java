// src/main/java/com/example/demo/cadastrousuarios/repository/ClienteRepository.java
package com.example.demo.cadastrousuarios.repository;

import com.example.demo.cadastrousuarios.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
