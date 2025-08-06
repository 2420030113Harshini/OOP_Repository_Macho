/* Q12: Declare a final variable and try modifying it (intentionally). Observe and explain the compile-time error.
Ans) JAVA CODE: */
/* original correct code
public class Main {
  public static void main(String[] args) {
    int x = 10;
    x = 20;      
    System.out.println("x = " + x);
  }
}
*/ 
//Modified code
public class Main {
  public static void main(String[] args) {
    final int x = 10;
    x = 20;      
    System.out.println("x = " + x);
  }
}