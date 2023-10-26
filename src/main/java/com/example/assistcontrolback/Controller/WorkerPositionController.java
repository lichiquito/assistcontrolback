package com.example.assistcontrolback.Controller;

import com.example.assistcontrolback.Model.Contract;
import com.example.assistcontrolback.Model.WorkerPosition;
import com.example.assistcontrolback.Service.ContractService;
import com.example.assistcontrolback.Service.WorkerPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargo")
public class WorkerPositionController {
    @Autowired
    private WorkerPositionService workerPositionService;

    // Create a new position for workers
    @PostMapping
    public WorkerPosition createWorkerPosition(@RequestBody WorkerPosition workerPosition) {
        return workerPositionService.createWorkerPosition(workerPosition);
    }

    // Get all positions for workers
    @GetMapping
    public List<WorkerPosition> getAllWorkerPositions() {
        return workerPositionService.getAllWorkerPosition();
    }

    // Get position for workers by ID
    @GetMapping("/{cargoid}")
    public Optional<WorkerPosition> getWorkerPositionById(@PathVariable Long id) {
        return workerPositionService.getWorkerPositionById(id);
    }

    // Update position for worker by ID
    @PutMapping("/{cargoid}")
    public WorkerPosition updateWorkerPosition(@PathVariable Long id, @RequestBody WorkerPosition workerPositionDetails) {
        return workerPositionService.updateWorkerPosition(id, workerPositionDetails);
    }

    // Delete all positions for workers
    @DeleteMapping
    public String deleteAllWorkerPosition() {
        workerPositionService.deleteAllWorkerPosition();
        return "All users have been deleted successfully.";
    }

    // Delete position for workers by ID
    @DeleteMapping("/{cargoid}")
    public void deleteWorkerPosition(@PathVariable Long id) {
        workerPositionService.deleteWorkerPosition(id);
    }
}