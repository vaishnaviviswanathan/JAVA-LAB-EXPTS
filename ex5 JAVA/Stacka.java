import java.util.*;
import java.io.*;

interface Stackinterface
{
	void push(int n1) throws Exception;
	void pop() throws Exception;
	int peek() throws Exception;
	int isempty();
	int isfull();
	void display() ;
}

class StackemptyException extends Exception 
{ 
    public StackemptyException(){}
    public String toString(){
        return ("Stack Empty! Cannot pop!");
    }
}

class StackFullException extends Exception 
{ 
    int n;
    public StackFullException(int n1)
    {
	n=n1;
    }
    public String toString(){
        return ("Stack Full! Cannot push "+n);
    }
}

class arrayStack implements Stackinterface
{
	ArrayList<Integer> al;
	int n;
	public arrayStack(int n1)
	{
		al=new ArrayList<Integer>(n1);
		n=n1;
	}	
	public void push(int n1) throws Exception
	{
		    if(isfull()==1)
			throw new StackFullException(n1);
		    else
			al.add(0,n1);
	}
	public void pop() throws Exception
	{
		if(isempty()==1)
			throw new StackemptyException();
		else
			al.remove(0);
	}
	public int peek() throws Exception
	{
		if(isempty()==1)
			throw new StackemptyException();
		else
		{
			int n1=al.get(0);
			return n1;
		}
	}
	public int isempty()
	{
		if(al.size()==0)
			return 1;
		else
			return 0;
	}
	public int isfull()
	{
		if(al.size()==n)
			return 1;
		else
			return 0;
	}
	public void display()
	{
		System.out.println(al);
	}
}

public class Stacka
{
    public static void main(String[] args) throws Exception
    {
	int n,ch;
	Scanner in=new Scanner(System.in);
	System.out.println("\nEnter the number of elements in the stack");
	n=in.nextInt();
	arrayStack s=new arrayStack(n);
	do
	{
	System.out.println("Stack operations\n1.Push\n2.Pop\n3.peek\n4.isempty?\n5.isfull?\n6.display\n7.Exit\nEnter your choice:");
	ch=in.nextInt();
	switch(ch)
	{
		case 1:try
		       {
		    		System.out.println("Enter the number to be pushed : ");
		       		n=in.nextInt();
		       		s.push(n);
		       		s.display();
		       }
		       catch(StackFullException sf)
		       {
				System.out.println(sf);
		       }
		       break;
		case 2:try
		       {
		    		s.pop();
		       		s.display();
		       }
		       catch(StackemptyException se)
		       {
				System.out.println(se);
		       }
		       break;
		case 3:try
		       {
		    		n=s.peek();
		       		System.out.println("Top of stack : " + n);
		       }
		       catch(StackemptyException se)
		       {
				System.out.println(se);
		       }
		       break;
		case 4:n=s.isempty();
		       if(n==1)
				System.out.println("Stack empty!");
		       else
				System.out.println("Stack not empty!");
		       break;
		case 5:n=s.isfull();
		       if(n==1)
				System.out.println("Stack Full!");
		       else
				System.out.println("Stack not Full!");
		       break;
		case 6:s.display();
		       break;
		case 7:break;
	}
	}while(ch!=7);
    }
}
	








