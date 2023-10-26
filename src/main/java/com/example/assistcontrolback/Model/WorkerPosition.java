package com.example.assistcontrolback.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "cargo")
public class WorkerPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String namePosition;

    // Constructors, Getters, and Setters
    public Long getId() { return id; }

    public void setId(Long id) {
            this.id = id;
        }

    public String getNamePosition() {
            return namePosition;
        }

    public void setNamePosition(String namePosition) {
            this.namePosition = namePosition;
        }

}

