import java.util.*;

public class Regex {
    public static void main(String[] args) {


                Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");

                String sentence= sc.nextLine();
                if(sentence.matches("^[A-Z].*[.]$")) //Checks whether sentence Start with Captail and ends with period
                {
                    System.out.println("The given Sentence starts with Captail letter and ends with a Period ");
                }
                else{
                    System.out.println(" No,The given Sentence do not Start with Captail letter or end with a Period ");

                }


            }

}
