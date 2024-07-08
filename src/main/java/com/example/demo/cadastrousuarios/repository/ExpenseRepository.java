package com.example.demo.cadastrousuarios.repository;

import com.example.demo.cadastrousuarios.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
