class Person {
    void showDetails() {
        System.out.println("Person details");
    }
}

class Admin extends Person {
    @Override
    void showDetails() {
        System.out.println("Admin details");
    }
}

class Student extends Person {
    @Override
    void showDetails() {
        System.out.println("Student details");
    }
}

class Faculty extends Person {
    @Override
    void showDetails() {
        System.out.println("Faculty details");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Admin();
        Person p2 = new Student();
        Person p3 = new Faculty();

        p1.showDetails(); 
        p2.showDetails(); 
        p3.showDetails(); 
    }
}