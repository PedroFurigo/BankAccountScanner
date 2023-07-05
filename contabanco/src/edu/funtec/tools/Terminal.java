package edu.funtec.tools;

import java.util.Scanner;

import edu.funtec.newaccount.NewAccount;

/**
 * The Terminal class represents a terminal for collecting account information.
 */
public class Terminal {
    private Scanner sc = new Scanner(System.in);

    /**
     * Collects account information from the user.
     *
     * @return The created NewAccount object with the collected information.
     */
    public NewAccount collectAccountInformation() {
        System.out.println("What is your full name? ");
        String accountHolderName = sc.nextLine();
        System.out.println("What is your account number? ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your agency number? ");
        String agency = sc.nextLine();
        System.out.println("What is your balance? ");
        double balance = sc.nextDouble();
        sc.nextLine();
        System.out.println("What is your opening date account? ");
        String openingDate = sc.nextLine();

        return new NewAccount(accountHolderName, accountNumber, agency, balance, openingDate);
    }

    /**
     * Closes the scanner used for input.
     */
    public void closeScanner() {
        sc.close();
    }
}
