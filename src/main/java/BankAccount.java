import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     *
     * @param amount the amount to deposit;
     * @return true if successful deposit
     */
    public boolean deposit(final double amount) {
        if (amount <= 0) {
            return false;
        }
        this.accountBalance += amount;
        return true;
    }

    /**
     *
     * @param amount amount to withdraw
     * @return true if successful withdraw
     */
    public boolean withdraw(final double amount) {
        if (amount <= 0) {
            return false;
        }
        if (accountBalance - amount < 0) {
            return false;
        }
        accountBalance = accountBalance - amount;
        return true;
    }

}