package org.example;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        try {
            manager.addTask("Finish homework");
            manager.addTask("Read a book");
            manager.addTask("Go shopping");
            manager.addTask(""); // Invalid input
        } catch (InvalidTaskException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finished task input attempt.");
        }

        manager.displayAllTasks();
        manager.sortTasks();
        manager.displayAllTasks();

        manager.searchTask("Read a book");
        manager.searchTask("Go jogging");

        manager.removeTask("Go shopping");
        manager.removeTask("Sleep");

        manager.findLongestTask();

        manager.getTaskByIndex(1);
        manager.getTaskByIndex(5); // Invalid index
    }
}