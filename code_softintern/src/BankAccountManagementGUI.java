import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

class ATM_interface {
    // ... The same BankAccount class as before ...
}

public class BankAccountManagementGUI extends Frame implements ActionListener {
    private List<BankAccount> accounts;
    private int accountCounter;

    private TextField accountHolderTextField;
    private TextField initialBalanceTextField;
    private TextField accountNumberTextField;
    private TextField amountTextField;
    private TextArea outputTextArea;

    public BankAccountManagementGUI() {
        accounts = new ArrayList<>();
        accountCounter = 1000;

        // Create GUI components
        Label accountHolderLabel = new Label("Account Holder:");
        Label initialBalanceLabel = new Label("Initial Balance:");
        Label accountNumberLabel = new Label("Account Number:");
        Label amountLabel = new Label("Amount:");
        Button createAccountButton = new Button("Create Account");
        Button depositButton = new Button("Deposit");
        Button withdrawButton = new Button("Withdraw");
        Button displayAccountInfoButton = new Button("Display Account Info");
        outputTextArea = new TextArea("", 10, 50);

        // Set layout manager
        setLayout(new FlowLayout());

        // Add components to the frame
        add(accountHolderLabel);
        add(accountHolderTextField = new TextField(20));
        add(initialBalanceLabel);
        add(initialBalanceTextField = new TextField(20));
        add(createAccountButton);
        add(accountNumberLabel);
        add(accountNumberTextField = new TextField(20));
        add(amountLabel);
        add(amountTextField = new TextField(20));
        add(depositButton);
        add(withdrawButton);
        add(displayAccountInfoButton);
        add(outputTextArea);

        // Add action listeners to buttons
        createAccountButton.addActionListener(this);
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        displayAccountInfoButton.addActionListener(this);

        setTitle("Bank Account Management System");
        setSize(400, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int choice;
        try {
            choice = Integer.parseInt(e.getActionCommand());
        } catch (NumberFormatException ex) {
            choice = 0;
        }

        switch (choice) {
            case 1:
                String accountHolder = accountHolderTextField.getText();
                double initialBalance = Double.parseDouble(initialBalanceTextField.getText());
                createAccount(accountHolder, initialBalance);
                break;
            case 2:
                int depositAccountNumber = Integer.parseInt(accountNumberTextField.getText());
                double depositAmount = Double.parseDouble(amountTextField.getText());
                performDeposit(depositAccountNumber, depositAmount);
                break;
            case 3:
                int withdrawalAccountNumber = Integer.parseInt(accountNumberTextField.getText());
                double withdrawalAmount = Double.parseDouble(amountTextField.getText());
                performWithdrawal(withdrawalAccountNumber, withdrawalAmount);
                break;
            case 4:
                int accountInfoAccountNumber = Integer.parseInt(accountNumberTextField.getText());
                displayAccountInfo(accountInfoAccountNumber);
                break;
            default:
                outputTextArea.append("Invalid choice. Please try again.\n");
                break;
        }
    }

    private void performWithdrawal(int withdrawalAccountNumber, double withdrawalAmount) {
    }

    private void displayAccountInfo(int accountInfoAccountNumber) {
    }

    private void performDeposit(int depositAccountNumber, double depositAmount) {
    }

    public void createAccount(String accountHolder, double initialBalance) {
        int accountNumber = generateAccountNumber();
        BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.add(account);
        outputTextArea.append("Account created successfully. Account Number: " + accountNumber + "\n");
    }

    // ... The performDeposit, performWithdrawal, displayAccountInfo methods ...

    private int generateAccountNumber() {
        return ++accountCounter;
    }

    public static void main(String[] args) {
        new BankAccountManagementGUI();
    }
}
