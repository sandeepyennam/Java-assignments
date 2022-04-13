import java.util.Scanner;

public class SumFun {

    public static int input = 0;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

         int sum=0;

        while (input >= 0) {
            sum+=input;
            System.out.println("enter the input,enter positive if you want to continue,else enter negative number");
            input=sc.nextInt();

        }
        System.out.println("Done,the sum is"+sum);
    }
}
