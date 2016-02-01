import java.util.*;
/** Illustrates date class functionality*/
class datefunc
{
public static void main(String[] a)
{
Date dt=new Date();
System.out.println("Date" +dt);
Date dp = new Date(63, 0, 16);// January 16, 1963
System.out.println("Day of the week: " + dp.getDay());
//clone for dpobject
System.out.println("\nclone\t"+dp.clone());
//clone for dt object
System.out.println("\nclone\t"+dt.clone());
System.out.println("Year"+dt.getYear());
dt.setYear(93);
System.out.println("New Year"+dt.getYear());
System.out.println("Month"+dt.getMonth());
dt.setMonth(11);
System.out.println("New Month"+dt.getMonth());
System.out.println("Date"+dt.getDate());
dt.setDate(07);
System.out.println("New Date"+dt.getDate());
System.out.println("Hours"+dt.getHours());
dt.setHours(0);
System.out.println("New Date"+dt.getHours());
System.out.println("Minutes"+dt.getMinutes());
dt.setMinutes(20);
System.out.println("New Minutes"+dt.getMinutes());
System.out.println("Seconds"+dt.getSeconds());
dt.setSeconds(47);
System.out.println("New Seconds"+dt.getSeconds());
System.out.println("New Date:"+dt);
System.out.println("Day:"+dt.getDay());
System.out.println("Time in milli second since epoch" +dt.getTime());
//date with year month and date
Date dt8=new Date();
Date dt1= new Date(1993,11,6);
System.out.println("Is 7/12/1993 after system date?" +dt8.after(dt1));
//date with year month date hours and minutes
Date dt2= new Date(1993,11,6,12,34);
System.out.println("Is 7/12/1993 before system date?" +dt8.before(dt2));
//date with year month date ours and minutes and seconds
Date dt3= new Date(2013,12,7,12,34,9);
System.out.println("how does 12/7/2013 compare system date?" +dt8.compareTo(dt3));
Date dt7= new Date(2013,14,7);
//comparing the same dates
System.out.println("compare the system date with itself" +dt8.compareTo(dt8));
Date dt4= new Date(2013,20,9);
System.out.println("how does 20/10/2013 compare system date?" +dt8.compareTo(dt4));
Date dt5= new Date();
System.out.println("Is 14/8/2013 equals system date?" +dt8.equals(dt8));
Date dt6= new Date(2013,12,7);
System.out.println("Is 12/7/2013 equals system date?" +dt8.equals(dt6));
System.out.println("Date in string format"+ dt.toString());
System.out.println("UTC Equivalence" +dt.UTC(2013,7,9,1,32,00));
System.out.println("Parse" +Date.parse("Tue 09 Jul 2013 13:43:35 GMT"));
}
}




