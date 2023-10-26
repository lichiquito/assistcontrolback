package com.example.assistcontrolback.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Worker extends User{
    @OneToOne
    @JoinColumn(name = "cargo")
    private Contract contract;

    @OneToOne
    @JoinColumn(name = "tipocontrato")
    private WorkerPosition workerPosition;

    // Constructors, Getters, and Setters

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public WorkerPosition getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(WorkerPosition workerPosition) {
        this.workerPosition = workerPosition;
    }
}
