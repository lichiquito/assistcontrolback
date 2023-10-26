package com.example.assistcontrolback.Service;

import com.example.assistcontrolback.Model.WorkerPosition;

import java.util.List;
import java.util.Optional;

public interface WorkerPositionService {
    WorkerPosition createWorkerPosition(WorkerPosition workerPosition);

    List<WorkerPosition> getAllWorkerPosition();

    Optional<WorkerPosition> getWorkerPositionById(Long id);

    WorkerPosition updateWorkerPosition(Long id, WorkerPosition workerPositionDetails);

    void deleteAllWorkerPosition();

    void deleteWorkerPosition(Long id);
}
