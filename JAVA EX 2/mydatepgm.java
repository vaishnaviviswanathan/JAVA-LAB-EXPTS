package datepackage;
import java.util.*;
public class mydatepgm
{
Date d1=new Date();
Scanner in=new Scanner(System.in);
public int date,month,day,year,hours,minutes,seconds;
public String dayy,mon;
//default constructor 
public mydatepgm()
{
date=d1.getDate();
day=d1.getDay();
dayy=getDay();
month=d1.getMonth();
mon=getMonth();
year=d1.getYear();
hours=d1.getHours();
minutes=d1.getMinutes();
seconds=d1.getSeconds();
}



public mydatepgm(int da,int d,int m,int y,int h,int mn,int s)
{
day=da;
date=d;
month=m;
year=y;
hours=h;
minutes=mn;
seconds=s;
}



public mydatepgm(int d,int m,int y)
{
date=d;
month=m;
year=y;
}


public String getDay()
{
switch(day)
{
case 0:return("Sunday");
case 1:return("Monday");
case 2:return("Tuesday");
case 3:return("Wednesday");
case 4:return("Thursday");
case 5:return("Friday");
case 6:return("Saturday");
default:return("error!");
}//switch close
}



public String getMonth()
{
switch(month)
{
case 0:return("Jan");
case 1:return("Feb");
case 2:return("March");
case 3:return("April");
case 4:return("May");
case 5:return("June");
case 6:return("July");
case 7:return("August");
case 8:return("Sept");
case 9:return("Oct");
case 10:return("Nov");
case 11:return("Dec");
default:return("error!");
}//switch close
}


public void settday(int da)
{
day=da;
settdayy(day);
}

public void settdayy(int d)
{
switch(d)
{

case 0:dayy="Sun";
break;
case 1:dayy="Mon";
break;
case 2:dayy="Tues";
break;
case 3:dayy="Wed";
break;
case 4:dayy="Thurs";
break;
case 5:dayy="Fri";
break;
case 6:dayy="Sat";
break;
}
}

public String gettday()
{
return dayy;
}


public void settmonth(int da)
{
month=da;
settmon(month);
}

public void settmon(int m)
{
switch(m)
{
case 0:mon="Jan";
break;
case 1:mon="Feb";
break;
case 2:mon="March";
break;
case 3:mon="April";
break;
case 4:mon="May";
break;
case 5:mon="June";
break;
case 6:mon="July";
break;
case 7:mon="August";
break;
case 8:mon="Sept";
break;
case 9:mon="Oct";
break;
case 10:mon="Nov";
break;
case 11:mon="Dec";
break;
}//switch close
}

public String gettmonth()
{
return mon;
}

public int gettdate()
{
return date;
}
public void settdate(int da)
{
date=da;
}
public int gettminutes()
{
return minutes;
}
public void settminutes(int da)
{
minutes=da;
}

public int gettseconds()
{
return seconds;
}
public void settseconds(int da)
{
seconds=da;
}
public int getthours()
{
return hours;
}
public void setthours(int da)
{
hours=da;
}

public int gettyear()
{
return year;
}
public void settyear(int da)
{
year=da;
}

public void gettfulltime() 
{
System.out.println("\nThe Time is :- "+hours+" : "+minutes+" : "+seconds);
}

public void settfulltime() 
{
System.out.print("\nEnter Hours : ");
hours=in.nextInt();
System.out.print("\nEnter Minutes : " );
minutes=in.nextInt();
System.out.print("\nEnter Seconds : ");
seconds=in.nextInt();
}



public void gettfulldate()
{
System.out.println("\nThe Full Date is :- "+dayy+" , "+mon+" , "+date+" , "+(year+1900));
}
public void settfulldate()
{
System.out.print("\nEnter Day : ");
day=in.nextInt();
System.out.print("\nEnter Month : " );
month=in.nextInt();
System.out.print("\nEnter Year : ");
year=in.nextInt();
}

public int equals(mydatepgm d2)
{
if((d2.year==year) && (d2.month==month) && (d2.date==date))
return 0;
else
return 1;
}

public int after(mydatepgm d)
{
if(year<=d.year)
 if(month<=d.month)
   if(date<=d.date)
      return 0;
return 1;
}

public int before(mydatepgm d)
{
if(year>=d.year)
 if(month>=d.month)
   if(date>=d.date)
      return 0;
return 1;
}

public int compareTo(mydatepgm d) 
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

public String toString()
{
dayy=getDay();
mon=getMonth();
String s=dayy+", "+date+"-"+mon+"-"+(year+1900)+" "+hours+":"+minutes+":"+seconds;
return s;
}


}//class close