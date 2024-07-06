package com.example.demo.cadastrousuarios.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cadastrousuarios.model.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
