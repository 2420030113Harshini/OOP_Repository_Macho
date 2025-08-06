package tasks;
import java.util.*;

class Student{
	String name;
	int Rollno;
	int[] marks;

		void setter(String name, int Rollno, int[] marks)
	{
		this.name = name;
		this.Rollno = Rollno;
		this.marks = marks;
		
	}
		
	void getter()
	{
		System.out.println("Student name: " + name);
		System.out.println("Rollno: " + Rollno);
		System.out.println("Marks of Student:  " );
		  for (int marks : marks) {
		        System.out.print(marks + " ");
		    }
		
	}
}

public class Task1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Student name: ");
	String name = sc.next();
	
	System.out.println("Enter Rollno: ");
	int Rollno = sc.nextInt();
	
    System.out.print("Enter number of subjects: ");
    int n = sc.nextInt();
    int[] marks = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Enter mark for subject " + (i + 1) + ": ");
        marks[i] = sc.nextInt();
    }
	
    
	Student st = new Student();
	st.setter(name,Rollno,marks);
	st.getter();
	sc.close();
}
}
