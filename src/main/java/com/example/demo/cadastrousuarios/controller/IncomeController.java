package com.example.demo.cadastrousuarios.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.cadastrousuarios.model.Income;
import com.example.demo.cadastrousuarios.service.IncomeService;

import java.util.List;

@RestController
@RequestMapping("/incomes")
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @PostMapping
    public Income createIncome(@RequestBody Income income) {
        return incomeService.saveIncome(income);
    }

    @GetMapping
    public List<Income> getAllIncomes() {
        return incomeService.getAllIncomes();
    }

    @GetMapping("/{id}")
    public Income getIncomeById(@PathVariable Long id) {
        return incomeService.getIncomeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteIncome(@PathVariable Long id) {
        incomeService.deleteIncome(id);
    }
}
