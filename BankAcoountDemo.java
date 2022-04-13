import java.util.Scanner;

public class BankAcoountDemo {

    public static void main(String[] args) {

        BankAccount account=new BankAccount("sandeep",5000);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        int amountToBeDeposited=sc.nextInt();
        System.out.println("Enter the amount toi be withdrawn");
        int amountToBeWithdrawn=sc.nextInt();
        account.deposit(amountToBeDeposited);
        account.withdraw(amountToBeWithdrawn);
        System.out.println("the name of the owner is");
        System.out.println(account.getOwner());
        System.out.println("the remaining balce is");
        System.out.println(account.getBalance());

    }



}
