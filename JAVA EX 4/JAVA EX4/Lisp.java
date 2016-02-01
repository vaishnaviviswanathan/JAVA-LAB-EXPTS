package myjava;

import java.util.*;
import java.io.*;
import java.util.Iterator;

public class Lisp
{
	private ArrayList<Integer> al = new ArrayList<Integer>();
	public void create()
	{
		Scanner in=new Scanner(System.in);
		int i=0,n,c;
		System.out.println("Enter the no of elements in the list : ");
		n=in.nextInt();
		System.out.println("Enter the elements : ");
		while(i<n)
		{
			System.out.println("Enter the number to be appended");
			c=in.nextInt();
			al.add(c);
			i++;
		}
	}
	public void displist()
	{
		System.out.println(al);
	}
	public Object car()
	{
		return al.get(0);
	}
	public ArrayList cdr()
	{
		int c;
		Iterator itr;
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		itr=al.iterator();
		itr.next();
		while(itr.hasNext())
		{
			c=(Integer)itr.next();	     
			al1.add(c);
		}
		return al1;
	}
	public void cons(int d)
	{
		al.add(0,d);
	}
	public int length()
	{
		return al.size();
	}
	public void nthcdr(int d)
	{
		Iterator itr;
		int pos=al.indexOf(d);
		itr=al.listIterator(pos);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		while(itr.hasNext())
		{
			int c=(Integer)itr.next();
			al1.add(c);
		}
		System.out.println(al1);
		/*int len=al.size();
		int pos=al.indexOf(d);
		ArrayList<Integer> al1=(ArrayList<Integer>)al.subList(pos,len);
		System.out.println(al1);*/
	}
	public void setcar(int n)
	{
		al.set(0,n);
	}
	public void setcdr(Lisp l)
	{
		int c,len;
		al.subList(1,al.size()).clear();
		for(int i=0; i<l.length(); i++)
			al.add((Integer)l.al.get(i));
	}
	public Object nthlist(int n)
	{
		return al.get(n);
	}
	public ArrayList first_last()
	{
		int len,f,last;
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		f=(Integer)al.get(0);
		len=length();
		last=(Integer)al.get(len-1);
		al1.add(f);
		al1.add(last);
		return al1;
	}
	public Integer cadr()
	{
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1=cdr();
		return al1.get(0);
	}
}






