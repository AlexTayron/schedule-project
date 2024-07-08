package com.example.demo.cadastrousuarios.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cadastrousuarios.model.Income;
import com.example.demo.cadastrousuarios.repository.IncomeRepository;

import java.util.List;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;

    public Income saveIncome(Income income) {
        return incomeRepository.save(income);
    }

    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }

    public Income getIncomeById(Long id) {
        return incomeRepository.findById(id).orElse(null);
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }
}
