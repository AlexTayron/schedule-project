
package com.example.demo.cadastrousuarios.model;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ServiceEntity serviceEntity;

    private double valor;
    private Date data;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ServiceEntity getService() {
        return serviceEntity;
    }
    public void setService(ServiceEntity serviceEntity) {
        this.serviceEntity = serviceEntity;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    // Getters e setters
}
