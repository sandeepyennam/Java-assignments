package Assignment12;

public class Student {

    int id;
    String name;
    int age;
    String gender;
   String engDepartment;
   int yearOfEnrollment;
   Double perTillDate;

   public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,Double perTillDate)
   {
       this.age=age;
       this.engDepartment=engDepartment;
       this.gender=gender;
       this.id=id;
       this.name=name;
       this.perTillDate=perTillDate;
       this.yearOfEnrollment=yearOfEnrollment;

   }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public double getPerTillDate() {
        return perTillDate;
    }


}
