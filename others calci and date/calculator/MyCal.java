/** To create the basic opeartions of calculator
*/
import packagecal.Calci;//user defined packages
import java.util.*;//to import scanner class
public class MyCal
{
/**Main method
*/
public static void main(String args[])
{
/**Instantiation for user defined package Calci
*/
Calci c=new Calci();
/**Instantiation for Scanner class */
Scanner s=new Scanner(System.in);
double a,b;
/**Read the numbers from the user*/
System.out.println("Enter the values for 2 variables");
a=s.nextDouble();
b=s.nextDouble();
/**Display the menu for calculator*/
System.out.println("Menu");
System.out.println("1.Addition 2.Substraction 3.Multiplication ");
System.out.println("4.Divison 5.Mod 6.Power 7.Square root");
/** Read the choice for menu */
System.out.println("Enter your choice:");
int ch;
ch=s.nextInt();
switch(ch)
{
case 1:
System.out.println("Sum="+c.myadd(a,b));
break;
case 2:
System.out.println("Difference="+c.mysub(a,b));
break;
case 3:
System.out.println("Product="+c.mymul(a,b));
break;
case 4:
System.out.println("Divison quotient="+c.mydiv(a,b));
break;
case 5:
System.out.println("Divison remainder="+c.mymod(a,b));
break;
case 6:
System.out.println("Square="+c.mypow(a,b));
break;
case 7:
System.out.println("Square Root="+c.square_root(a));
break;
}
}
}
