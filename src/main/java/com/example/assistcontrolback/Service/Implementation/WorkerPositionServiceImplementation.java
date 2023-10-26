package com.example.assistcontrolback.Service.Implementation;

import com.example.assistcontrolback.Model.Contract;
import com.example.assistcontrolback.Model.WorkerPosition;
import com.example.assistcontrolback.Repository.ContractRepository;
import com.example.assistcontrolback.Repository.WorkerPositionRepository;
import com.example.assistcontrolback.Service.ContractService;
import com.example.assistcontrolback.Service.WorkerPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerPositionServiceImplementation implements WorkerPositionService {
    @Autowired
    private WorkerPositionRepository workerPositionRepository;

    // Create a new position for workers
    public WorkerPosition createWorkerPosition(WorkerPosition workerPosition) {
        return workerPositionRepository.save(workerPosition);
    }

    // Get all positions for workers
    public List<WorkerPosition> getAllWorkerPosition() {
        return workerPositionRepository.findAll();
    }

    // Get position for worker by ID
    public Optional<WorkerPosition> getWorkerPositionById(Long id) {
        return workerPositionRepository.findById(id);
    }

    // Update position for worker
    public WorkerPosition updateWorkerPosition(Long id, WorkerPosition workerPositionDetails) {
        Optional<WorkerPosition> workerPosition = workerPositionRepository.findById(id);
        if (workerPosition.isPresent()) {
            WorkerPosition existingWorkerPosition = workerPosition.get();
            existingWorkerPosition.setNamePosition(workerPositionDetails.getNamePosition());
            return workerPositionRepository.save(existingWorkerPosition);
        }
        return null;
    }

    // Delete all positions for workers
    public void deleteAllWorkerPosition() {
        workerPositionRepository.deleteAll();
    }

    // Delete position for worker
    public void deleteWorkerPosition(Long id) {
        workerPositionRepository.deleteById(id);
    }
}
