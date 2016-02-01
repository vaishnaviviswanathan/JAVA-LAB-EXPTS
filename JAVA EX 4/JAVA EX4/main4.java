import java.util.*;
import java.io.*;
import myjava.Lisp;

public class main4
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int ch,c,n;
		Integer i;
		Lisp l=new Lisp();
		Lisp l1=new Lisp();
		List<Integer> al1 = new ArrayList<Integer>();
		do
		{
		System.out.println("\n1.Create\n2.display\n3.Print first element\n4.Print elements except the first\n5.Add dat as first element in the list\n6.No of elements in the list\n7.Display list from a given element\n8.Replace the first element\n9.Add a list after the first element\n10.Print the nth element in the list\n11.Print the first and the last element in the list\n12.Print the second element\n13.Exit");
		ch=in.nextInt();
		switch(ch)
		{
			case 1:l.create();
			       break;
			case 2:l.displist();
			       break;
			case 3:n=(Integer)l.car();
			       System.out.println("First element: "+n);
			       break;
			case 4:al1=l.cdr();
			       System.out.println(al1);
			       break;
			case 5:System.out.println("\nEnter the no to be added ");
			       n=in.nextInt();
			       l.cons(n);
			       l.displist();
			       break;
			case 6:n=l.length();
			       System.out.println("No of elements : "+n);
			       break;
			case 7:System.out.println("Enter the element : ");
			       n=in.nextInt();
			       l.nthcdr(n);
			       break;
			case 8:System.out.println("Enter the element : ");
			       n=in.nextInt();
			       l.setcar(n);
			       l.displist();
			       break;
			case 9:l1.create();
			       l.setcdr(l1);
			       l.displist();
			       break;
			case 10:System.out.println("Enter the position :");
				n=in.nextInt();
				i=(Integer)l.nthlist(n);
				System.out.println("Element at position "+n+" is "+i);
				break;
			case 11:al1.clear();
				al1=l.first_last();
				System.out.println(al1);
				break;
			case 12:i=(Integer)l.cadr();
				System.out.println("Second element: "+i);
				break;
			case 13:break;
		}
		}while(ch!=13);
	}
}










