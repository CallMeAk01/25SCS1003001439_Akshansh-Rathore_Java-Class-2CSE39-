public class BankAccount {
    // Instance variables (unique to each account object)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Static variable (shared across all BankAccount objects)
    private static double interestRate = 5.0; // Default 5.0%

    // Parameterized Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Static setter to change interest rate using class name
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    // Static getter for interest rate
    public static double getInterestRate() {
        return interestRate;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        // Creating 3 bank accounts
        BankAccount acc1 = new BankAccount("ACC1001", "Akshansh Rathore", 10000.0);
        BankAccount acc2 = new BankAccount("ACC1002", "Rahul Sharma", 15000.0);
        BankAccount acc3 = new BankAccount("ACC1003", "Priya Singh", 20000.0);

        System.out.println("=== INITIAL ACCOUNT DETAILS (Interest Rate: " + BankAccount.getInterestRate() + "%) ===");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        acc3.displayAccountDetails();

        // Changing the interest rate using the class name
        System.out.println("--> Changing interest rate to 6.5% using class name: BankAccount.setInterestRate(6.5)\n");
        BankAccount.setInterestRate(6.5);

        System.out.println("=== UPDATED ACCOUNT DETAILS (Interest Rate: " + BankAccount.getInterestRate() + "%) ===");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        acc3.displayAccountDetails();
    }
}