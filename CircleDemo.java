import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double radius=sc.nextDouble();

        Circle circle=new Circle(radius);
        System.out.println("The radius of the circle is");
        System.out.println(circle.getRadius());
        System.out.println("The area vof the circle is");
        System.out.println(circle.getarea());
        System.out.println("the circumpherence of the circle is");
        System.out.println(circle.getCircumpherence());
    }
}
