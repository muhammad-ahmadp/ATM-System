# 🏧 SimpleATM - Console-Based Banking System

A feature-rich, interactive ATM simulation built in Java that demonstrates core banking operations with a clean command-line interface.

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)

## ✨ Features

- 🆕 **Account Creation** - Create new bank accounts with unique IDs
- 💰 **Deposit Operations** - Add funds to any account
- 💸 **Withdrawal System** - Withdraw money with balance verification
- 🔄 **Money Transfers** - Transfer funds between accounts securely
- 📊 **Account Overview** - View all accounts and their balances
- 📝 **Transaction History** - Complete audit trail of all operations
- ✅ **Input Validation** - Comprehensive error handling and validation
- 🎨 **User-Friendly CLI** - Clean, interactive menu system

## 🚀 Quick Start

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any text editor or IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/muhammad-ahmadp/simple-atm.git
cd simple-atm
```

2. **Compile the project**
```bash
javac *.java
```

3. **Run the application**
```bash
java MainATM
```

## 📖 Usage

### Main Menu
```
========= Welcome to SimpleATM =========

1. Create Account
2. Deposit Money
3. Withdraw Money
4. Transfer Money
5. Show All Accounts
6. View Transaction History
7. Exit
```

### Example Workflow

#### 1. Create an Account
```
Enter choice: 1
Enter Account ID: ACC001
Enter Owner Name: John Doe
Enter Initial Balance: 5000
✅ Account created successfully!
```

#### 2. Deposit Money
```
Enter choice: 2
Enter Account ID: ACC001
Enter Deposit Amount: 2000
✅ Deposit successful. New balance: 7000.00
```

#### 3. Withdraw Money
```
Enter choice: 3
Enter Account ID: ACC001
Enter Withdrawal Amount: 1500
✅ Withdrawal successful. New balance: 5500.00
```

#### 4. Transfer Money
```
Enter choice: 4
Enter Sender Account ID: ACC001
Enter Receiver Account ID: ACC002
Enter Transfer Amount: 1000
✅ Transfer successful!
Sender balance: 4500.00 | Receiver balance: 6000.00
```

## 🏗️ Project Structure

```
simple-atm/
│
├── Account.java          # Core account entity with operations
├── Transaction.java      # Transaction record model
├── ATMManager.java       # Business logic and account management
├── MainATM.java          # Entry point with CLI interface
└── README.md             # This file
```

## 🔧 Technical Details

### Key Classes

#### `Account`
Represents a bank account with:
- Unique account ID
- Owner name
- Balance tracking
- Deposit, withdraw, and transfer operations
- Input validation

#### `Transaction`
Records all system transactions:
- Transaction type (Create, Deposit, Withdraw, Transfer)
- Account ID
- Amount
- Details/description

#### `ATMManager`
Central management system:
- Maintains all accounts
- Tracks transaction history
- Handles all banking operations
- Provides search and display functionality

#### `MainATM`
User interface:
- Interactive menu system
- Input handling and validation
- Error display and feedback

## 🎯 Design Principles

- ✅ **Encapsulation** - Private fields with public methods
- ✅ **Validation** - Comprehensive input checking
- ✅ **Error Handling** - Try-catch blocks and meaningful messages
- ✅ **Single Responsibility** - Each class has one clear purpose
- ✅ **User Experience** - Clear feedback and intuitive flow

## 📊 Sample Output

```
--- All Accounts ---
Account ID   : ACC001
Owner Name   : John Doe
Balance      : 5000.00
--------------------------
Account ID   : ACC002
Owner Name   : Jane Smith
Balance      : 3000.00
--------------------------

--- Transaction History ---
Transaction Type: Create
Account ID: ACC001
Amount: 5000.00
Details: New account created

Transaction Type: Deposit
Account ID: ACC001
Amount: 2000.00
Details: Deposit completed

Transaction Type: Transfer
Account ID: ACC001
Amount: 1000.00
Details: Transferred to ACC002
```

## 🛡️ Security Features

- ✅ Prevents negative balances
- ✅ Validates all inputs
- ✅ Checks for duplicate account IDs
- ✅ Prevents self-transfers
- ✅ Handles insufficient balance gracefully

## ⚠️ Known Limitations

This is a learning project with the following limitations:

- 📝 In-memory storage only (data lost on exit)
- 🔐 No authentication or PIN system
- 💾 No database persistence
- 🌐 CLI-only interface
- 📱 No multi-user concurrent access
- 🔒 No encryption for sensitive data

## 🔮 Future Enhancements

- [ ] Add user authentication (PIN/password)
- [ ] Implement file-based persistence
- [ ] Add database integration (MySQL/PostgreSQL)
- [ ] Create GUI with JavaFX
- [ ] Add interest calculation
- [ ] Implement account types (Savings, Checking)
- [ ] Add transaction limits and fees
- [ ] Generate account statements
- [ ] Add multi-currency support
- [ ] Implement loan management

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

Please ensure your code:
- Follows Java naming conventions
- Includes input validation
- Has meaningful variable names
- Includes comments for complex logic

## 📚 Learning Objectives

This project demonstrates:

- ✅ Object-Oriented Programming concepts
- ✅ Input validation and error handling
- ✅ ArrayList usage and management
- ✅ Scanner for user input
- ✅ Method design and organization
- ✅ Clean code practices
- ✅ User interface design (CLI)

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**[Your Name]**

- GitHub: [@yourusername](https://github.com/muhammad-ahmadp)
- LinkedIn: [Your Profile](https://linkedin.com/in/muhammad-ahmadcs)
- Email: muhammadahmadseng@gmail.com

## 🙏 Acknowledgments

- Inspired by real-world banking systems
- Built as a learning project for Java fundamentals
- Thanks to the Java community for excellent documentation

## 📧 Contact

Have questions or suggestions? Feel free to:
- Open an issue
- Submit a pull request
- Contact me directly

---

⭐ **If this project helped you learn, please give it a star!** ⭐

---

## 📈 Project Stats

![Lines of Code](https://img.shields.io/badge/Lines%20of%20Code-~350-blue)
![Classes](https://img.shields.io/badge/Classes-4-green)
![Methods](https://img.shields.io/badge/Methods-15+-orange)

**Made with ❤️ and Java**