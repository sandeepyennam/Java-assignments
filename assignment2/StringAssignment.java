import java.util.*;

public class StringAssignment {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

           int[]  indexOfCharacters=new int[26];

        for(char ch :str.toCharArray())
        {
            if(ch<='z' && ch>='a')
            {
                int index=ch-'a';
                indexOfCharacters[index]++;
            }
            else if(ch<='Z' && ch>='A')
            {
                int index=ch-'A';
                indexOfCharacters[index]++;
            }

        }

        for (int i :indexOfCharacters) {
            if (i == 0) {
                System.out.println("String do not contain all the alphabets");
                System.exit(0);
            }
        }
        System.out.println("The given string contains all the alphabets from a to z");


    }
}
