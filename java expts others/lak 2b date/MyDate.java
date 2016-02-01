package myjava;

import java.util.*;
import java.text.*;

/** MyDate class similar to the date class in java
  * @author Lakshmipriya
  * @version 1.0(06/07/13)
*/
public class MyDate 
{

    private int date,month,year,hours,minutes,seconds;
    private String day,months;
    public String retmon(int n)
    {
     
        if(n==1)
        	return "Jan";
        else if(n==2)
        	return "Feb";
        else if(n==3)
        	return "Mar";
        else if(n==4)
        	return "Apr";
        else if(n==5)
        	return "May";
        else if(n==6)
        	return "Jun";
        else if(n==7)
        	return "Jul";
        else if(n==8)
        	return "Aug";
        else if(n==9)
        	return "Sep";
        else if(n==10)
        	return "Oct";
        else if(n==11)
        	return "Nov";
        else
        	return "Dec";              
     
    }
   
    public String retday(int n)
    {
            if(n==1)
             	return "Sun";
            else if(n==2)
            	return "Mon";
            else if(n==3)
             	return "Tue";
            else if(n==4)
             	return "Wed";
            else if(n==5)
             	return "Thu";
            else if(n==6)
             	return "Fri";
            else
             	return "Sat";       
    }
	/** Initialises date object to the current time */
    public MyDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("EEE");
        Date dat = new Date();
        day=dateFormat.format(dat);
        Calendar calendar = Calendar.getInstance();
        date=calendar.get(Calendar.DATE)+1;
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH)+1;
        hours=calendar.get(Calendar.HOUR_OF_DAY);
        minutes=calendar.get(Calendar.MINUTE);
        seconds=calendar.get(Calendar.SECOND);
	months=retmon(month);
    }
	/** Sets the date 
	 * @param dat the date
	 * @param mon the month
	 * @param yer the year
	*/
    public MyDate(int dat,int mon,int yer)
    {
        date=dat;
        Calendar calendar = Calendar.getInstance();
        year=yer;
        month=mon;
        hours=calendar.get(Calendar.HOUR_OF_DAY);
        minutes=calendar.get(Calendar.MINUTE);
        seconds=calendar.get(Calendar.SECOND);
        calendar.set(year,month-1,date);
        day=retday(calendar.getTime().getDay()+1);
        months=retmon(month);
    }
	/** Sets the date and time
	 * @param dat the date
	 * @param mon the month
	 * @param yer the year
	 * @param hur hours
	 * @param min minutes
	 * @param sec seconds
	*/ 
    public MyDate(int dat,int mon,int yer,int hur,int min,int sec)
    {
        date=dat;
        Calendar calendar = Calendar.getInstance();
        year=yer;
        month=mon;
        hours=hur;
        minutes=min;
        seconds=sec;
        calendar.set(year,month-1,date,hours,minutes,seconds);
        day=retday(calendar.getTime().getDay()+1);
        months=retmon(month);       
    }
    /** Returns the day
	  * @return the day in words
	  */
    public String getDay()
    {
        return day;
    }
    /** Returns the date
	  * @return the date 
	  */
    public int getDate()
    {
        return date;
    }
	/** Returns the month
	  * @return the month
	  */
    public int getMonth()
    {
        return month;
    }
	/** Returns the year
	  * @return the year
	  */
    public int getYear()
    {
        return year;
    }
 	/** Returns the fulldate
	  * @return the fulldate as [date,month,year,day]
	  */
    public String getfullDate()
    {
        String str=date+","+months+","+year+","+day;
		return str;
    }
	/** splits and set the corresponding value
	  * @param dat date in the form  [date,month,year,day]
	  */
    public void setfullDate(String dat)
    {
        int tag=0,i=0,j=0;
        String word;
        while(i<dat.length())
        {
           
            if(dat.charAt(i)==',')
            {
                word=dat.substring(j,i);
               
                tag++;
                if(tag==1)
                {
                    date=Integer.parseInt(word);
                }
                else if(tag==2)
                {
                    months=word;
                }
                else if(tag==3)
                {
                    year=Integer.parseInt(word);
                }
               
                j=i+1;
            }
            i++;
        }
        word=dat.substring(j,j+3);
        day=word;
    }
   /** Sets the date
	 * @param dat the date
 	 */
    public void setDate(int dat)
    {
        date=dat;
    }
    /** Sets the year
	 * @param yer the year
 	 */
    public void setYear(int yer)
    {
        year=yer;
    }
    /** Sets the month
	 * @param mon the month
 	 */
    public void setMonth(int mon)
    {
        month=mon;
    }
	/** Returns  hours
	  * @return  hours
	  */
    public int getHours()
    {
        return hours;
    }
   	/** Returns  minutes
	  * @return  minutes
	  */
    public int getMinutes()
    {
        return minutes;
    }
   	/** Returns  seconds
	  * @return  seconds
	  */
    public int getSeconds()
    {
        return seconds;
    }
	/** Returns the fulltime
	  * @return the fulltime as [hours:minutes:seconds]
	  */
   	public String getfullTime()
	{
		String str=hours+":"+minutes+":"+seconds;
		return str;
	}
	/** splits and set the corresponding value
	  * @param dat date in the form  [hours:minutes:seconds]
	  */
	public void setfullTime(String dat)
    {
        int tag=0,i=0,j=0;
        String word;
        while(i<dat.length())
        {
           
            if(dat.charAt(i)==':')
            {
                word=dat.substring(j,i);
                tag++;
                if(tag==1)
                {
                    hours=Integer.parseInt(word);
                }
                else if(tag==2)
                {
                    minutes=Integer.parseInt(word);
                }
                else if(tag==3)
                {
                    seconds=Integer.parseInt(word);
                }
                j=i+1;
            }
            i++;
        }
        word=dat.substring(j,j+3);
        day=word;
    }
	/** Sets the hours
	 * @param hor hours
 	 */
    public void setHours(int hor)
    {
        hours=hor;
    }
	/** Sets the minutes
	 * @param minute the minutes
 	 */
    public void setMinutes(int minute)
    {
        minutes=minute;
    }
	/** Sets the seconds
	 * @param second seconds
 	 */
    public void setSeconds(int second)
    {
        seconds=second;
    } 
	/** checks whether dates are equal or not
      * @param d the date to be compared
      */
	public boolean equals(MyDate d)
	{
		if((d.date==date)&&(d.month==month)&&(d.year==year))
			return true;
		else
			return false;
	}
	/**  Compares two Dates for ordering.
      * @param d the date to be compared
      */
	public int compareTo(MyDate d)
	{
		if((d.date==date)&&(d.month==month)&&(d.year==year))
			return 0;		
		if(d.getYear()==year)
		{
			if(d.getMonth()==month)
			{
				if(d.getDate()<date)
					return +1;
				else
					return -1;
			}
			else if(d.getMonth()>month)
				return -1;
			else
				return +1;
		}
		if(d.getYear()>year)
			return -1;
		else
			return +1;
	}
	 /**  Tests if this date is after the specified date.
      * @param d the date to be compared
      */
	public boolean after(MyDate d)
	{
		if((d.date==date)&&(d.month==month)&&(d.year==year))
			return false;		
		if(d.getYear()==year)
		{
			if(d.getMonth()==month)
			{
				if(d.getDate()>date)
					return true;
				else
					return false;
			}
			else if(d.getMonth()<month)
				return false;
			else
				return true;
		}
		if(d.getYear()<year)
			return false;
		else
			return true;
	}
	/**  Tests if this date is before the specified date.
      * @param d the date to be compared
      */
	public boolean before(MyDate d)
	{
		if((d.date==date)&&(d.month==month)&&(d.year==year))
			return false;		
		if(d.getYear()==year)
		{
			if(d.getMonth()==month)
			{
				if(d.getDate()<date)
					return true;
				else
					return false;
			}
			else if(d.getMonth()>month)
				return false;
			else
				return true;
		}
		if(d.getYear()>year)
			return false;
		else
			return true;
	}
	/** Converts this Date object to a String of the form
	  * @return the date
		*/
	public String toStrings()
	{
		String str=day+" "+months+" "+date+" "+hours+":"+minutes+":"+seconds+" "+"IST"+" "+year;
		return str;
	}
}
		
