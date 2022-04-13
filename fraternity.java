import java.util.Scanner;

public class fraternity {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();

        char gender=sc.next().charAt(0);

        if(age>=19 && gender=='M')
        {
            System.out.println("you are eligible");
        }

        else
            System.out.println("you are not eligible");


    }
}
