package com.example.assistcontrolback.Service;

import com.example.assistcontrolback.Model.Worker;

import java.util.List;
import java.util.Optional;

public interface WorkerService {
    Worker createWorker(Worker worker);

    List<Worker> getAllWorkers();

    Optional<Worker> getWorkerById(Long id);

    Worker updateWorker(Long id, Worker workerDetails);

    void deleteAllWorkers();

    void deleteWorker(Long id);
}
