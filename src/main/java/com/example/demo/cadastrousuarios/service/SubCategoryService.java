package com.example.demo.cadastrousuarios.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cadastrousuarios.model.SubCategory;
import com.example.demo.cadastrousuarios.repository.SubCategoryRepository;

import java.util.List;

@Service
public class SubCategoryService {
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public SubCategory saveSubcategory(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    public List<SubCategory> getAllSubCategories() {
        return subCategoryRepository.findAll();
    }

    public void deleteSubCategory(Long id) {
        subCategoryRepository.deleteById(id);
    }

    public SubCategory saveSubCategory(SubCategory subCategory) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveSubCategory'");
    }
}
