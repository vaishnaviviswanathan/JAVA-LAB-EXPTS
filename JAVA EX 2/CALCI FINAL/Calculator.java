

package mypackage;
import java.lang.Math;
 
/**
@author v.vaishnavi
*/

public class Calculator
{



/** add method adds two numbers
    @param a First number
    @param b Second number
    @return sum
*/
public double add(double a,double b)
{
return (a+b);
}



/** sub method subtracts two numbers
    @param a First number
    @param b Second number
    @return difference
*/
public double sub(double a,double b)
{
return (a-b);
}



/** mul method multiplies two numbers
    @param a First number
    @param b Second number
    @return multiplied value
*/

public double mul(double a,double b)
{
return (a*b);
}

/** div method divides two numbers
    @param a First number
    @param b Second number
    @return the quotient
*/
public double div(double a,double b)
{
return (a/b);
}



/** mod method finds the remainder of the two numbers
    @param a First number
    @param b Second number
    @return the remainder
*/
public double mod(double a,double b)
{
return (a%b);
}



/** power method finds the power of b over a 
    @param a First number
    @param b Second number
    @return the value of(a^b)
*/
public double power(double a,double b)
{
return (Math.pow(a,b));
}




/** sqroot method finds the square root of the entered number 
    @param a First number
    @return the square root
*/
public double sqroot(double a)
{
return (Math.sqrt(a));
}



}//class calculator close