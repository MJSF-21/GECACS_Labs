class BankAccount {

    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest: " + interest);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("John", 50000);

        s.deposit(5000);
        s.withdraw(2000);
        s.showBalance();
        s.calculateInterest();
    }
}