/* A method to display student details, including the shared college name.
Q14.Write a Java program to demonstrate a Scenario of banking system, use static keyword through the scenario.
Static variables – to represent values shared among all objects,A static block – to initialize static data when the class is loaded,
Static methods – to operate on static data,Use Instance variables and methods – to represent object-specific data.
Ans) JAVA CODE: */

public class BankAccount {
    static String bankName;
    static double interestRate;

    static {
        bankName = "State Bank of Java";
        interestRate = 3.5;
        System.out.println("Static Block: Bank Initialized as " + bankName);
        System.out.println("Static Block: Interest Rate set to " + interestRate + "%");
    }

    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accNo, String holder, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = initialBalance;
    }

    public void showDetails() {
        System.out.println("Account Number:   " + accountNumber);
        System.out.println("Account Holder:   " + accountHolder);
        System.out.println("Balance:          ₹" + balance);
        System.out.println("Bank Name:        " + bankName);
        System.out.println("Interest Rate:    " + interestRate + "%");
        System.out.println("-----------------------------------");
    }

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest Rate updated to: " + interestRate + "%");
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Arjun Reddy", 25000);
        BankAccount b2 = new BankAccount(102, "Sneha Patel", 45000);

        b1.showDetails();
        b2.showDetails();

        updateInterestRate(4.25);  

        b1.showDetails();
        b2.showDetails();
    }
}