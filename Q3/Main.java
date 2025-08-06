/* Type Conversion (Widening & Narrowing)
Q3: Write a program to demonstrate widening type conversion from int → long → float. Show that no data is lost.
Ans) JAVA CODE: */

public class Main {
  public static void main(String[] args) {
    int a = 902123245;
    double mya = (int) a;
    float myb = (long) mya;
    System.out.println(a);
    System.out.println(mya);
    System.out.println(myb);
  }
}

