import java.util.*;
import java.io.*;

abstract class Vehicle
{
	protected Date purchase_date;
	protected int no_wheels,no_gears,year;
	protected float tank_capacity,price;
	protected String color,model,maker,fuel_type,owner,reg_no,eng_type;
	public static int numVehicles;
	public abstract float mileage_cal();
	public abstract int vehicle_age();
	public abstract float expenditure();
	public void get(int no)
	{
		int m,d,y;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the  details:");
		System.out.println("Owner : ");
		owner=in.next();
		System.out.println("Purchase Date : ");
		System.out.println("Date : ");
		d=in.nextInt();
		System.out.println("Month : ");
		m=in.nextInt();
		System.out.println("Year : ");
		y=in.nextInt();
		year=y;
		no_wheels=no;
		System.out.println("Registration number :");
		reg_no=in.next();
		System.out.println("Engine type : ");
		eng_type=in.next();
		System.out.println("No of gears : ");
		no_gears=in.nextInt();
		System.out.println("Fuel type : ");
		fuel_type=in.next();
		System.out.println("Price : ");
		price=in.nextFloat();
		System.out.println("Tank capacity : ");
		tank_capacity=in.nextFloat();
		System.out.println("Color : ");
		color=in.next();
		System.out.println("Model : ");
		model=in.next();
		System.out.println("Maker : ");
		maker=in.next();
		GregorianCalendar cal=new GregorianCalendar(y,m-1,d);
		purchase_date=cal.getTime();
		numVehicles++;
	}
	public void maker_search(String mname)
	{
		if(maker.compareTo(mname)==0)
		{
			System.out.println("Owner : "+owner);
			System.out.println("Registration number : "+reg_no);
			System.out.println("Purchase Date : "+purchase_date.toString());
			System.out.println("Model : "+model);
		}
		
	}
	public void vehicle_search(String c)
	{
		String city="";
		for(int i=0;i<reg_no.length();i++)
		{
			char b=reg_no.charAt(i);
			if(Character.isLetter(b))
				city=city+b;
		}
		if(city.compareTo(c)==0)
		{
			System.out.println("Owner : "+owner);
		}
	}
	public void display()
	{
		System.out.println("Owner : " + owner);
		System.out.println("Purchase Date : "+ purchase_date.toString());
		System.out.println("No of wheels : "+ no_wheels);
		System.out.println("Engine type : "+ eng_type);
		System.out.println("No of gears : "+ no_gears);
		System.out.println("Fuel type : "+ fuel_type);
		System.out.println("Price : "+ price);
		System.out.println("Tank capacity : "+tank_capacity);
		System.out.println("Color : "+ color);
		System.out.println("Model : "+ model);
		System.out.println("Maker : "+maker);
	}
}
class Car extends Vehicle
{
	public static int numCars;
	public Car()
	{
		numCars++;
	}
	public float mileage_cal()
	{
		int start,end;
		float mil;
		Scanner in=new Scanner(System.in);
		System.out.println("Starting reading : ");
		start=in.nextInt();
		System.out.println("Ending reading : ");
		end=in.nextInt();
		mil=(end-start)/tank_capacity;
		return mil;
	}
	public int vehicle_age()
	{
		int y,age;
		Calendar calendar = Calendar.getInstance();
        	y=calendar.get(Calendar.YEAR);
		age=y-year;
		return age;
	}
	public float expenditure()
	{
		float f,r,s,a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the  details:");
		System.out.println("Fuel consumption : ");
		f=in.nextFloat();
		System.out.println("Repair Charges : ");
		r=in.nextFloat();
		System.out.println("Service charges : ");
		s=in.nextFloat();
		System.out.println("Accessories : ");
		a=in.nextFloat();
		System.out.println("Battery or gas consumption : ");
		b=in.nextFloat();
		return f+r+s+a+b;	
	}
}

