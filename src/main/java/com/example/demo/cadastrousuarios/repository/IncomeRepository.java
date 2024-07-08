package com.example.demo.cadastrousuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cadastrousuarios.model.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
