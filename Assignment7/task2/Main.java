package Assignment7.task2;

public class Main {
    public static void main(String[] args) {
        Cycle[] c=new Cycle[3];
        System.out.println("Before Typecasting");
        c[0]=new Unicycle();
        c[0].balance();
        c[1]=new Bicycle();
        c[1].balance();
        c[2]=new Tricycle();
        c[2].balance();
        System.out.println("After Typecasting");
        Unicycle u=(Unicycle)c[0];
        Bicycle b=(Bicycle) c[1];
        Tricycle T=(Tricycle) c[2];
        u.balance();
        b.balance();
        T.balance();


    }
}
