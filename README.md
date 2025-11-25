# SimpleATM - Console-Based Banking System

A feature-rich, interactive ATM simulation developed in Java that models core banking operations, including deposits, withdrawals, and secure transfers. This project demonstrates robust financial transaction logic, state management, and the use of a transaction history audit trail.

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

---

## 1. Overview

The SimpleATM system simulates a basic banking environment, focusing on the integrity and security of financial transactions. It is designed to showcase the implementation of business rules critical to banking, such as preventing negative balances and ensuring all operations are recorded.

### Core Features

*   **Account Management:** Creation and tracking of multiple bank accounts with unique IDs and balances.
*   **Financial Transactions:** Secure implementation of Deposit, Withdrawal, and Transfer operations.
*   **Transaction History:** A complete audit trail of all financial activities is recorded and viewable.
*   **Balance Verification:** Logic to prevent withdrawals that would result in a negative account balance.
*   **Data Integrity:** Comprehensive input validation and prevention of duplicate account IDs.
*   **User Interface:** A clean, menu-driven Command Line Interface (CLI) for interactive use.

---

## 2. Technical Architecture

The system is structured to separate the core account entity from the transaction records and the overall management logic, adhering to the Single Responsibility Principle.

### Project Structure

```
simple-atm/
│
├── Account.java          # Core account entity with operations
├── Transaction.java      # Transaction record model
├── ATMManager.java       # Business logic and account management
└── MainATM.java          # Entry point with CLI interface
```

### Key Classes and Responsibilities

| Class | Responsibility | Key Concepts Demonstrated |
| :--- | :--- | :--- |
| `Account.java` | Manages the balance and core operations (deposit, withdraw) for a single account. | Encapsulation, State Management, Financial Validation. |
| `Transaction.java` | Models a single transaction event for auditing purposes. | Data Modeling, Audit Trail Implementation. |
| `ATMManager.java` | Central repository for all accounts and transaction history. | Collection Management (`ArrayList`), Business Logic Orchestration. |
| `MainATM.java` | Provides the interactive Command Line Interface (CLI). | User Interface Design, Input Handling, Exception Handling. |

---

## 3. Design Decisions

The design prioritizes the security and reliability of financial operations, which are paramount in a banking system.

*   **Defensive Withdrawal Logic:** The withdrawal method includes a critical check to ensure the account balance is sufficient before processing the transaction, preventing overdrafts.
*   **Transaction Audit Trail:** Every operation (deposit, withdrawal, transfer) generates a `Transaction` record, which is stored in the `ATMManager`. This is a fundamental requirement for any auditable financial system.
*   **Secure Transfer Logic:** The transfer operation is handled as a single, atomic action within the `ATMManager`, ensuring that both the withdrawal from the sender and the deposit to the receiver are processed correctly.
*   **Single Responsibility:** The `Account` class is responsible only for its own state, while the `ATMManager` handles the complex interactions between multiple accounts (e.g., transfers).

### Code Example: Withdrawal Validation

```java
public void withdraw(double amount) {
    // Critical check to prevent negative balances (overdraft)
    if (balance < amount) {
        throw new IllegalArgumentException("Insufficient balance for withdrawal.");
    }
    this.balance -= amount;
    // ... record transaction
}
```

---

## 4. How to Run

### Prerequisites
*   Java Development Kit (JDK) 8 or higher

### Installation and Execution

1.  **Clone the repository** (Assuming a standard project structure).
2.  **Compile the project:**
    ```bash
    javac *.java
    ```

3.  **Run the application:**
    ```bash
    java MainATM
    ```

### Sample Workflow

```
========= Welcome to SimpleATM =========
...
4. Transfer Money
...
Enter choice: 4
Enter Sender Account ID: ACC001
Enter Receiver Account ID: ACC002
Enter Transfer Amount: 1000
Transfer successful!
Sender balance: 4500.00 | Receiver balance: 6000.00
```

---

## 5. Limitations and Future Enhancements

### Known Limitations

*   **Persistence:** Data is stored in memory only and is lost upon application exit.
*   **Security:** Lacks a user authentication (PIN/password) system.
*   **Concurrency:** Not designed for multi-user concurrent access.

### What I'd Do Next

*   Implement **database persistence** (e.g., using JDBC) or file-based storage for permanent data storage.
*   Add a **user authentication** and PIN system for security.
*   Develop a **Graphical User Interface (GUI)** using JavaFX or Swing.
*   Implement **Unit Tests** using JUnit to ensure the integrity of all financial transactions and business rules.
*   Introduce **account types** (e.g., Savings, Checking) with different business rules (e.g., interest calculation).

---

## 6. Contact and License

### Author

**Muhammad Ahmad**

*   GitHub: [@muhammad-ahmadp](https://github.com/muhammad-ahmadp)
*   LinkedIn: [muhammad-ahmadcs](https://linkedin.com/in/muhammad-ahmadcs)

### License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

### Acknowledgments

This project was built to demonstrate the implementation of robust financial transaction logic and state management within a core Java application.
