/* Static variables, Static block and Static mathods:
Q13. Write a Java program to demonstrate the use of static keyword in the context of a student management system,
which includes: A static variable to represent the college name shared by all students,A static block to initialize the static variable.
A static method to change the college name and an Instance variables to store student ID and name.
Ans) JAVA CODE: */

public class Student {
    static String collegeName;
    static {
        collegeName = "K L H University";
        System.out.println("Static Block Initialized: College is set to " + collegeName);
    }

      int studentID;
    String studentName;

        public Student(int id, String name) {
        this.studentID = id;
        this.studentName = name;
    }
    public static void changeCollegeName(String newCollegeName) {
        collegeName = newCollegeName;
        System.out.println("College name updated to: " + collegeName);
    }
    public void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
    }
    public static void main(String[] args) {

        Student s1 = new Student(30101, "Alice Sharma");
        Student s2 = new Student(30102, "Bob Gupta");

        s1.displayDetails();
        s2.displayDetails();
        Student.changeCollegeName("Global University");
        s1.displayDetails();
        s2.displayDetails();
    }
}

