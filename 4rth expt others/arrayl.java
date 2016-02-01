import java.util.*;
import java.io.*;
import java.util.Iterator;

class arrayl
{
	public static void main(String args[]) throws java.io.IOException
	{
		Scanner in=new Scanner(System.in);
		String c;
		int ch,pos,i=0,n;
		Iterator itr;
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>(); 
		do
		{
		System.out.println("\nString Operations\n1.Append\n2.Insert\n3.Delete\n4.Replace\n5.Search\n6.Index Of\n7.Strings starting with a\n8.Append list\n9.Display\n10.Exit\nEnter your choice : ");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Enter the string to be appended");
			       c=in.next();
			       al.add(c);
			       System.out.println(al);
			       break;
			case 2:System.out.println("Enter the string to be inserted : ");
			       c=in.next();
			       System.out.println("Enter the position to be inserted : ");
			       pos=in.nextInt();
			       al.add(pos,c);
			       System.out.println(al);
			       break;
			case 3:System.out.println("Enter the string to be deleted : ");
			       c=in.next();
			       if(al.contains(c))
			       {
					al.remove(c);
			       		System.out.println(al);
			       }
			       else
					System.out.println("Element not found!");			       
			       break;
			case 4:System.out.println("Enter the string to be replaced : ");
			       c=in.next();
			       pos=al.indexOf(c);
			       if(pos<0)
					System.out.println("String not found!");
			       else
			       {
			       		System.out.println("Enter the new string : ");
			       		c=in.next();
			       		al.set(pos,c);
					System.out.println(al);
			       }
			       break;
			case 5:System.out.println("Enter the string to be searched : ");
			       c=in.next();
			       if(al.contains(c))
					System.out.println("Element found!");
			       else
					System.out.println("Element not found!");
			       break;
			case 6:System.out.println("Enter the string : ");
			       c=in.next();
			       if(al.contains(c))
			       {
					pos=al.indexOf(c);
					System.out.println("Element found at "+pos+1);
			       }
			       else
					System.out.println("Element not found!");
			       break;	
			case 7:itr=al.iterator();
			       while(itr.hasNext())
			       {
					c=(String)itr.next();
					if(c.charAt(0)=='a')	     
						  System.out.println(c);
			       }
			       break;
			case 8:System.out.println("Enter the no of elements of the new array : ");
			       n=in.nextInt();
			       System.out.println("Enter the elements of the new array to be appended : ");
			       while(i<n)
			       {
			       		System.out.println("Enter the string to be appended");
			       		c=in.next();
			       		al1.add(c);
					i++;
			       }
			       itr=al1.iterator();
			       while(itr.hasNext())
			       {
					c=(String)itr.next();	     
					al.add(c);
			       }
			       System.out.println("Appended Array : ");
			       System.out.println(al);
			       break;
			case 9:System.out.println(al);
			       break;
			case 10:break;
		}
		}while(ch!=10);
	}
}
					
