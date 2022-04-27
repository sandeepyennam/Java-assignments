public class Student {
    static String name;
    String id;
    int age;
    static boolean isMerit;

    public Student(String name,String id,int age,boolean isMerit)
    {
        this.age=age;
        this.id=id;
        this.isMerit=isMerit;
        this.name=name;


    }

    static public boolean isMerit()
    {
        if(isMerit==true)
            return true;
        else
            return false;
    }

    static public String getName()
    {
        return name;
    }




}
