package Demo.homeworks19June;

public class BankAccountApp {
    private int accountNumber;
    private String customerName;
    private double balance;
    private boolean accountActivity;

    public BankAccountApp(int accountNumber, String customerName, double balance, boolean accountActivity) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.accountActivity = accountActivity;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAccountActivity() {
        return accountActivity;
    }

    public void setAccountActivity(boolean accountActivity) {
        this.accountActivity = accountActivity;
    }

    public void increaseBalance(double amount) {
        if ( amount <= 500) {
            this.balance += amount;
        } else {
            System.out.println("Balans 500 manatdan artıq artırıla bilməz");
        }
    }

    public void reduceBalance(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Balansınızda kifayət qədər məbləğ yoxdur!");
        }
    }
}
