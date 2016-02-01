import mypackage.myDatee;
import java.text.*;
import java.util.*;

/** class representing date functionalities 
  * @author v.vaishnavi
    */

public class myDateProg{

/** Static method representing the Get and Set functions present in Date class 
     * @param choice - GET/SET choice  
	 * @param d - object of class myDate
	 * @return void
  */

public static void subMenu(int choice,myDatee d)
{ int ch=0;

while(ch!=10)
{
if(choice==1)
System.out.println("\n  GET VALUES");
else
System.out.println("\n  SET VALUES");
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
System.out.print("Your Choice Is : ");
Scanner in= new Scanner(System.in);
ch=in.nextInt();

switch(ch)
{ 
case 1: if(choice==1)
        System.out.println("\nDay is : "+d.getDay());
        else
        { int day;
        System.out.print("\nEnter Day : ");
        day=in.nextInt();
        d.setDay(day);
        }
        break;
case 2: if(choice==1)
        System.out.println("\nDate is : "+d.getDate());
        else
        { int date;
        System.out.print("\nEnter Date : ");
        date=in.nextInt();
        d.setDate(date);
        }
        break;        
case 3: if(choice==1)
        System.out.println("\nMonth is : "+d.getMonth());
        else
        { int mon;
        System.out.print("\nEnter Month : ");
        mon=in.nextInt();
        d.setMonth(mon);
        }
        break;
case 4: if(choice==1)
        System.out.println("\nYear is : "+(d.getYear()+1900));
        else
        { int year;
        System.out.print("\nEnter Year : ");
        year=in.nextInt();
        d.setYear(year);
        }
        break;   
case 5: if(choice==1)
        System.out.println("\nHours is : "+d.getHours());
        else
        { int hours;
        System.out.print("\nEnter Hours : ");
        hours=in.nextInt();
        d.setHours(hours);
        }
        break;      
case 6: if(choice==1)
        System.out.println("\nMinutes is : "+d.getMinutes());
        else
        { int min;
        System.out.print("\nEnter Minutes : ");
        min=in.nextInt();
        d.setMinutes(min);
        }
        break;   
case 7: if(choice==1)
        System.out.println("\nSeconds is : "+d.getSeconds());
        else
        { int sec;
        System.out.print("\nEnter Seconds : ");
        sec=in.nextInt();
        d.setSeconds(sec);
        }
        break;   
case 8: d.getTime();
        break;
case 9: d.getFullDate();		
		break;
case 10 : break;
		
}
}
}


/** Static method representing the equals(),before(),after() and compareTo() functionalities of Date class
     * @param ch - equals/before/after/compareTo choice made
	 * @return void
  */
  
public static void checkAndCompare(int ch)
{
int d,m,y,d1,m1,y1;
Scanner in=new Scanner(System.in);

		        System.out.print("\nEnter Date1 ");
				System.out.print("\nDate (dd) : ");
			    d=in.nextInt();	
				System.out.print("Month (mm) : ");
				m=in.nextInt();
				System.out.print("Year (yyyy) : ");
				y=in.nextInt();
				
			    System.out.print("\nEnter Date2 ");
				System.out.print("\nDate (dd) : ");
			    d1=in.nextInt();	
				System.out.print("Month (mm) : ");
				m1=in.nextInt();
				System.out.print("Year (yyyy) : ");
				y1=in.nextInt();
				
				/** Initialising Date1 and Date2 .
                  * Calls parameterized constructor with 3 arguments.
                   */				  
				 
				myDatee date1=new myDatee(d,m,y); 
				myDatee date2=new myDatee(d1,m1,y1);
				System.out.println("\nDATE 1 : "+date1.date+"-"+date1.month+"-"+date1.year);
				System.out.println("DATE 2 : "+date2.date+"-"+date2.month+"-"+date2.year);
				
				System.out.print("\n");
		  if(ch==3) // checks for eqality
		  {
		    if(date1.equals(date2)==1)
            System.out.println("\nDate1 IS EQUAL TO Date2 : ");
            else
            System.out.println("Date1 IS NOT EQUAL TO Date2 ");
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
		  else  // compares the two dates
		  {
		    int retval=date1.compareTo(date2);
		    if(retval==0)
			  System.out.println("\nDate1 and Date2 Are Equal!!");
			else if(retval>0)
			   System.out.println("\nDate1 is greater than Date2!!");
			else
			  System.out.println("\nDate2 is greater than Date1!!");
		  }	   
		  
}

/** Main method
  * @param args of type string
  *	@return void
  */
	 
public static void main(String a[])
{
 int ch=0;
 myDatee d = new myDatee();  //Instantiating a object of class Date 
 while(ch!=8){
 System.out.println("\n\n\tMYDATE FUNCTIONALITIES\n");
 System.out.println("MAIN MENU");
 System.out.println("1. Get Values ");
 System.out.println("2. Set Values ");
 System.out.println("3. Check Equal ");
 System.out.println("4. Check After ");
 System.out.println("5. Check Before ");
 System.out.println("6. Compare To ");
 System.out.println("7. toString ");
 System.out.println("8. EXIT ");
 System.out.print("Your Choice is : ");
 Scanner in=new Scanner(System.in); //Instantiating a Scanner object
 ch=in.nextInt();
switch(ch)
{ 
  case 1: subMenu(ch,d);
          break;
  
  case 2: subMenu(ch,d);
          break;
  
  case 3: 
          checkAndCompare(ch);
          break;
  
  case 4: 
          checkAndCompare(ch);
          break;         
         
  case 5: 
          checkAndCompare(ch);
          break;        
		  
  case 6: checkAndCompare(ch);
          break;
  
  case 7:
         
		    /** Initialising Date1 and Date2 .
              * Calls parameterized constructor with 7 arguments.
              */	
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
				myDatee date=new myDatee(day,dd,mm,yy,h,min,sec);
				String s=date.toString();
				System.out.print("Date In String Form : "+s);
		}
		 break;
 case 8: 
         System.out.print("\n  Thank You!!");
		 break;
 }
}
}
}
