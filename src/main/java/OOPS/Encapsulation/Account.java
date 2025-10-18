package OOPS.Encapsulation;

public class Account {
    private String accountHolder;
    private double balance;


    public void  setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void  setBalance(double balance) {
        if(balance>0)
        {
            this.balance = balance;
        }
        else {
            System.out.println("Invalid Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    //Deposit Method
    public void deposit(double money) {
        if (money > 0) {
            this.balance += money;
            System.out.println("You have successfully deposited " + money);
        } else {
            System.out.println("Invalid Balance");
        }
    }
}
