/**
 * Represents a transaction record in the ATM system.
 */
class Transaction {
    private String type;
    private String accountId;
    private double amount;
    private String details;

    /**
     * Creates a new transaction record.
     *
     * @param type Type of transaction (Create, Deposit, Withdraw, Transfer)
     * @param accountId Account involved in the transaction
     * @param amount Amount involved
     * @param details Additional transaction details
     */
    public Transaction(String type, String accountId, double amount, String details) {
        if (type == null || type.trim().isEmpty() || 
            accountId == null || accountId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid transaction data!");
        }
        this.type = type;
        this.accountId = accountId;
        this.amount = amount;
        this.details = details;
    }

    @Override
    public String toString() {
        return String.format("Transaction Type: %s%nAccount ID: %s%nAmount: %.2f%nDetails: %s%n",
                type, accountId, amount, details);
    }
}
