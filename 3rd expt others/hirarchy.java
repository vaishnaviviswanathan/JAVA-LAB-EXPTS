import java.util.*;
class Employee
{
	protected String name,id,desig;
	protected float salary,bonus,netpay;
	protected int hra,da;
	Scanner s=new Scanner(System.in);
	public Employee()
	{
		System.out.println("\nEnter the name : ");
		name=s.next();
		System.out.println("\nEnter the id : ");
		id=s.next();
		System.out.println("\nEnter the hra : ");
		hra=s.nextInt();
		System.out.println("\nEnter the da : ");
		da=s.nextInt();
		System.out.println("\nEnter the Salary : ");
		salary=s.nextInt();
		bonus=0;
		netpay=0;
	}
	public void calculate()
	{
		bonus=((hra*salary)+(da*salary))/100;
		netpay=salary+bonus;
	}
	public void display()
	{
		System.out.println("\nNAME \t\t: "+name);
		System.out.println("\nID \t\t: "+id);
		System.out.println("\nDISGNATION \t: "+desig);
		System.out.println("\nHRA \t\t: "+hra);
		System.out.println("\nDA \t\t: "+da);
		System.out.println("\nSALARY \t\t: "+salary);
		System.out.println("\nBONUS \t\t: "+bonus);
		System.out.println("\nNETPAY \t\t: "+netpay);
		
	}
	//s.close();
}

class manager extends Employee
{
	String dept;
	Scanner s1=new Scanner(System.in);
	public manager()
	{
		super();
		super.desig="manager";
		System.out.println("\nEnter the department name : ");
		dept=s1.next();
		
		
	}
	public void display()
	{
		super.display();
		System.out.println("\nDEPARTMENT \t: "+dept);
		
	}
	
	//s1.close();
}

class seceratary extends Employee
{
	String dept,quali;
	Scanner s2=new Scanner(System.in);
	public seceratary()
	{
		super();
		super.desig="seceratary";
		System.out.println("\nEnter the department name : ");
		dept=s2.next();
		System.out.println("\nEnter the Qualification : ");
		quali=s2.next();
		
	}
	public void display()
	{
		super.display();
		System.out.println("\nDEPARTMENT \t: "+dept);
		System.out.println("\ntQUALIFICATION    : "+quali);
	}
	//s2.close();
}

class programmer extends Employee
{
	String quali,languages;
	Scanner s3=new Scanner(System.in);
	public programmer()
	{
		super();
		super.desig="programmer";
		System.out.println("\nEnter the Qualification : ");
		quali=s3.next();
		System.out.println("\nEnter the Languages known : ");
		languages=s3.next();
		
		
	}
	public void display()
	{
		super.display();
		System.out.println("\nQUALIFICATION \t: "+quali);
		System.out.println("\nLANGUAGES     \t: "+languages);
		
	}
	//s3.close();
}


class executiveofficer extends manager
{
	String company;
	Scanner s4=new Scanner(System.in);
	public executiveofficer()
	{
		super();
		super.desig="executiveofficer";
		System.out.println("\nEnter the Company : ");
		company=s4.next();
		
	}
	public void display()
	{
		System.out.println("\n Company \t\t: "+company);
		super.display();
		
	}
	//s4.close();
}


public class hirarchy{
public static void main(String[] arg)
	{
		int choice ;
		Scanner s5=new Scanner(System.in);
		System.out.println("\nEnter details for \n 1.manager\n2.secratary\n3.programmer\n4.executive officer \nEnter your choice :  " );
		choice=s5.nextInt();
		switch(choice)
		{
			case 1:
					manager m=new manager();
					System.out.println("\n Calculating salary,bonus ");
					m.calculate();
					m.display();
					break;
			case 2:
					seceratary s=new seceratary();
					System.out.println("\n Calculating salary,bonus ");
					s.calculate();
					s.display();
					break;
			case 3:
					programmer p=new programmer();
					System.out.println("\n Calculating salary,bonus ");
					p.calculate();
					p.display();
					break;
			case 4:
					executiveofficer e=new executiveofficer();
					System.out.println("\n Calculating salary,bonus ");
					e.calculate();
					e.display();
					break;
			
		}
		//s5.close();
	}
}