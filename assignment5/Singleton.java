public class Singleton {
    public static String str;

    public static void initializeString(String str1)
    {
        //here str is non-static variable.this cannot be called in static method.to access str variable ,we have to make it also static
        str=str1;
    }

    public void display()
    {
        System.out.println("The string is "+str);
    }



}
