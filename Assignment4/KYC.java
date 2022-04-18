package Assignment4;

import org.w3c.dom.css.CSSImportRule;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

    public class KYC {
        public static void main(String[] args) throws ParseException {
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
           for (int i=0;i<n;i++)
            {
                String signupdate= sc.next();
                String currdate= sc.next();
                SimpleDateFormat requiredType=new SimpleDateFormat("dd-MM-yyyy");
                Date signindate=new SimpleDateFormat("dd-MM-yyyy").parse(signupdate);
                Date currDate=new SimpleDateFormat("dd-MM-yyyy").parse(currdate);
                if(currDate.compareTo(signindate)>0)
                {
                    Date Kycstart;
                    Date kycend;
                    Calendar signupcalendar=Calendar.getInstance();
                    Calendar  Currdatecalendar=Calendar.getInstance();
                    signupcalendar.setTime(signindate);
                    Currdatecalendar.setTime(currDate);
                    signupcalendar.set(Calendar.YEAR,Currdatecalendar.get(Calendar.YEAR));
                    signupcalendar.add(Calendar.DATE,30);
                    kycend=signupcalendar.getTime();
                    signupcalendar.add(Calendar.DATE,-60);
                    Kycstart=signupcalendar.getTime();
                    if(Kycstart.compareTo(currDate)>0)
                    {
                        System.out.println("no range");
                    }
                    if(kycend.compareTo(currDate)>0)
                    {
                        kycend=currDate;
                    }
                    System.out.println(requiredType.format(Kycstart)+" "+requiredType.format(kycend));
                }
                else{
                    System.out.println("No range");
                }


            }//end while

        }
    }



