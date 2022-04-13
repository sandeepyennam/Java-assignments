import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberTobeGuessed=sc.nextInt();
        int guessed,count=0;
      do {
          System.out.println("Guess the number");
          guessed=sc.nextInt();

          if(numberTobeGuessed>guessed)
              System.out.println("your guessed number is too low");
          else if(numberTobeGuessed<guessed)
              System.out.println("your guessed number is too high");
          count++;

      }while(numberTobeGuessed!=guessed);

        System.out.println("Congratulations,you have guesssed it in "+count+"ways");


    }
}
