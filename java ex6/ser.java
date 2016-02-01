
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
	}
	public void display()
	{
		System.out.print("$"+dollars);
	}
}

public class ser
{
	public static void main(String[] args) throws IOException
	{
		int i=0,j;
		double r,d,ch;
		dollar dol;
		rupee rup;
		try
      		{
        		FileOutputStream fileOut =new FileOutputStream("/tmp/curency.ser");
         		ObjectOutputStream out = new ObjectOutputStream(fileOut);
			do
			{
				ch=Math.random()%2;
				if(ch<0.5)
				{
					d=(double)((200-50+1)*Math.random()+50);
					dol=new dollar(d);
					dol.display();
					out.writeObject(dol);
					i++;
				}
				if(ch>0.5)
				{
					r=(double)((200-50+1)*Math.random()+50);
					rup=new rupee(r);
					rup.display();
					out.writeObject(rup);
					i++;
				}
			}while(i!=10);
			out.close();
         		fileOut.close();
         		System.out.println("Serialized data is saved in currency.ser");
      		}
		catch(IOException ioe)
      		{
          			ioe.printStackTrace();
      		}
	}
}
