package com.example.demo.cadastrousuarios.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cadastrousuarios.model.Category;
import com.example.demo.cadastrousuarios.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
