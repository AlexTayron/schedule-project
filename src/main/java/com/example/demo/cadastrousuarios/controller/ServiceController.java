package com.example.demo.cadastrousuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.cadastrousuarios.model.ServiceEntity;
import com.example.demo.cadastrousuarios.service.ServiceService;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @PostMapping
    public ServiceEntity createService(@RequestBody ServiceEntity service) {
        return serviceService.saveService(service);
    }

    @GetMapping
    public List<ServiceEntity> getAllServices() {
        return serviceService.getAllServices();
    }

    @GetMapping("/{id}")
    public ServiceEntity getServiceById(@PathVariable Long id) {
        return serviceService.getServiceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
    }
}
