/* Q15.Write a Java program to demonstrate the use of this keyword with variables and this() for constructor chaining. Create a Student class with id, name, and course.Use this() to call a parameterized constructor from the default constructor. Use this.variable to differentiate instance variables.Display student details using a method. Create two objects (one with default and one with parameterized constructor) and display their details.
Super Keyword
Ans) JAVA CODE: */

public class Student {
    int id;
    String name;
    String course;
    public Student() {
        this(1001, "Default Name", "Computer Science");
        System.out.println("Default constructor called.\n");
    }
    public Student(int id, String name, String course) {
        this.id = id;            
        this.name = name;
        this.course = course;
    }
    public void showDetails() {
        System.out.println("Student ID:      " + this.id);
        System.out.println("Student Name:    " + this.name);
        System.out.println("Student Course:  " + this.course);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();                              
        Student s2 = new Student(2023, "Sanjana Reddy", "Java");

        s1.showDetails();
        s2.showDetails();
    }
}