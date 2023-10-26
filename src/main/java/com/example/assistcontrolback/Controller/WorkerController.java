package com.example.assistcontrolback.Controller;

import com.example.assistcontrolback.Model.Worker;
import com.example.assistcontrolback.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    // Create a new user
    @PostMapping
    public Worker createWorker(@RequestBody Worker worker) {
        return workerService.createWorker(worker);
    }

    // Get all users
    @GetMapping
    public List <Worker> getAllWorkers() {
        return workerService.getAllWorkers();
    }

    // Get user by ID
    @GetMapping("/{empleadoid}")
    public Optional <Worker> getWorkerById(@PathVariable Long id) {
        return (workerService.getWorkerById(id));
    }

    // Update user by ID
    @PutMapping("/{empleadoid}")
    public Worker updateWorker(@PathVariable Long id, @RequestBody Worker workerDetails) {
        return workerService.updateWorker(id, workerDetails);
    }

    // Delete all users
    @DeleteMapping
    public String deleteAllWorkers() {
        workerService.deleteAllWorkers();
        return "All users have been deleted successfully.";
    }

    // Delete user by ID
    @DeleteMapping("/{empleadoid}")
    public void deleteWorker(@PathVariable Long id) {
        workerService.deleteWorker(id);
    }
}
