package com.example.demo.cadastrousuarios.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cadastrousuarios.model.Expense;
import com.example.demo.cadastrousuarios.repository.ExpenseRepository;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
