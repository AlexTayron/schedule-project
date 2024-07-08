package com.example.demo.cadastrousuarios.repository;

import com.example.demo.cadastrousuarios.model.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
}
