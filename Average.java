import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three numbers you want to average");
        int firstnumber=sc.nextInt();
        int secondnumber=sc.nextInt();
        int thirdnumber=sc.nextInt();

        double averageofthreenumbers=(firstnumber+secondnumber+thirdnumber)/3.0;

        System.out.println("The average of the three numbers is "+averageofthreenumbers);

    }

}
