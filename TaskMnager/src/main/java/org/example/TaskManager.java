
        package org.example;

import java.util.*;

class InvalidTaskException extends Exception {
    public InvalidTaskException(String message) {
        super(message);
    }
}

public class TaskManager {
    private ArrayList<String> tasks;
    private LinkedList<String> linkedTasks;

    public TaskManager() {
        tasks = new ArrayList<>();
        linkedTasks = new LinkedList<>();
    }

    public void addTask(String task) throws InvalidTaskException {
        if (task == null || task.trim().isEmpty()) {
            throw new InvalidTaskException("Error: Task cannot be null or empty");
        }
        tasks.add(task);
        linkedTasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void sortTasks() {
        Collections.sort(tasks);
        System.out.println("Tasks sorted alphabetically.");
    }

    public void searchTask(String search) {
        int index = tasks.indexOf(search);
        if (index >= 0) {
            System.out.println("Task found at index: " + index);
        } else {
            System.out.println("Task not found.");
        }
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            linkedTasks.remove(task);
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found to remove.");
        }
    }

    public void findLongestTask() {
        String longest = "";
        for (String task : tasks) {
            if (task.length() > longest.length()) {
                longest = task;
            }
        }
        System.out.println("Longest task: " + longest);
    }

    public void getTaskByIndex(int index) {
        try {
            System.out.println("Task at index " + index + ": " + tasks.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        }
    }

    public void displayAllTasks() {
        System.out.println("All Tasks: " + tasks);
    }
}