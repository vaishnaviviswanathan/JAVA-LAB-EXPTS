import java.util.Scanner;

class operation
{
public  operation(int a,int b)
{
int x=a;
int y=b;
System.out.println("\n the valueas are "+x+" and "+y);
System.out.println("\n1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.POW\n6.SQRT\n7.MOD\n");
Scanner s2=new Scanner(System.in);
System.out.println("\n enter the option\n");
int ch=s2.nextInt();
switch(ch)
{
case 1:
{
int p=(x+y);
System.out.println("addition of the two numbers is "+p);
break;
}

case 2:
{
int p=(x-y);
System.out.println("the subtraction of the two numbers is "+p);
break;
}

case 3:
{
int p=(x*y);
System.out.println("multiplication of the two numbers is "+p);
break;
}


case 4:
{
float p=(x/y);
System.out.println("division of the two numbers is "+p);
break;
}



case 5:
{
int i;
int p=1;
for(i=0;i<y;i++)
{
p=p*x;
}

System.out.println(" (x^y) is "+p);
break;
}


case 6:
{


System.out.println("the square root of x and y
is"+Math.sqrt(x)+"and"+Math.sqrt(y));
break;
}


case 7:
{
float p=(x%y);
System.out.println("multiplication of the two numbers is "+p);
break;
}



default:
{
System.out.println("\nERROR!");
break;
}
}//switch close
}//method close


public operation(float a,float b)
{
float x=a;
float y=b;
System.out.println("\n the values are "+x+" and "+y);

System.out.println("\n1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.POW\n6.SQRT\n7.MOD\n");
Scanner s2=new Scanner(System.in);
System.out.println("\n enter the option\n");
int ch=s2.nextInt();
switch(ch)
{
case 1:
{
float p=(x+y);
System.out.println("addition of the two numbers is "+p);
break;
}

case 2:
{
float p=(x-y);
System.out.println("the subtraction of the two numbers is "+p);
break;
}

case 3:
{
float p=(x*y);
System.out.println("multiplication of the two numbers is "+p);
break;
}


case 4:
{
float p=(x/y);
System.out.println("division of the two numbers is "+p);
break;
}



case 5:
{
System.out.println(" (x^y) is "+Math.pow(x,y));
break;
}


case 6:
{


System.out.println("the square root of x and y
is"+Math.sqrt(x)+"and"+Math.sqrt(y));
break;
}


case 7:
{
float p=(x%y);
System.out.println("multiplication of the two numbers is "+p);
break;
}



default:
{
System.out.println("\nERROR!");
break;
}
}//switch close




}//method close


}//close class

class Calculator
{
public static void main(String arg[])
{
Scanner s1=new Scanner(System.in);

System.out.println("\n1.integer\n2.float\n");
System.out.println("\n enter the choice\n");
int choice=s1.nextInt();
switch(choice)
{
case 1:
{
System.out.println("\nenter the first number\n");
int a=s1.nextInt();
System.out.println("\nenter the second number\n");
int b=s1.nextInt();
operation op=new operation(a,b);

break;
}//case close


/*case 2:
{
System.out.println("\nenter the first number\n");

char[] c;
c=input.toCharArray();

System.out.println("\nenter the second number\n");
char[] d;

d=input.toCharArray();
operation op=new operation(c,d);
op.check();

break;
}//case close
*/

case 2:
{
System.out.println("\nenter the first number\n");
float c=s1.nextFloat();
System.out.println("\nenter the second number\n");
float d=s1.nextFloat();
operation op=new operation(c,d);
break;
}//case close


default:
{System.out.println("\n error!");
break;}


}//switch close

}//main method close
}//class close