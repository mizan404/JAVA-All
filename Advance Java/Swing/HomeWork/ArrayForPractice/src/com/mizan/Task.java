package com.mizan;

import java.time.LocalDate;
import java.util.Objects;

class Task {
    private String description;
    private LocalDate dueDate;
    private Priority priority;

    public Task(String description, LocalDate dueDate, Priority priority) {
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return description.equals(task.description) &&
                dueDate.equals(task.dueDate) &&
                priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dueDate, priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                '}';
    }
}

enum Priority {HIGH, MEDIUM, LOW};
