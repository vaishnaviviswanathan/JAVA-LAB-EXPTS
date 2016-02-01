
import java.util.*;
import myjava.MyDate;

public class mymain2
{
   public static void main(String[] args)
   {
	String str;
	int ch,dat,mon,yr,hr,min,sec;
	Scanner in=new Scanner(System.in);
	do
	{
	System.out.println("\nMenu\n1.Set the date and time\n2.Print current date and time\n3.Set the time\n4.Set the date\n5.Compare dates\n6.Test if a date is before the current date\n7.Test if a date is after the current date\n8.check if two dates are equal\n9.Exit");
	ch=in.nextInt();
	switch(ch)
	{
		case 1:System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
		       System.out.println("Enter the hours : ");
	               hr=in.nextInt();
		       System.out.println("Enter the minutes : ");
	               min=in.nextInt();		
		       System.out.println("Enter the seconds : ");
	               sec=in.nextInt();	
		       MyDate dt=new MyDate(dat,mon,yr,hr,min,sec);
		       System.out.println("Entered date and time :  "+dt.toStrings());
		       break;
		case 2:MyDate dt1=new MyDate();
		       System.out.println("Current date and time :  "+dt1.toStrings());
		       break;
		case 3:System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
      	  	       MyDate d=new MyDate(dat,mon,yr);
		       System.out.println("Entered date : "+d.getfullTime());
		       break;
		case 4:System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
      	  	       MyDate d1=new MyDate(dat,mon,yr);
		       System.out.println("Entered date : "+d1.getfullDate());
		       break;
		case 5:System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
      	  	       MyDate d3=new MyDate(dat,mon,yr);
		       System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
			MyDate d2=new MyDate(dat,mon,yr);
		       if(d3.compareTo(d2)==0)
				System.out.println("Two dates are equal!");
		       else if(d3.compareTo(d2)<0)
				System.out.println("First date comes earlier!!");
		       else
				System.out.println("Second date comes earlier!");
		       break;
		case 6:System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
      	  	       MyDate d4=new MyDate(dat,mon,yr);
      	  	       MyDate d5=new MyDate();
		       if(d5.before(d4))
				System.out.println("Entered date comes earlier!!");
		       else 
				System.out.println("Entered date comes later!!");
		       break;
		case 7:MyDate d6=new MyDate();
		       System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
      	  	       MyDate d7=new MyDate(dat,mon,yr);
		       if(d6.after(d7))
				System.out.println("Entered date comes later!!");
		       else 
				System.out.println("Entered date comes earlier!!");
		       break;
		case 8:System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
      	  	       MyDate d8=new MyDate(dat,mon,yr);
		       System.out.println("Enter the date : ");
	               dat=in.nextInt();
		       System.out.println("Enter the month : ");
		       mon=in.nextInt();
		       System.out.println("Enter the year : ");
	               yr=in.nextInt();
			MyDate d9=new MyDate(dat,mon,yr);
		       if(d8.equals(d9))
				System.out.println("Two dates are equal!");
		       else
				System.out.println("Two dates are not equal!");
		       break;
		case 9:break;
	}
      	}while(ch!=9);
      }
}
