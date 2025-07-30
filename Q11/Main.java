/* Constants and Final Keyword
Q11: Write a program using final keyword to define a constant PI = 3.14159 and use it to calculate the area and circumference of a circle. Take radius as input.
Ans) JAVA CODE: */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    final double PI = 3.14159;      
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius: ");
    double r = sc.nextDouble();
    double area = PI*r*r;
    double circumference = 2*PI*r;
    System.out.println("Area = " + area);
    System.out.println("Circumference = " + circumference);
  }
}
