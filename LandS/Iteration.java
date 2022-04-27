import java.util.*;

public class Iteration {

    static List<Student> list=new ArrayList<Student>();
    public void add()
    {
        Student s1=new Student("sandeep","100",18,true);
        Student s2=new Student("john","101",15,false);
        Student s3=new Student("preethy","100",18,true);
        Student s4=new Student("kamal","100",16,false);
        Student s5=new Student("randy","100",12,true);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);


    }

    public static void main(String[] args) {

        list.stream().filter(student1 -> student1.isMerit()).map(student -> student.getName()).forEach(System.out::println);
    }

}
