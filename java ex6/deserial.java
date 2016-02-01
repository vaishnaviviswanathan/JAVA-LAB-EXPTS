import java.io.*;
import java.util.*;

abstract class currency
{
	public abstract void display();
	public abstract void convert();
}

class rupee extends currency implements Serializable
{
	private double rupees;
	public rupee(double r)
	{
		rupees=r;
	}
	public void convert()
	{
		System.out.println("Converted Rs."+rupees);
	}
	public void display()
	{
		System.out.println("Rs."+rupees);
	}
}

class dollar extends currency implements Serializable
{
	private double dollars;
	public dollar(double r)
	{
		dollars=r;
	}
	public void convert()
	{
		double r=dollars*61;
		System.out.println("Converted Rs."+r);
	}
	public void display()
	{
		System.out.println("$"+dollars);
	}
}

public class deserial
{
	public static void main(String[] args) throws IOException
	{
		currency cur;
		Class c;
		int i=0,j;
		double r,d,ch;
		String str;
		dollar dol;
		rupee rup;
		try
      		{
        		FileInputStream fileIn = new FileInputStream("/tmp/curency.ser");
        		ObjectInputStream in = new ObjectInputStream(fileIn);
			do
			{
					cur=(currency)in.readObject();
					c=cur.getClass();
					str=c.getName();
					System.out.println(str);
					if(str.equals("dollar"))
					{
						cur.convert();
					}
					i++;
			}while(i!=10);
			in.close();
         		fileIn.close();
      		}
		catch(IOException ioe)
      		{
          			ioe.printStackTrace();
      		}
		catch(ClassNotFoundException cnot)
      		{
         		System.out.println("class not found");
         		cnot.printStackTrace();
         	}
	}
}
