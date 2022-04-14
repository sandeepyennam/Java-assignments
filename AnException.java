import java.util.Scanner;

public class AnException {

    public static void test() throws InvalidAgeException,InvalidIDException,InvalidNumberException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your id");
        String Id=sc.next();
        System.out.println("Enter your phone number");
        String phoneNumber=sc.next();

        if(age<18)
            throw new InvalidAgeException();
        else
            System.out.println("Valid age");

        if((Id.charAt(0)>='A' && Id.charAt(0)<='Z'))
            System.out.println("Valid Id");
        else
            throw new InvalidIDException();

        if(!phoneNumber.substring(0,2).equals("91"))
            throw new InvalidNumberException();
        else
            System.out.println("Valid mobile number");
    }


    public static void main(String[] args) {

        String str=null;


        try {
            test();

                System.out.println(str.compareTo("hello"));

        }

       catch (InvalidAgeException | InvalidNumberException | InvalidIDException i)
        {
            System.out.println("Exception is caught"+i);
        }

            finally {
        System.out.println("finally : i will always execute");
    }


    }
}
