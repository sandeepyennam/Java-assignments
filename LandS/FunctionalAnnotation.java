public class FunctionalAnnotation {

    @FunctionalInterface
    interface employee
    {
        public String employeeName(String str);
    }

    static public void employeeDetails(String emp,employee e)
    {
        System.out.println( e.employeeName(emp));

    }

    public static void main(String[] args) {
        employeeDetails("sandeep",(str)->"hello "+str);
    }



}
