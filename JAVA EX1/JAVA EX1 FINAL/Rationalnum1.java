
import java.util.*;

class operation
{
int a,b;


/**
@author v.vaishnavi
*/ 

/** REDUCING THE RATIONAL NUMBERS AND TO PERFORMS ARITHMETIC OPERATIONS WITH TWO RATIONAL NUMBERS
*/



/** CONSTRUCTOR TO INITIALISE THE VALUES PASSED TO THE CLASS VARIABLES
@param x -numerator
@param y -denominator
*/

public operation(int x,int y)
{
a=x;
b=y;
}
/** DISPLAY METHOD IS TO DISPLAY THE ENTERED RATIONAL NUMBERS */

public void display()
{
System.out.println("the rational number is "+a+"/"+b);
}

/** GCD METHOD IS TO FIND THE GCD OF THE TWO NUMBERS ENTERED 

@param number1 -numerator
@param number2 -denominator
@return -returns the gcd of the two numbers

*/

public int gcd(int number1,int number2)
{
if(number2==0)
{
return number1;
}
return gcd(number2,number1%number2);
}



/** REDUCE METHOD IS TO REDUCE THE RATIONAL NUMBER TO ITS LEAST FORM

@param number1 -numerator
@param number2 -denominator
@param c -it is the gcd of the two numbers(numerator and denominator)
*/

public void reduce(int number1,int number2,int c)
{
if(number2==0)
System.out.println("\n invalid rational number");
else
{
number1=number1/c;
number2=number2/c;
System.out.println("the reduced rational number is..."+number1+"/"+number2);
}//else close
}

/** PERFORMS ADDITION OF TWO RATIONAL NUMBERS
@param a numerator of the first rational number
@param b denominator of the first rational number
@param c numerator of the second rational number
@param d denominator of the second rational number
*/

public void add(int a,int b,int c,int d)
{
int deno=b*d;
int num=a*d+b*c;
System.out.println("the rational number is "+num+"/"+deno);
int cd1=gcd(num,deno);
System.out.println("the gcd of the two numbers is"+cd1);
reduce(num,deno,cd1);
}

/** PERFORMS SUBTRACTION OF TWO RATIONAL NUMBERS
@param a numerator of the first rational number
@param b denominator of the first rational number
@param c numerator of the second rational number
@param d denominator of the second rational number
*/

public void sub(int a,int b,int c,int d)
{
int deno=b*d;
int num=(a*d)-(b*c);
System.out.println("the rational number is "+num+"/"+deno);
int cd1=gcd(num,deno);
System.out.println("the gcd of the two numbers is"+cd1);
reduce(num,deno,cd1);

}


/** PERFORMS MULTIPLICATION OF TWO RATIONAL NUMBERS
@param a numerator of the first rational number
@param b denominator of the first rational number
@param c numerator of the second rational number
@param d denominator of the second rational number
*/

public void mul(int a,int b,int c,int d)
{
int deno=(b*d);
int num=(a*c);
System.out.println("the rational number is "+num+"/"+deno);
int cd1=gcd(num,deno);
System.out.println("the gcd of the two numbers is"+cd1);
reduce(num,deno,cd1);
}


/** PERFORMS DIVISION OF TWO RATIONAL NUMBERS
@param a numerator of the first rational number
@param b denominator of the first rational number
@param c numerator of the second rational number
@param d denominator of the second rational number
*/

public void div(int a,int b,int c,int d)
{
int deno=(b*c);
int num=(a*d);
System.out.println("the rational number is "+num+"/"+deno);
int cd1=gcd(num,deno);
System.out.println("the gcd of the two numbers is"+cd1);
reduce(num,deno,cd1);
}

}

public class Rationalnum1
{
public static void main(String l[])
{

Scanner s1=new Scanner(System.in);
System.out.println("Enter the first number to find GCD");
int number1=s1.nextInt();
System.out.println("Enter the second number to find GCD");
int number2=s1.nextInt();

operation op=new operation(number1,number2);
op.display();

int cd=op.gcd(number1,number2);

System.out.println("the gcd of the two numbers is"+cd);
op.reduce(number1,number2,cd);
do{
System.out.println("\n\n1.ARITHMETIC OPERATIONS 2.EXIT\n\n");
System.out.println("enter the choice");
int choice=s1.nextInt();
switch(choice)
{
case 1:
{
//first fraction
System.out.println("Enter the first number");
int a=s1.nextInt();
System.out.println("Enter the second number");
int b=s1.nextInt();
System.out.println("the first rational number is "+a+"/"+b);
//second fraction
System.out.println("Enter the third number");
int c=s1.nextInt();
System.out.println("Enter the fourth number");
int d=s1.nextInt();
System.out.println("the second rational number is "+c+"/"+d);

System.out.println("Enter the option\n1.add\n2.sub\n3.mul\n4.div\n");

int e=s1.nextInt();
//perform addition
if(e==1)
{
op.add(a,b,c,d);
}

//perform subtraction
if(e==2)
{
op.sub(a,b,c,d);
}

//perform multiplication
if(e==3)
{
op.mul(a,b,c,d);
}

//perform division
if(e==4)
{
op.div(a,b,c,d);
}
break;
}

default:
{
System.out.println("\nerror!");
System.exit(1);
break;
}

}//switch close

}while(true);

}//method close
}//class close

