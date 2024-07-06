package com.example.demo.cadastrousuarios.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.cadastrousuarios.model.SubCategory;

import com.example.demo.cadastrousuarios.service.SubCategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/subCategories")
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    @PostMapping
    public SubCategory createSubCategory(@RequestBody SubCategory subCategory) {
        return subCategoryService.saveSubCategory(subCategory);
    }

    @GetMapping
    public List<SubCategory> getAllSubcategories() {
        return subCategoryService.getAllSubCategories();
    }

    @DeleteMapping("/{id}")
    public void deleteSubCategory(@PathVariable Long id) {
        subCategoryService.deleteSubCategory(id);
    }
}
