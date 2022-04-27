import java.util.function.Predicate;
public class Predicate1 {

    static public void pred()
    {
        String str="sandeep";
        Predicate<String> p=(str1)->str1.isEmpty()?true:false;

        System.out.println(p);
    }

    public static void main(String[] args) {
        pred();

    }



}