class Bike extends Vehicle
{
	public static int numBikes;
	public Bike()
	{
		numBikes++;
	}
	public float mileage_cal()
	{
		int start,end;
		float mil;
		Scanner in=new Scanner(System.in);
		System.out.println("Starting reading : ");
		start=in.nextInt();
		System.out.println("Ending reading : ");
		end=in.nextInt();
		mil=(end-start)/tank_capacity;
		return mil;
	}
	public int vehicle_age()
	{
		int year,y,age;
		Calendar calendar = Calendar.getInstance();
        	year=calendar.get(Calendar.YEAR);
        	y=purchase_date.getYear();
		System.out.println(y);
		age=year-y;
		return age;
	}
	public float expenditure()
	{
		float f,r,s;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the  details:");
		System.out.println("Fuel consumption : ");
		f=in.nextFloat();
		System.out.println("Repair Charges : ");
		r=in.nextFloat();
		System.out.println("Service charges : ");
		s=in.nextFloat();
		return f+r+s;	
	}
	public void display()
	{
		System.out.println("Owner : " + owner);
		System.out.println("Purchase Date : "+ purchase_date.toString());
		System.out.println("No of wheels : "+ no_wheels);
		System.out.println("Engine type : "+ eng_type);
		System.out.println("No of gears : "+ no_gears);
		System.out.println("Fuel type : "+ fuel_type);
		System.out.println("Price : "+ price);
		System.out.println("Tank capacity : "+tank_capacity);
		System.out.println("Color : "+ color);
		System.out.println("Model : "+ model);
		System.out.println("Maker : "+maker);
	}
}


public class main3 
{
	public static void main(String str[])
	{
		int i,j=0,ch,choice=0;
		float a;
		String s;
		Scanner in=new Scanner(System.in);
		Vehicle[] v=new Vehicle[10];
		do
		{
			System.out.println("\nEnter your vehicle\n1.Car\n2.Bike\n3.Search by maker name\n4.Search by city code\n5.Exit");
			ch=in.nextInt();
			switch(ch)
			{
				case 1:do
				       {
				       		System.out.println("What do you want to do:\n1.Get the details\n2.Calculate mileage\n3.Calculate vehicle age \n4.Calculate expenditure\n5.Print the number of cars\n6.Print the details\n7.Exit");
				       		choice=in.nextInt();
				       		if(choice==1)
						{
							v[j]=new Car();
							j++;
							v[j-1].get(4);
						}
				       		if(choice==2)
				       		{
							a=v[j-1].mileage_cal();
							System.out.println("Mileage : "+a);
				       		}
				       		if(choice==3)
				       		{
							i=v[j-1].vehicle_age();
							System.out.println("Age : "+i);
				       		}
				       		if(choice==4)
				       		{
							a=v[j-1].expenditure();
							System.out.println("Expenditure : "+a);
				       		}
						if(choice==5)
							System.out.println("No of Cars : "+Car.numCars);
						if(choice==6)
							v[j-1].display();	
				       }while(choice!=7);
					
				       break;
				case 2:do
				       {
				       		System.out.println("What do you want to do:\n1.Get the details\n2.Calculate mileage\n3.Calculate vehicle age \n4.Calculate expenditure\n5.Print the number of Bikes\n6.Print the details\n7.Exit");
				       		choice=in.nextInt();
				       		if(choice==1)
						{
							v[j]=new Bike();
							j++;
							v[j-1].get(2);
						}
				       		if(choice==2)
				       		{
							a=v[j-1].mileage_cal();
							System.out.println("Mileage : "+a);
				       		}
				       		if(choice==3)
				       		{
							i=v[j-1].vehicle_age();
							System.out.println("Age : "+i);
				       		}
				       		if(choice==4)
				       		{
							a=v[j-1].expenditure();
							System.out.println("Expenditure : "+a);
				       		}
						if(choice==5)
							System.out.println("No of Bikes : "+Bike.numBikes);
						if(choice==6)
							v[j-1].display();
					}while(choice!=7);
				       	break;
				case 3:System.out.println("Enter the maker:");
					s=in.next();
					for(i=0;i<j;i++)
						v[i].maker_search(s);
					break;
				 case 4:System.out.println("Enter the city code:");
					s=in.next();
					for(i=0;i<j;i++)
						v[i].vehicle_search(s);
					break;
				case 5:break;
			}
		}while(ch!=5);
	}
}

