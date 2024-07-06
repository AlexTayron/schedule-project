package com.example.demo.cadastrousuarios.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cadastrousuarios.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
