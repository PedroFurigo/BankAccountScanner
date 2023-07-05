package edu.funtec.Display;

import edu.funtec.newaccount.NewAccount;
import edu.funtec.tools.Terminal;

/**
 * The Display class represents the main program for displaying account information.
 */
public class Display {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        NewAccount newAccount = terminal.collectAccountInformation();

        // Use the functions of the NewAccount class
        newAccount.withdraw(100);  // Example withdrawal of $100
        newAccount.deposit(200);   // Example deposit of $200
        newAccount.calculateEarnings();  // Calculate earnings
        newAccount.displayInformation();  // Display account information

        terminal.closeScanner();
    }
}
