// Scenario 1:
// A teacher wants to manage a list of student names, allowing addition, removal, and display of names.
// Creates an ArrayList to store student names. Demonstrate add(), add(index, element), remove(), contains(), and size() methods.
// Show how to insert an element at a specific index and check for an element's presence.

import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Anil");
        students.add("Sunil");
        students.add("Ram");
        students.add(1, "Raghu");
        System.out.println("Student List: " + students);
        students.remove("Ram");
        boolean hasAnil = students.contains("Anil");
        System.out.println("Is Anil in the list? " + hasAnil);
        System.out.println("Total students: " + students.size());
    }
}