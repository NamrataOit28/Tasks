import java.util.Scanner;
class Account {
    protected String customerName;
    protected int accountNumber;
    protected String accountType;

    public Account(String customerName, int accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public void displayAccountInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
    }
}
class CurrAcct extends Account {
    private double balance;
    private static final double MIN_BALANCE = 1000;
    private static final double SERVICE_CHARGE = 50;

    public CurrAcct(String customerName, int accountNumber) {
        super(customerName, accountNumber, "Current");
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Minimum balance requirement not met. Service charge applied.");
            balance -= amount + SERVICE_CHARGE;
        } else {
            balance -= amount;
        }
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Class "SavAcct" for Savings Account
class SavAcct extends Account {
    private double balance;
    private static final double INTEREST_RATE = 0.05;

    public SavAcct(String customerName, int accountNumber) {
        super(customerName, accountNumber, "Savings");
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void addInterest() {
        balance += balance * INTEREST_RATE;
        System.out.println("Interest added. New balance: " + balance);
    }
}

public class Bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter account type (Current/Savings): ");
        String accountType = scanner.next();

        Account account;
        if (accountType.equalsIgnoreCase("Current")) {
            account = new CurrAcct(customerName, accountNumber);
        } else if (accountType.equalsIgnoreCase("Savings")) {
            account = new SavAcct(customerName, accountNumber);
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        account.displayAccountInfo();

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Add Interest (Savings only)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (account instanceof CurrAcct) {
                        ((CurrAcct) account).deposit(depositAmount);
                    } else if (account instanceof SavAcct) {
                        ((SavAcct) account).deposit(depositAmount);
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account instanceof CurrAcct) {
                        ((CurrAcct) account).withdraw(withdrawAmount);
                    } else if (account instanceof SavAcct) {
                        ((SavAcct) account).withdraw(withdrawAmount);
                    }
                    break;
                case 3:
                    if (account instanceof CurrAcct) {
                        ((CurrAcct) account).displayBalance();
                    } else if (account instanceof SavAcct) {
                        ((SavAcct) account).displayBalance();
                    }
                    break;
                case 4:
                    if (account instanceof SavAcct) {
                        ((SavAcct) account).addInterest();
                    } else {
                        System.out.println("exist");
                    }
            }
        
  
    