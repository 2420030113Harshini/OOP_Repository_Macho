/* Q4: Write a program to demonstrate narrowing type conversion from double to int. Accept a double input and cast it to int. Print both values.
Ans) JAVA CODE: */

public class Main {
  public static void main(String[] args) {
    double a = 25633d;
    int mya = (int) a;  
    System.out.println("Double value: " + a);
    System.out.println("Int value:    " + mya);
  }
}
