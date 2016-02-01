import java.util.*;


class parent
{
	protected String name,dob,hobby;
	int age,date,month,year;
	Scanner s=new Scanner(System.in);
	public parent()
	{
		System.out.println("\nEnter the father name : ");
		name=s.next();
		System.out.println("\nEnter the father dob(dd/mm/yyyy) : ");
		dob=s.next();
		System.out.println("\nEnter the father hobby : ");
		hobby=s.next();
		String[] str1 =  dob.split("/");
		date=Integer.parseInt(str1[0]);
		month=Integer.parseInt(str1[1]);
		year=Integer.parseInt(str1[2]);
		
	}
	public void calculate()
	{
		int tdate,tmonth,tyear;
		Calendar calendar = Calendar.getInstance();
		tdate=calendar.get(Calendar.DATE); 
		tyear=calendar.get(Calendar.YEAR);
		tmonth=calendar.get(Calendar.MONTH)+1;
		int flag=0;
		if(tmonth>=month)
		{
			if(tmonth==month)
			{if(tdate>=date)
			flag=1;
			}
			else
			flag=1;
				
		}
		if(flag==1)
		age=tyear-year;
		else
		age=tyear-year-1;
	}
	public void display()
	{
		System.out.println("\nNAME \t\t: "+name);
		System.out.println("\nDOB \t\t: "+dob);
		System.out.println("\nHOBBY "+hobby);
		System.out.println("\nAGE \t\t:"+age+" years");
		
	}
	//s.close();
}


class child extends parent
{
	protected String name,dob,hobby;
	int age,date,month,year;
	Scanner s1=new Scanner(System.in);
	public child()
	{
		super();
		System.out.println("\nEnter the son name : ");
		name=s1.next();
		System.out.println("\nEnter the son dob (dd/mm/yyyy): ");
		dob=s1.next();
		System.out.println("\nEnter the son hobby : ");
		hobby=s1.next();
		String[] str1 =  dob.split("/");
		date=Integer.parseInt(str1[0]);
		month=Integer.parseInt(str1[1]);
		year=Integer.parseInt(str1[2]);
		
	}
	public void calculate()
	{
		int tdate,tmonth,tyear;
		super.calculate();
		Calendar calendar = Calendar.getInstance();
		tdate=calendar.get(Calendar.DATE); 
		tyear=calendar.get(Calendar.YEAR);
		tmonth=calendar.get(Calendar.MONTH)+1;
		int flag=0;
		if(tmonth>=month)
		{
			if(tdate>=date)
			flag=1;
				
		}
		if(flag==1)
		age=tyear-year;
		else
		age=tyear-year-1;
		
	}
	public void agediff()
	{
		int temp=super.age-age;
		System.out.println("The diffenence in age of father and sun is " +temp);
	}
	public void display()
	{
		super.display();
		System.out.println("\nNAME \t\t: "+name);
		System.out.println("\nDOB \t\t: "+dob);
		System.out.println("\nHOBBY \t\t: "+hobby);
		System.out.println("\nAGE \t\t:"+age);
		
	}
	//s.close();
}

public class hirarchy1{
public static void main(String[] arg)
	{
		int choice ;
		Scanner s5=new Scanner(System.in);
		child c=new child();
		System.out.println("calculating age ");
		c.calculate();
		c.display();
		System.out.println("calculating difference in age ");
		c.agediff();
		
					
	}
}