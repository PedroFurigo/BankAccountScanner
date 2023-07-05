package edu.funtec.tools;

import edu.funtec.newaccount.*;
import java.util.Scanner;

/**
 * The Menu class represents a menu for performing account operations.
 */
public class Menu {
    /**
     * Displays the menu and performs the selected account operation.
     */
    public void menu() {
        Scanner sc = new Scanner(System.in);
        Terminal terminal = new Terminal();
        NewAccount newAccount = terminal.collectAccountInformation();
        int operator = 4;
        
        while (operator != 0) {
            System.out.println("""
                    
                    --------------------Menu--------------------
                    1 - Withdraw
                    2 - Deposit
                    3 - Calculate Earnings
                    0 - Exit
                    """);
            
            operator = sc.nextInt();
            sc.nextLine();
            
            switch (operator) {
                case 1:
                    System.out.println("What's the value you want to withdraw? ");
                    double withdrawAmount = sc.nextDouble();
                    newAccount.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("What's the value you want to deposit? ");
                    double depositAmount = sc.nextDouble();
                    newAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("What's the percentage you want to calculate? ");
                    double earningsPercentage = sc.nextDouble();
                    newAccount.calculateEarnings(earningsPercentage);
                    break;
                case 0:
                    operator = 0;
                    break;
            }
        }
        
        sc.close();
    }
}
