// Scenario 3:
// A user wants to manage a to-do list, allowing tasks to be added, marked as completed (removed), and sorted.
// Use ArrayList to manage a to-do list. Demonstrate add(), remove(), get(), isEmpty(), and sorting with Collections.sort().
// Show how to retrieve an element by index and check if the list is empty.


import java.util.ArrayList;
import java.util.Collections;

public class ToDoListManager {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Buy groceries");
        toDoList.add("Finish project");
        String task = toDoList.get(1);
        System.out.println("Task at index 1: " + task);
        toDoList.remove("Buy groceries");
        Collections.sort(toDoList);
        System.out.println("Sorted To-Do List: " + toDoList);
        System.out.println("Is the to-do list empty? " + toDoList.isEmpty());
    }
}