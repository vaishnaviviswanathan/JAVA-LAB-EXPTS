/**User defined package for calculator */
package packagecal;
import java.lang.Math;
public class Calci{
/** myadd() method adds two numbers
    @param a First number
    @param b Second number
    @return sum
*/
public double myadd(double a,double b)
{
return (a+b);
}
/** mysub() method subtracts two numbers
    @param a First number
    @param b Second number
    @return difference
*/
public double mysub(double a,double b)
{
return (a-b);
}
/** mymul() method multiplies two numbers
    @param a First number
    @param b Second number
    @return product
*/
public double mymul(double a,double b)
{
return (a*b);
}
/** mydiv() method divides two numbers
    @param a First number
    @param b Second number
    @return quotient
*/
public double mydiv(double a,double b)
{
return (a/b);
}
/** mydiv() method divides two numbers
    @param a First number
    @param b Second number
    @return remainder
*/
public double mymod(double a,double b)
{
return (a%b);
}
/** mypow() method finds the power of a number
    @param a First number
    @param b second number
    @return power of a number
*/
public double mypow(double a,double b)
{
return (Math.pow(a,b));
}
/** square_root() method finds the square root of a number
    @param a to find square root of a
    @return square root
*/
public double square_root(double a)
{
return (Math.sqrt(a));
}
}
