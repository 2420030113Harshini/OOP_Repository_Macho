/* Operator Precedence
Q6: Evaluate and print the result of the following expressions:

10 + 2 * 5

(10 + 2) * 5

100 / 5 + 2 * 3 - 4
Explain the results based on operator precedence and associativity.
Ans) JAVA CODE: */
 
public class Main {
    public static void main(String[] args) {
        System.out.println(10 + 2 * 5);       
        System.out.println((10 + 2) * 5);    
        System.out.println(100 / 5 + 2 * 3 - 4); 
    }
}

// Explanation: Here, in the expression, the calculation process follows the operation precedence where the highest priority is given to parentheses first (), next to Multiplication, division, modulus (*,/,%) and next the priority is given to addition and subtraction (+,-) and finally the lowest priority is given to the assignment operator (=).