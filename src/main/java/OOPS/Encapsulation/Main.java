package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAccountHolder("shameer");
        System.out.println("The account holder name is : " + acc.getAccountHolder());
        acc.setBalance(1000);
        System.out.println("Current balance is "+ acc.getBalance());

        acc.deposit(100);
        System.out.println("Your Total balance balance is "+ acc.getBalance());


    }
}
