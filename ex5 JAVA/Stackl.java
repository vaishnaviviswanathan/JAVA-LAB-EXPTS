import java.util.*;
import java.io.*;

interface Stackinterface
{
	void push(int n1);
	void pop() throws Exception;
	int peek() throws Exception;
	int isempty();
	void display();
}

class StackemptyException extends Exception 
{ 
    public StackemptyException(){}
    public String toString()
    {
        return ("Stack Empty! Cannot pop!");
    }
}

class listStack implements Stackinterface
{
	LinkedList<Integer> l;
	public listStack()
	{
		l=new LinkedList<Integer>();
	}	
	public void push(int n1)
	{
			l.push(n1);
	}
	public void pop() throws Exception
	{
		if(isempty()==1)
			throw new StackemptyException();
		else
			l.pop();
	}
	public int peek() throws Exception
	{
		if(isempty()==1)
			throw new StackemptyException();
		else
		{
			int n1=l.get(0);
			return n1;
		}
	}
	public int isempty()
	{
		if(l.size()==0)
			return 1;
		else
			return 0;
	}
	public void display()
	{
		System.out.println(l);
	}
}

public class Stackl
{
    public static void main(String[] args) throws Exception
    {
	int n,ch;
	Scanner in=new Scanner(System.in);
	listStack s=new listStack();
	do
	{
	System.out.println("Stack operations\n1.Push\n2.Pop\n3.peek\n4.isempty?\n5.display\n6.Exit\nEnter your choice:");
	ch=in.nextInt();
	switch(ch)
	{
		case 1:System.out.println("Enter the number to be pushed : ");
		       n=in.nextInt();
		       s.push(n);
		       s.display();
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
		case 5:s.display();
		       break;
		case 6:break;
	}
	}while(ch!=6);
    }
}
	








