class BankAccount{

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){

       this.accountHolder = accountHolder;

       if(balance >= 0) this.balance = balance;

       else this.balance = 0;
    }

    public String getAccountHolder(){
          return accountHolder;
    }

    public double getBalance(){
          return balance;
    }

    //deposit amount
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Total Balance: " + balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    //withdraw amount
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Total Balance: " + balance);
        }
        else{
            System.out.println("Invalid or Insufficient amount");
        }

    }
}

public class Encapsulation{
    public static void main(String[] args) {


        BankAccount account = new BankAccount("Mayuri" , 50000);

        System.out.println("Account Holder: "  +account.getAccountHolder());

        System.out.println("Balance: " + account.getBalance());

        account.deposit(50000);
        account.withdraw(41351);
        account.withdraw(2000);

      System.out.println("Final Balance: " + account.getBalance());
  }

}