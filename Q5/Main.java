/* Q5: Accept a character from the user and display its ASCII value. Also convert that ASCII value into an integer.
Ans) JAVA CODE: */

import java.util.Scanner;

public class AsciiValueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);     

        int ascii = (int) ch;                  

        System.out.println("Character entered: " + ch);
        System.out.println("ASCII value:       " + ascii);
    }
}


