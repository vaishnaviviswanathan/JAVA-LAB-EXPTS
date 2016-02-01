import java.util.*;
import java.text.*;
import java.lang.Math;

/** class representing date functionalities
  * @author nekshan 
  * @version 1.0
    */

public class dateProg{

/** Static method representing the Get and Set functions present in Date class 
     * @param choice - GET/SET choice  
	 * @param d - object of class Date
	 * @return void
  */

public static void subMenu(int choice,Date d)
{ int ch=0;

while(ch!=8)
{
if(choice==1)
System.out.println("\n  GET VALUES");
else
System.out.println("\n  SET VALUES");
System.out.println("\nSUB MENU");
System.out.println("1. Day");
System.out.println("2. Date ");
System.out.println("3. Month");
System.out.println("4. Year");
System.out.println("5. Hours");
System.out.println("6. Minutes");
System.out.println("7. Seconds");
System.out.println("8. EXIT");
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
        //d.setDay(day);
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
}
}
}

/** Static method representing the equals(),before(),after() and compareTo() functionalities of Date class
     * @param ch - equals/before/after/compareTo choice made
	 * @return void
  */
public static void checkAndCompare(int ch)
{
Scanner in=new Scanner(System.in);

         try {     
		        System.out.print("\nEnter Date1 ( dd-MM-yyyy ) : ");
				String s1 = in.next();
				System.out.print("Enter Date2 ( dd-MM-yyyy ) : ");
				String s2 = in.next();
				
				// Converting Strings s1 and s2 to the Date Format "dd-MM-yyyy"
                
			    SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");				
				Date date1 = sd.parse(s1);  
				Date date2 = sd.parse(s2);
				System.out.print("\n");
		  if(ch==3) // checks for eqality
		  {
		    if(date1.equals(date2))
            System.out.println("\nDate1 : "+sd.format(date1)+" IS EQUAL TO Date2 : "+sd.format(date2));
            else
            System.out.println("Date1 : "+sd.format(date1)+" IS NOT EQUAL TO Date2 : "+sd.format(date2));
		  }
          else if(ch==4) // checks for after
          {
		    if(date1.after(date2))
            System.out.println("Date1 : "+sd.format(date1)+" COMES AFTER Date2 : "+sd.format(date2));
            else
            System.out.println("Date1 : "+sd.format(date1)+" DOESN'T COME AFTER Date2 : "+sd.format(date2));
          }
          else if(ch==5) // checks for before
          {
		    if(date1.before(date2))
            System.out.println("Date1 : "+sd.format(date1)+" COMES BEFORE Date2 : "+sd.format(date2));
            else
            System.out.println("Date1 : "+sd.format(date1)+" DOESN'T COME BEFORE Date2 : "+sd.format(date2));
          }
		  else  // compares the two dates
		  {
		    int retval=date1.compareTo(date2);
		    if(retval==0)
			  System.out.println("Date1 : "+sd.format(date1)+" and Date2 : "+sd.format(date2)+" Are Equal!!");
			else if(retval>0)
			  {
			   System.out.println("Date1 : "+sd.format(date1)+" is greater than Date2 : "+sd.format(date2));
			  }
			else
			  {
			  System.out.println("Date2 : "+sd.format(date2)+" is greater than Date1 : "+sd.format(date1));
			  }
		  }	   
		  
	    }catch(ParseException ex){
         ex.printStackTrace();}
		  
}

/** Main method
  * @param args of type string
  *	@return void
  */
	 
public static void main(String a[])
{
 int ch=0;
 Date d = new Date();  //Instantiating a object of class Date 
 while(ch!=6){
 System.out.println("\n\tDATE FUNCTIONALITIES\n");
 System.out.println("MAIN MENU");
 System.out.println("1. Get Values ");
 System.out.println("2. Set Values ");
 System.out.println("3. Check Equal ");
 System.out.println("4. Check After ");
 System.out.println("5. Check Before ");
 System.out.println("6. Compare To ");
 System.out.println("7. EXIT ");
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
  
  case 7: break;  
  default: System.out.println("UNDER CONSTRUCTION");
 }
}
}
}
