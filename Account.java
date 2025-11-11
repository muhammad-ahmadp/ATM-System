/**
 * Represents a bank account with basic operations.
 */
public class Account {
    private String accountId;
    private String ownerName;
    private double balance;

    /**
     * Creates a new Account with validation.
     *
     * @param accountId Unique account identifier
     * @param ownerName Name of the account owner
     * @param balance Initial balance (must be non-negative)
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Account(String accountId, String ownerName, double balance) {
        if (accountId == null || accountId.trim().isEmpty() || 
            ownerName == null || ownerName.trim().isEmpty() || 
            balance < 0) {
            throw new IllegalArgumentException("Invalid account data!");
        }
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    /**
     * Deposits funds into the account.
     *
     * @param amount Amount to deposit (must be positive)
     * @throws IllegalArgumentException if amount is not positive
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive!");
        }
        balance += amount;
    }

    /**
     * Withdraws funds from the account if balance allows.
     *
     * @param amount Amount to withdraw (must be positive and <= balance)
     * @throws IllegalArgumentException if amount is invalid or exceeds balance
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance!");
        }
        balance -= amount;
    }

    /**
     * Transfers funds to another account.
     *
     * @param receiver Receiving account
     * @param amount Amount to transfer
     * @throws IllegalArgumentException if receiver is null or transfer fails
     */
    public void transfer(Account receiver, double amount) {
        if (receiver == null) {
            throw new IllegalArgumentException("Receiver account not found!");
        }
        this.withdraw(amount);
        receiver.deposit(amount);
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return String.format("Account ID   : %s%nOwner Name   : %s%nBalance      : %.2f",
                accountId, ownerName, balance);
    }
}
