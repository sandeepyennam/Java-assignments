import java.net.InetAddress;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class assignmnet3 {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            String ipAddress = sc.nextLine(); //"127.0.0.1";
            InetAddress inet = InetAddress.getByName(ipAddress);
            System.out.println("Sending Ping Request to " + ipAddress);
            long[] arr=new long[5];

            for(int i=0;i<5;i++) {
                long finish = 0;

                long start = new GregorianCalendar().getTimeInMillis();

                if (inet.isReachable(20000)) {
                    System.out.println(ipAddress + " is reachable.");
                    finish = new GregorianCalendar().getTimeInMillis();
                    System.out.println(finish - start);
                    arr[i]=(finish-start);

                } else {
                    System.out.println(ipAddress + " NOT reachable.");
                }

            }
            Arrays.stream(arr).sorted();
            System.out.println(arr[2]);

        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }

}