import java.util.*;
import java.util.ArrayList;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> Numbers=new ArrayList<>();

        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(87);
        Numbers.add(85);
        Numbers.add(8874);
        Numbers.add(875);
        Numbers.add(98745);
        Numbers.add(487);
        Numbers.add(3948);

        System.out.println(sum(Numbers));

    }

    public static int sum(List<Integer> Numbers)
    {
        int sum=0;
        for(int i : Numbers)
        {
            sum+=i;
        }
        return sum;

    }



}
