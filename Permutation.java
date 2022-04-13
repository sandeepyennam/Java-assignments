import java.util.*;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<String> firstNAmes=new ArrayList<>();
        List<String> LastNAmes=new ArrayList<>();
        int i=0;

        while(i<5)
        {
            System.out.println("Enter your full name");
             String fullName=sc.next();
             int indexofSpace=fullName.indexOf(" ");
            System.out.println(indexofSpace);
             i++;
        }

        System.out.println(firstNAmes);
        System.out.println(LastNAmes);


    }
}
