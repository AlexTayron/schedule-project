package com.example.demo.cadastrousuarios.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cadastrousuarios.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
