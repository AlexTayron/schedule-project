package com.example.demo.cadastrousuarios.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cadastrousuarios.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
