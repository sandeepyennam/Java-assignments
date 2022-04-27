public class ConstructorExample {
    public ConstructorExample()
    {
        System.out.println("This is the constructor with no arguments");
          new ConstructorExample(2);
    }
    public ConstructorExample(int a)
    {
        System.out.println("This is the second constructor ,the value is"+a);
    }

}
