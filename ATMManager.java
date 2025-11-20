/**
 * Manages all ATM operations including accounts and transactions.
 */
import java.util.ArrayList;

public class ATMManager {
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    /**
     * Creates a new account and adds it to the system.
     *
     * @param accountId Unique account identifier
     * @param ownerName Name of the account owner
     * @param balance Initial balance
     */
    public void createAccount(String accountId, String ownerName, double balance) {
        // Check for duplicate account ID
        if (findAccount(accountId) != null) {
            System.out.println("Account ID already exists!");
            return;
        }

        try {
            Account account = new Account(accountId, ownerName, balance);
            accounts.add(account);
            transactions.add(new Transaction("Create", accountId, balance, "New account created"));
            System.out.println("Account created successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Finds an account by ID.
     *
     * @param accountId Account identifier to search for
     * @return Account if found, null otherwise
     */
    private Account findAccount(String accountId) {
        for (Account acc : accounts) {
            if (acc.getAccountId().equals(accountId)) {
                return acc;
            }
        }
        return null;
    }

    /**
     * Deposits money into an account.
     *
     * @param accountId Target account ID
     * @param amount Amount to deposit
     */
    public void deposit(String accountId, double amount) {
        Account acc = findAccount(accountId);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }
        try {
            acc.deposit(amount);
            transactions.add(new Transaction("Deposit", accountId, amount, "Deposit completed"));
            System.out.printf("Deposit successful. New balance: %.2f%n", acc.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Withdraws money from an account.
     *
     * @param accountId Source account ID
     * @param amount Amount to withdraw
     */
    public void withdraw(String accountId, double amount) {
        Account acc = findAccount(accountId);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }
        try {
            acc.withdraw(amount);
            transactions.add(new Transaction("Withdraw", accountId, amount, "Withdrawal completed"));
            System.out.printf("Withdrawal successful. New balance: %.2f%n", acc.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Transfers funds between two accounts.
     *
     * @param fromId Sender account ID
     * @param toId Receiver account ID
     * @param amount Amount to transfer
     */
    public void transfer(String fromId, String toId, double amount) {
        Account sender = findAccount(fromId);
        Account receiver = findAccount(toId);

        if (sender == null || receiver == null) {
            System.out.println("One or both accounts not found!");
            return;
        }

        if (fromId.equals(toId)) {
            System.out.println("Cannot transfer to the same account!");
            return;
        }

        try {
            sender.transfer(receiver, amount);
            transactions.add(new Transaction("Transfer", fromId, amount,
                    "Transferred to " + toId));
            System.out.println("Transfer successful!");
            System.out.printf("Sender balance: %.2f | Receiver balance: %.2f%n", 
                    sender.getBalance(), receiver.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Displays all accounts in the system.
     */
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        System.out.println("\n--- All Accounts ---");
        for (Account acc : accounts) {
            System.out.println(acc);
            System.out.println("--------------------------");
        }
    }

    /**
     * Displays all transaction history.
     */
    public void displayAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        System.out.println("\n--- Transaction History ---");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public int getTotalAccounts() {
        return accounts.size();
    }

    public int getTotalTransactions() {
        return transactions.size();
    }
}
