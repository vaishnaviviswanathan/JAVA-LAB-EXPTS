import java.util.*;
import java.lang.Math;
class datefunction2
{
public static void main(String a[])
{
Date d=new Date();
System.out.println("\n todays date is"+d);
Date dt=new Date(1994-1900,1,11); //february 11 1994
System.out.println("\n day of the week"+" "+dt.getDay());
//clone creation
System.out.println("\nthe clone for 'dt' object is"+dt.clone());
System.out.println("\nthe clone for 'd' object is"+d.clone()); 
//setting and getting the year,month,date,hours,minutes,seconds
d.setYear(1994);
System.out.println("\n get the year"+d.getYear());
//get the day
//d.setDay(3);
System.out.println("\n get the day"+d.getDay());
d.setMonth(1);
System.out.println("\nget the month"+d.getMonth());
d.setDate(11);
System.out.println("\n get the date"+d.getDate());
d.setHours(3);
System.out.println("\n get the hours"+d.getHours());
d.setMinutes(45);
System.out.println("\n get the minutes"+d.getMinutes());
d.setSeconds(5);
System.out.println("\n get the seconds"+d.getSeconds());
System.out.println("\n to print the date in string format"+d.toString());
//printing the whole date changed together
System.out.println("\n the changed date is:"+d);
//time in milli second since epoch
System.out.println("Time in milli second since epoch" +dt.getTime());
Date d1=new Date();
Date d2=new Date(2013,1,11);
//after 
System.out.println("\n to check whether d2 comes after d1"+d1.after(d2));
System.out.println("\n to check whether d1 comes after d2"+d2.after(d1));
//before
System.out.println("\n to check whether d2 comes before d1"+d1.before(d2));
System.out.println("\n to check whether d1 comes before d2"+d2.before(d1));
//compateTo
System.out.println("\n to compare two dates"+d1.compareTo(d1));
System.out.println("\n to compare the dates d2 and d1\t"+d1.compareTo(d2));
System.out.println("\n to compare the dates d1 and d2\t"+d2.compareTo(d1));
//equals
System.out.println("\n to check whether the two dates equals"+d1.equals(d2));
System.out.println("\n to check whether the two dates equals"+d1.equals(d1));
System.out.println("UTC Equivalence\t" +dt.UTC(2013,1,11,3,45,45));
System.out.println("Parse\t" +dt.parse("Fri 11 Feb 1994 3:45:10 GMT"));
}//function close
}