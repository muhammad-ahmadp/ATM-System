/**
 * Main entry point for the SimpleATM application.
 * Provides an interactive CLI menu for ATM operations.
 */
import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMManager atm = new ATMManager();

        System.out.println("========= Welcome to SimpleATM =========");

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Show All Accounts");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    String accId = scanner.nextLine();
                    System.out.print("Enter Owner Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    try {
                        double balance = scanner.nextDouble();
                        scanner.nextLine();
                        atm.createAccount(accId, name, balance);
                    } catch (Exception e) {
                        System.out.println("Invalid balance amount!");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    accId = scanner.nextLine();
                    System.out.print("Enter Deposit Amount: ");
                    try {
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        atm.deposit(accId, depositAmount);
                    } catch (Exception e) {
                        System.out.println("Invalid amount!");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    accId = scanner.nextLine();
                    System.out.print("Enter Withdrawal Amount: ");
                    try {
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        atm.withdraw(accId, withdrawAmount);
                    } catch (Exception e) {
                        System.out.println("Invalid amount!");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    System.out.print("Enter Sender Account ID: ");
                    String fromId = scanner.nextLine();
                    System.out.print("Enter Receiver Account ID: ");
                    String toId = scanner.nextLine();
                    System.out.print("Enter Transfer Amount: ");
                    try {
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        atm.transfer(fromId, toId, amount);
                    } catch (Exception e) {
                        System.out.println("Invalid amount!");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    atm.displayAllAccounts();
                    break;

                case 6:
                    atm.displayAllTransactions();
                    break;

                case 7:
                    System.out.println("\n===== Summary =====");
                    System.out.println("Total Accounts: " + atm.getTotalAccounts());
                    System.out.println("Total Transactions: " + atm.getTotalTransactions());
                    System.out.println("\nThank you for using SimpleATM. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1-7.");
            }
        }
    }
}