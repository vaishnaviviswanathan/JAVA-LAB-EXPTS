package myjava.myutil;
import java.util.*;
import java.lang.*;


/** class representing the Date class in util and its functionalities using mydate
  * @author vaishnavi
  * @version 1.0
  */

public class myDatee
{
Date d1=new Date();
public int day,month;
public int date,year,hours,min,sec;
public String mon,dayy;
 Scanner in=new Scanner(System.in);

/** default constructor initialising date as system date
   */
public myDatee()
{
day=d1.getDay();
dayy=getDay();
date=d1.getDate();
month=d1.getMonth();
mon=getMonth();
year=d1.getYear();
hours=d1.getHours();
min=d1.getMinutes();
sec=d1.getSeconds();
}

/** explicit constructor initialising date and time.
     * @param da day
	 * @param d date
	 * @param m month
	 * @param y year
	 * @param h hours
	 * @param m minutes
	 * @param s seconds
  */

public myDatee(int da,int d,int m,int y,int h,int mn,int s)
{
day=da;
date=d;
month=m;
year=y;
hours=h;
min=mn;
sec=s;
}

/** explicit constructor initialising date and time.
     * @param d date
	 * @param m month
	 * @param y year
  */

public myDatee(int d,int m,int y)
{
date=d;
month=m;
year=y;
}

/** A method that returns the day
 *  @return String
*/

public String getDay()
{
switch (day)
 {
  case 0: return("Sunday");
  case 1: return("Monday");
  case 2: return("Tueday");
  case 3: return("Wednesday");
  case 4: return("Thursday");
  case 5: return("Friday");
  case 6: return("Saturday");
  default : return("blah");
 }
}
 
 /** A method that returns the date
 *  @return int
*/

public int getDate()
{
return date;
}

/** A method that returns the month
 *  @return String
 */

public String getMonth()
{
switch (month)
 {
  case 0: return("Jan");
  case 1: return("Feb");
  case 2: return("March");
  case 3: return("Apr");
  case 4: return("May");
  case 5: return("june");
  case 6: return("july");
  case 7: return("Aug");
  case 8: return("Sept");
  case 9: return("Oct");
  case 10: return("Nov");
  case 11: return("Dec");
  default : return("blah");
 }
}

 /** A method that returns the year
   *  @return int
   */

public int getYear()
{
return year;
}

 /** A method to get the Date
   *  @return void
   */

public void getFullDate()
{
System.out.println("\nThe Full Date is :- "+date+" , "+mon+" , "+(year+1900)+" , "+dayy);
}

 /** A method to set the day
   * @param da day 
   * @return void
   */

public void setDay(int da)
{
day=da;
}

 /** A method to set the date
   * @param d date
   * @return void
   */

public void setDate(int d)
{
date=d;
}

 /** A method to set the year
   * @param y year 
   * @return void
   */

public void setYear(int y)
{
year=y;
}

 /** A method to set the month
   * @param m month
   * @return void
   */

public void setMonth(int m)
{
month=m;
}

 /** A method to set the Date
   * @return void
   */

public void setFullDate()
{
System.out.print("\nEnter Day : ");
day=in.nextInt();
System.out.print("\nEnter Month : " );
month=in.nextInt();
System.out.print("\nEnter Year : ");
year=in.nextInt();
}


 /** A method to get the hours 
   * @return int
   */


public int getHours() 
{
return hours;
}

 /** A method to get the minutes 
   * @return int
   */
   
public int getMinutes() 
{
return min;
}

 /** A method to get the seconds
   * @return int
   */
   
public int getSeconds() 
{
return sec;
}

 /** A method to get the Time
   * @return void
   */

public void getTime() 
{
System.out.println("\nThe Time is :- "+hours+" : "+min+" : "+sec);
}

 /** A method to set the hours 
   * @param h hours
   * @return void
   */

public void setHours(int h) 
{
hours=h;
}

 /** A method to set the minutes
   * @param m minutes
   * @return void
   */

public void setMinutes(int m)
{
min=m;
}

 /** A method to set the seconds 
   * @param s seconds
   * @return void
   */

public void setSeconds(int s)
{
sec=s;
}

 /** A method to set the Time
   * @return void
   */

public void setTime() 
{
System.out.print("\nEnter Hours : ");
hours=in.nextInt();
System.out.print("\nEnter Minutes : " );
min=in.nextInt();
System.out.print("\nEnter Seconds : ");
sec=in.nextInt();
}

 /** A method to check whether the dates are equal or not 
   * @param d object of myDate
   * @return int 
   */

public int equals(myDatee d)
{
if((d.year==year)&&(d.month==month)&&(d.date==date))
return 1;
else
return 0;
}

 /** A method to check whether a date is after a specified date
   * @param d object of myDate
   * @return int 
   */

public int after(myDatee d)
{
if(year<=d.year)
 if(month<=d.month)
   if(date<=d.date)
      return 0;
return 1;
}

 /** A method to check whether a date is before a specified date
   * @param d object of myDate
   * @return int 
   */

public int before(myDatee d)
{
if(year>=d.year)
 if(month>=d.month)
   if(date>=d.date)
      return 0;
return 1;
}

 /** A method to compare two dates
   * @param d object of myDate
   * @return int 
   */

public int compareTo(myDatee d) 
{
if((d.year==year)&&(d.month==month)&&(d.date==date))
return 0;
else
{
if((year>d.year)||((year==d.year)&&(month>d.month))||((year==d.year)&&(month==d.month)&&(date>d.date)))
return 1;
else
return -1;
}
}

 /** A method to convert a date object to a String
   * @return String
   */

public String toString()
{
dayy=getDay();
mon=getMonth();
String s=dayy+", "+date+"-"+mon+"-"+(year+1900)+" "+hours+":"+min+":"+sec;
return s;
}
}

