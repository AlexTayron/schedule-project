package com.example.demo.cadastrousuarios.repository;

import com.example.demo.cadastrousuarios.model.UserRole;
import com.example.demo.cadastrousuarios.model.UserRoleId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleId> {
}
