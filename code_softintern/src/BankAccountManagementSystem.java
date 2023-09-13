

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountManagementSystem {
    private List<BankAccount> accounts;
    private int accountCounter;

    public BankAccountManagementSystem() {
        this.accounts = new ArrayList<>();
        this.accountCounter = 1000;
    }

    public void createAccount(String accountHolder, double initialBalance) {
        int accountNumber = generateAccountNumber();
        BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.add(account);
        System.out.println("Account created successfully. Account Number: " + accountNumber);
    }

    private int generateAccountNumber() {
        return ++accountCounter;
    }

    public BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void performDeposit(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void performWithdrawal(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccountInfo(int accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.displayAccountInfo();
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void main(String[] args) {
        BankAccountManagementSystem bankSystem = new BankAccountManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Bank Account Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter account holder name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bankSystem.createAccount(accountHolder, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankSystem.performDeposit(depositAccountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawalAccountNumber = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bankSystem.performWithdrawal(withdrawalAccountNumber, withdrawalAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int accountInfoAccountNumber = scanner.nextInt();
                    bankSystem.displayAccountInfo(accountInfoAccountNumber);
                    break;
                case 5:
                    System.out.println("Exiting Bank Account Management System...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

