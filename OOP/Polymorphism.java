//OverRiding Polymorphism
class Interest{

    public void calculateInterest(double amount){
        System.out.println("Calculating Interest....");
    }
}

class SavingsAccount extends Interest{
         @Override
       public void calculateInterest(double amount){

        double interest = amount* 0.05;
        System.out.println("Savings Interest: " + interest);

    }

}

class CurrentAccount extends Interest{
        @Override
       public void calculateInterest(double amount){

        double interest = amount* 0.02;
        System.out.println("Current Interest: " + interest);

    }

}

class FixedDepositAccount extends Interest{
        @Override
       public void calculateInterest(double amount){

        double interest = amount* 0.07;
        System.out.println("Fixed Deposit Interest: " + interest);

    }

}

//Overloading Polymorphism
class Bank {

  
    public void calculateInterest(double amount) {
        double interest = amount * 0.05;
        System.out.println("Interest: " + interest);
    }

  
    public void calculateInterest(double amount, double rate) {
        double interest = amount * rate;
        System.out.println("Interest with custom rate: " + interest);
    }

    
    public void calculateInterest(int amount) {
        double interest = amount * 0.04;
        System.out.println("Interest for int amount: " + interest);
    }
}

public class Polymorphism {

    public static void main(String[] args){
       //OverRiding
        Interest account;

         account = new SavingsAccount();
         account.calculateInterest(50000);

         account = new CurrentAccount();
         account.calculateInterest(50000);

         account = new FixedDepositAccount();
         account.calculateInterest(50000);

         //OverLoading
        Bank b = new Bank();

        b.calculateInterest(50000);
        b.calculateInterest(50000, 0.07);
        b.calculateInterest(30000);

    }

    
}
