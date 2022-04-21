public class Lamda {

    interface greeting
    {
        public String display(String str);
    }

    static public void method(String str,greeting g)
    {
        String result=g.display(str);
        System.out.println("result is "+result);
    }

    public static void main(String[] args) {
        method("John",(String s)->"hello "+s);

    }

}
