package com.example.demo.cadastrousuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.cadastrousuarios.model.ServiceEntity;
import com.example.demo.cadastrousuarios.repository.ServiceRepository;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public ServiceEntity saveService(ServiceEntity service) {
        return serviceRepository.save(service);
    }

    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }

    public ServiceEntity getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
