import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        int totalCost=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("the Packages are");

        System.out.println("1.10$ per month including 2 courses, every addidtional course is 6$ \n " +
                "2.12$ per month including 4 courses per month,every additional course is 4$ \n" +
                "3.15$ per month including 6 courses per month,every additional course is 3$");

        System.out.println("Enter the package number that you want to buy and the number of courses");

        int PackageNumber = sc.nextInt();
        int NumberOfCourses = sc.nextInt();

        switch (PackageNumber)
        {
            case 1 : totalCost+=10;
                      if(NumberOfCourses>2)
                      {totalCost+=6*(NumberOfCourses-2);
                          break;}

            case 2 : totalCost+=12;

                          if(NumberOfCourses>4)
                          { totalCost+=4*(NumberOfCourses-4);
                              break;}

            case 3 :   totalCost+=10;
                         if(NumberOfCourses>6)
                         {totalCost+=3*(NumberOfCourses-6);
                            break;}

        }

        System.out.println("the totalcost is "+totalCost);

    }



}
