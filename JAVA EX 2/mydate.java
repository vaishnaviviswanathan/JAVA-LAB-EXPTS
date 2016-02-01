
import java.util.*;
import datepackage.*;

public class mydate
{
public static void getvalues(int op,mydatepgm dl)
{
System.out.println("\n MENU \n");
System.out.println("\nSUB MENU");
System.out.println("1.  Day");
System.out.println("2.  Date ");
System.out.println("3.  Month");
System.out.println("4.  Year");
System.out.println("5.  Hours");
System.out.println("6.  Minutes");
System.out.println("7.  Seconds");
System.out.println("8.  Time");
System.out.println("9.  Date");
System.out.println("10. EXIT");

Scanner in= new Scanner(System.in);
int ch=0;
do{
System.out.println("Your Choice Is : ");
ch=in.nextInt();
switch(ch)
{
case 1:

{if(op==1)
{System.out.println("the day today is"+dl.gettday());}
else
{
System.out.println("\n enter the new day:");
int day=in.nextInt();
dl.settday(day);}
break;}

case 2:
{
if(op==1){
System.out.println("the date is"+dl.gettdate());}
else{
System.out.println("\n enter the new date:");
int date=in.nextInt();
dl.settdate(date);
}

break;
}
case 3:
{
if(op==1){
System.out.println("the month:"+dl.gettmonth());}
else
{
System.out.println("\n enter the new month:");
int mont=in.nextInt();
dl.settmonth(mont);}
break;
} 
case 4:
{if(op==1){
System.out.println("the year"+(dl.gettyear()+1900));}
else
{
System.out.println("\n enter the new year:");
int yr=in.nextInt();
dl.settyear(yr);}
break;
}
case 5:
{if(op==1){
System.out.println(" hours:"+dl.getthours());}
else
{System.out.println("\n enter the new hour:");
int hr=in.nextInt();
dl.setthours(hr);}
break;
}
case 6:
{if(op==1)
{System.out.println(" minutes:"+dl.gettminutes());}
else
{System.out.println("\n enter the new minutes:");
int minut=in.nextInt();
dl.settminutes(minut);}
break;
}
case 7:
{if(op==1)
{System.out.println(" seconds:"+dl.gettseconds());}
else
{System.out.println("\n enter the new seconds:");
int secon=in.nextInt();
dl.settseconds(secon);}
break;
}
case 8:
{if(op==1)
{dl.gettfulltime();}
else
{dl.settfulltime();}
break;
}
case 9:
{if(op==1)
{dl.gettfulldate();}
else
{dl.settfulldate();}
break;
}
default:
{
System.out.println("ERROR!");
break;
}
}//switch close
}while(ch!=10);
}//function close


public static void compare(int ch)
{
int d,m,y,d1,m1,y1;
Scanner s1=new Scanner(System.in);

		        System.out.print("\nEnter Date1 ");
				System.out.print("\nDate (dd) : ");
			    d=s1.nextInt();	
				System.out.print("Month (mm) : ");
				m=s1.nextInt();
				System.out.print("Year (yyyy) : ");
				y=s1.nextInt();
				
			    System.out.print("\nEnter Date2 ");
				System.out.print("\nDate (dd) : ");
			    d1=s1.nextInt();	
				System.out.print("Month (mm) : ");
				m1=s1.nextInt();
				System.out.print("Year (yyyy) : ");
				y1=s1.nextInt();
				
				mydatepgm date1=new mydatepgm(d,m,y); 
				mydatepgm date2=new mydatepgm(d1,m1,y1);
				System.out.println("\nDATE 1 : "+date1.date+"-"+date1.month+"-"+date1.year);
				System.out.println("DATE 2 : "+date2.date+"-"+date2.month+"-"+date2.year);
				
				System.out.print("\n");
			
				
				if(ch==3)//check equals
				{
				if(date1.equals(date2)==0)
				System.out.println("\n the dates are equal");
				else
				System.out.println("\n the dates are not equal");
				}
				
				
				 else if(ch==4) // checks for after
          {
		    if(date1.after(date2)==1)
            System.out.println("\nDate1 COMES AFTER Date2!!");
            else
            System.out.println("\nDate1 DOESNOT COME AFTER Date1!!");
          }
          else if(ch==5) // checks for before
          {
		    if(date1.before(date2)==1)
            System.out.println("\nDate1 COMES BEFORE Date2!!");
            else
            System.out.println("\nDate1 DOESNOT COME BEFORE Date2!!");
          }
		  else if(ch==6)
		  {
		  int retval=date1.compareTo(date2);
		    if(retval==0)
			  System.out.println("\nDate1 and Date2 Are Equal!!");
			else if(retval>0)
			   System.out.println("\nDate1 is greater than Date2!!");
			else
			  System.out.println("\nDate2 is greater than Date1!!");
		  }
				
				
				
}//method close


public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
mydatepgm dl=new mydatepgm();
do{
System.out.println("\n 1.GET VALUES \n 2.SET VALUES \n 3.EQUALS \n 4.AFTER \n 5.BEFORE \n 6.COMPARETO \n 7.TOSTRING \n");
System.out.println("\n enter the option\n");
int op=s1.nextInt();
switch(op)
{
case 1:
{
getvalues(op,dl);
break;
}
case 2:
{
getvalues(op,dl);
break;
}
case 3:
{
compare(op);//equals
break;
}
case 4:
{
compare(op);//after
break;
}
case 5:
{
compare(op);//before
break;
}
case 6:
{
compare(op);//compare
break;
}
case 7:
{
Scanner in=new Scanner(System.in);
int day,dd,mm,yy,h,min,sec;
                System.out.print("\nEnter Date1 ");
				System.out.print("\nDay       : ");
			    day=in.nextInt();	
				System.out.print("Date (dd) : ");
			    dd=in.nextInt();	
				System.out.print("Month (mm)  : ");
				mm=in.nextInt();
				System.out.print("Year (yyyy) : ");
				yy=in.nextInt();
				System.out.print("Hours     : ");
				h=in.nextInt();
				System.out.print("Minutes   : ");
				min=in.nextInt();
				System.out.print("Seconds   : ");
				sec=in.nextInt();
				mydatepgm date=new mydatepgm(day,dd,mm,yy,h,min,sec);
				String s=date.toString();
				System.out.print("Date In String Form : "+s);
break;
}
default:
{
System.exit(1);
break;
}
}//switch close
}while(true);
}//public main close
}//class close