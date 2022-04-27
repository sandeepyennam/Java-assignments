package Assignment12;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
   static StudentList SList=new StudentList();
    static List<Student> list=SList.addStudents();

    static public void printAllDepartments()
    {
        System.out.println("printing all the distinct departments\n");
        list.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);
    }

    static public void enrolledAfter2018()
    {
        System.out.println("\nprinting all the students who enrolled after 2018 \n");
        list.stream().filter(Student->Student.yearOfEnrollment>2018).map(Student::getName).forEach(System.out::println);
    }
    static public void MaleCse()
    {
        System.out.println("\nprinting all the males in cse");
        list.stream().filter(Student->Student.gender.equals("Male")).filter(Student->Student.engDepartment.equals("Computer Science")).map(Student->Student.getName()).forEach(System.out::println);
    }

    static public void MaleFemaleCount()
    {
        System.out.println("\ncount of males and females is \n");
        System.out.println(list.stream().collect(Collectors.groupingBy((Student::getGender),Collectors.counting())));
    }

    static public void averageAge()
{
    System.out.println("\naverage age of males and females is\n");
    System.out.println(list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge))));

}

static public void highesPercentage()
{
    System.out.println("\n printing out the topper in class \n");

    System.out.println(list.stream().max(Comparator.comparing(Student::getPerTillDate)).map(Student::getName));
}



static public void studentsInEachDepartment()
{
    System.out.println("\nstudents count in each department");
    System.out.println(list.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting())));
}

static public void avgPercInDepartments()
{
    System.out.println("\n The average percentage in each department\n");

    System.out.println(list.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))));
}


static public void youngestMaleStudent()
{
    System.out.println("\n printing the youngest male in electrical Department\n");
    System.out.println(list.stream().filter(Student->Student.gender.equals("Male")).filter((Student student)->student.getEngDepartment()=="Electronic").collect(Collectors.minBy(Comparator.comparing(Student::getAge))).map(Student::getName));
}



       static public void maleAndFemaleCountInCse()
          {
              System.out.println("\nmale count and female count in cse branch \n");
              System.out.println(list.stream().filter(Student->Student.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
}


    public static void main(String[] args) {

       printAllDepartments(); //1
       enrolledAfter2018();  //2
       MaleCse();            //3
       MaleFemaleCount();//4
       averageAge();//5
       highesPercentage();//6
       studentsInEachDepartment();//7
       avgPercInDepartments();//8
       youngestMaleStudent();//9
        maleAndFemaleCountInCse();//10


    }
}
