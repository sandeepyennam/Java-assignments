import java.util.Scanner;

public class DefaultInitialization {
   // Scanner sc=new Scanner(System.in);
    int a;
    char ch;

    public void display()
    {
        System.out.println("int "+a+"char :"+ch);

    }
    public void displayy()
    {
        int a=;
        char ch=;
// Here int a and char ch are not initialized, so the function gives compile time error

        System.out.println("int :"+a+"char :"+ch);

    }




}
