package assignment6.task3;

import java.util.ArrayList;
import java.util.List;

public class VampireNumbers {

    // permutations of str

    static List<String> l = new ArrayList<String>();

    public static void main(String[] args) {
        int vampire = 1260;
        int count=0;
        System.out.println("The first 100 vampire numbers are");

        while (count<100){

            if (vampire % 2 != 0)
                vampire++;

            permutation(Integer.toString(vampire), "");
            //System.out.println(l);
            if (Vampire100(Integer.toString(vampire))==1)
                count++;
            vampire++;
        }
    }

    static void permutation(String str,
                            String ans) {

        if (str.length() == 0) {
            l.add(ans);
        }

        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            permutation(ros, ans + ch);
        }
    }

    // Driver code

    public static int Vampire100(String v1) {

        for(String v:l)

    {
        String x = v.substring(0, v.length() / 2);
        String y = v.substring(v.length() / 2);

        if (Integer.parseInt(x) * Integer.parseInt(y) == Integer.parseInt(v1) && !((x.charAt(x.length() - 1) == '0' && y.charAt(y.length() - 1) == '0'))) {
            System.out.println(Integer.parseInt(v1)+" = "+x+" * " +y);
            return 1;
        }

    }
        l.clear();
        return 0;


}
}


