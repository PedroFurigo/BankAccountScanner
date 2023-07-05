package edu.funtec.newaccount;

/**
 * The class "NewAccount" represents a bank user.
 */
public class NewAccount {
    private String accountHolderName;  // Name of the account holder
    private int accountNumber;         // Account number
    private String agency;             // Account agency
    private double balance;            // Account balance
    private String openingDate;        // Account opening date

    /**
     * Constructor for the "NewAccount" class.
     *
     * @param accountHolderName  Name of the account holder
     * @param accountNumber      Account number
     * @param agency             Account agency
     * @param balance            Initial account balance
     * @param openingDate        Account opening date
     */
    public NewAccount(String accountHolderName, int accountNumber, String agency, double balance, String openingDate) {
        super();
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.balance = balance;
        this.openingDate = openingDate;
    }


	/**
     * Returns a string representation of the "NewAccount" object.
     *
     * @return String representation of the "NewAccount" object
     */
    @Override
    public String toString() {
        return "NewUser [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", agency=" + agency
                + ", balance=" + balance + ", openingDate=" + openingDate + "]";
    }

    /**
     * Returns the account holder's name.
     *
     * @return Account holder's name
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the account holder's name.
     *
     * @param accountHolderName New account holder's name
     */
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    /**
     * Returns the account number.
     *
     * @return Account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account number.
     *
     * @param accountNumber New account number
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the account agency.
     *
     * @return Account agency
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the account agency.
     *
     * @param agency New account agency
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /**
     * Returns the account balance.
     *
     * @return Account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the account balance.
     *
     * @param balance New account balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the account opening date.
     *
     * @return Account opening date
     */
    public String getOpeningDate() {
        return openingDate;
    }

    /**
     * Sets the account opening date.
     *
     * @param openingDate New account opening date
     */
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    /**
     * Performs a withdrawal from the account.
     *
     * @param amount Amount to be withdrawn
     */
    public void withdraw(double amount) {
        if (this.getBalance() < amount) {
            System.out.println("You don't have enough balance to withdraw!");
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is: " + getBalance());
        }
    }

    /**
     * Performs a deposit into the account.
     *
     * @param amount Amount to be deposited
     */
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your new balance is: " + getBalance());
    }

    /**
     * Calculates the account's earnings.
     */
    public void calculateEarnings(double earnings) {
        this.balance += (this.balance * earnings);
        System.out.println("Your balance with earnings is: " + getBalance());
    }

    /**
     * Displays the account information.
     */
    public void displayInformation() {
        System.out.println(this.toString());
    }
}
