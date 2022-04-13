import java.util.*;

public class ArrayList {
    public static void main(String[] args) {

   List<Double> l=new java.util.ArrayList<>();
   Scanner sc=new Scanner(System.in);
    double input=0;

      do
      {
          System.out.println("Enter a double number");
          input=sc.nextDouble();
          if(input<0)
              break;
          l.add(input);
      }while(input>=0);

      for (int i=l.size()-1;i>=0;i--)
        {
            System.out.println(l.get(i));
        }


    }
}
