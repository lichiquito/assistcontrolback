package com.example.assistcontrolback.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipocontrato")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameContract;

    // Constructors, Getters, and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameContract() {
        return nameContract;
    }

    public void setNameContract(String nameContract) {
        this.nameContract = nameContract;
    }

}
