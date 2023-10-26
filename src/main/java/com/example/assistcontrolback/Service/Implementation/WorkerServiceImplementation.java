package com.example.assistcontrolback.Service.Implementation;

import com.example.assistcontrolback.Model.User;
import com.example.assistcontrolback.Model.Worker;
import com.example.assistcontrolback.Repository.UserRepository;
import com.example.assistcontrolback.Repository.WorkerRepository;
import com.example.assistcontrolback.Service.UserService;
import com.example.assistcontrolback.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerServiceImplementation implements WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    // Create a new worker
    public Worker createWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    // Get all workers
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    // Get worker by ID
    public Optional<Worker> getWorkerById(Long id) {
        return workerRepository.findById(id);
    }

    // Update worker
    public Worker updateWorker(Long id, Worker workerDetails) {
        Optional<Worker> worker = workerRepository.findById(id);
        if (worker.isPresent()) {
            Worker existingWorker = worker.get();
            existingWorker.setName(workerDetails.getName());
            existingWorker.setEmail(workerDetails.getEmail());
            existingWorker.setContract(workerDetails.getContract());
            existingWorker.setWorkerPosition(workerDetails.getWorkerPosition());
            return workerRepository.save(existingWorker);
        }
        return null;
    }

    // Delete all workers
    public void deleteAllWorkers() {
        workerRepository.deleteAll();
    }

    // Delete worker
    public void deleteWorker(Long id) {
        workerRepository.deleteById(id);
    }
}
