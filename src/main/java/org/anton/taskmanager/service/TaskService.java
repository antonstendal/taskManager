package org.anton.taskmanager.service;

import org.anton.taskmanager.model.Priority;
import org.anton.taskmanager.model.Status;
import org.anton.taskmanager.model.Task;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    Task create(String title, String description, LocalDate deadlineDate, Priority priority);
    List<Task> getAll();
    Optional<Task> getById(UUID id);
    boolean delete(UUID id);
    Optional<Task> updateStatus(UUID id, String newStatus);
    List<Task> filterByStatus(Status status);
    List<Task> filterByPriority(Priority priority);
}
