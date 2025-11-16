package org.anton.taskmanager.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private final UUID id;
    private final String title;
    private final String description;
    private final LocalDateTime createdAt;
    private final LocalDate deadlineDate;
    private final Status status;
    private final Priority priority;

    public Task(String title, String description, LocalDate deadlineDate, Priority priority) {
        this.title = title;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.priority = priority;
        id = UUID.randomUUID();
        createdAt = LocalDateTime.now();
        status = Status.TODO;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDate getDeadlineDate() {
        return deadlineDate;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", priority=" + priority +
                ", deadlineDate=" + deadlineDate +
                '}';
    }
}
