import java.util.Scanner;

public class BankAccount {
    public static String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        balance = 0;
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        if (balance < 0)
            System.out.println("balance should be greater than 0");
        else
            this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount < 0)
            System.out.println("error : please deposit the amount greter than 0");
        else
            balance+=amount;
    }

    public void withdraw(int amount)
    {
        if (amount < 0)
            System.out.println("error : please wthdraw the amount greter than 0");
        else if(amount>balance)
            System.out.println("Insufficient funds,check the balance and try again");
        else
            balance-=amount;



    }

    public String getOwner()
    {
        return owner;
    }
    public int getBalance()
    {
        return balance;
    }



}
