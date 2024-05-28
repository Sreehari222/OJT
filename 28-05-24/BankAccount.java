public class BankAccount {

    private String accountnumber;
    private String accountholderName;
    private double balance;

    public BankAccount(String accountnumber, String accountholderName, double initialBalance) {
        this.accountnumber = accountnumber;
        this.accountholderName = accountholderName;

        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("low balance");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Withdrawal amount exceeds the current balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }

    public double checkBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    public String getAccountNumber() {
        return accountnumber;
    }

    public String getAccountHolderName() {
        return accountholderName;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);
        
        account.checkBalance();   
        account.deposit(500.0);  
        account.withdraw(200.0);   
        account.checkBalance();  
    }
}
