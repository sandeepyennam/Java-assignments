import java.util.Scanner;

public class MadLibsClone {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ADJECTIVE1");
        String ADJECTIVE_1=sc.next();
        System.out.println("GIRLS NAME :");
        String GIRLS_NAME=sc.next();
        System.out.println("OCCUPATION OF GIRL");
        String ADJECTIVE1_OCCUPATION1=sc.next();
        System.out.println("PLACE OF GIRL");
        String PLACE=sc.next();
        System.out.println("CLOTHING SHE LIKE TO WEAR :");
        String CLOTHING=sc.next();
        System.out.println("HER HOBBY");
        String HOBBY=sc.next();
        System.out.println("BOYS OCCUPATION :");
        String ADJECTIVE3_OCCUPATION2=sc.next();
        System.out.println("NAME OF THE BOY:");
        String BOYS_NAME=sc.next();
        System.out.println("NAME OF THE KING :");
        String KINGS_NAME=sc.next();


        System.out.println("There was a "+ADJECTIVE_1+" girl named "+GIRLS_NAME+" who was a "+ADJECTIVE1_OCCUPATION1+" in the kingdom of "+PLACE+" she loved to wear \"" +
                CLOTHING+" and to "+HOBBY+" she wanted to marry "+ADJECTIVE3_OCCUPATION2+" named "+BOYS_NAME+" but her father,king "+KINGS_NAME+" forbid her from seeing him ");



    }
}
