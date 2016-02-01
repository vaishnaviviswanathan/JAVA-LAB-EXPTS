import java.util.Date;
import java.util.Scanner;
import java.util.*;
public class datespgm
{
        public static void main(String a[])
        {
                Date date=new Date();
                System.out.println("current date and time"+date.toString());
                System.out.println(date.getTime());
                Date d=new Date();
                Scanner w=new Scanner(System.in);
                int yr,m,da;
                yr=w.nextInt();
                m=w.nextInt();
                da=w.nextInt();

                System.out.println("current date and time"+d.toString());
                System.out.println("comparing two dates"+d.compareTo(date));
                System.out.println("before method"+d.before(date));
                System.out.println("after method"+d.after(date));
                System.out.println("clone"+d.clone());
                System.out.println("equals"+d.equals(date));
                System.out.println("gettime"+d.getTime());
                //System.out.println("getdate"+d.getDate());//
                System.out.println("getminutes"+d.getMinutes());
                System.out.println("getmonth"+d.getMonth());
                System.out.println("getseconds"+d.getSeconds());
                System.out.println("getyr"+d.getYear());
                System.out.println("setting minutes");
                d.setMinutes(m);
                System.out.println("getMinutes"+d.getMinutes());
                System.out.println("setting hours");
                int hrs=w.nextInt();
                d.setHours(hrs);
                System.out.println("getHours"+d.getHours());
                System.out.println(Date.UTC(92,11,2,4,55,30));


                System.out.println("using constructors with paramers");
                Date v=new Date(yr,m,da);
                yr=w.nextInt();
                m=w.nextInt();
                da=w.nextInt();
                Date u=new Date(yr,m,da);
                System.out.println("current date"+v.toString());
                System.out.println("current date"+u.toString());
                System.out.println("comparing two dates"+v.compareTo(u));
                System.out.println("before method"+v.before(u));
                System.out.println("after method"+v.after(u));
                System.out.println("clone"+u.clone());
                System.out.println("equals"+v.equals(u));
                System.out.println("gettime"+u.getTime());
                System.out.println("getdate"+v.getDate());
                System.out.println("getminutes"+u.getMinutes());
                System.out.println("getmonth"+v.getMonth());
                System.out.println("getseconds"+u.getSeconds());
                System.out.println("getyr"+v.getYear());
                System.out.println("setting minutes");
                u.setMinutes(m);
                System.out.println("getMinutes"+u.getMinutes());
                System.out.println("setting hours");
                hrs=w.nextInt();
                u.setHours(hrs);
                System.out.println("getHours"+u.getHours());




        }

}