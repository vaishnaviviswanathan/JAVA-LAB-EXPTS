
import java.util.*;
import mypackage.Calculator;

public class Calci
{

public static void main(String args[])
{

Calculator c=new Calculator();
Scanner s1=new Scanner(System.in);
do{
System.out.println("\n enter the first number");
double a=s1.nextDouble();
System.out.println("\n enter the second number");
double b=s1.nextDouble();
System.out.println("Menu");
System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divison\n5.Mod\n6.Power\n7.Square root\n8.exit\n");
System.out.println("\nEnter your choice:\n");
int ch=s1.nextInt();

switch(ch)
{
case 1:
{
double v=c.add(a,b);
System.out.println("sum="+v);
break;
}
case 2:
{
double v=c.sub(a,b);
System.out.println("difference="+v);
break;
}
case 3:
{
double v=c.mul(a,b);
System.out.println("Product="+v);
break;
}
case 4:
{
double v=c.div(a,b);
System.out.println("Divison quotient="+v);
break;
}
case 5:
{
double v=c.mod(a,b);
System.out.println("Divison remainder="+v);
break;
}
case 6:
{
double v=c.power(a,b);
System.out.println("Square="+v);
break;
}
case 7:
{
double v=c.sqroot(a);
System.out.println("Square Root="+v);
break;
}

default:
{System.out.println("\nerror!");
System.exit(1);
break;}

}//switch close

}while(true);


}//public method close



}//class Calci close