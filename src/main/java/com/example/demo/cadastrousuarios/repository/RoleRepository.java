package com.example.demo.cadastrousuarios.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cadastrousuarios.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
