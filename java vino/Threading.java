import java.util.*;
import java.io.*;
import java.math.*;
class Primes extends Thread{
public static PipedOutputStream out = new PipedOutputStream();
public static PipedOutputStream retOut()
{
return out;
}


public void run()
{int i,j,factors;
for(i=2;i<1000;i++)
{factors=0;
//System.out.println("chumma "+i);
for(j=2;j<(i/2);j++)
{//if(i==8161)
//System.out.println("aama "+j);
if(i%j==0)
{factors++;
break;}
}
if(factors==0){
System.out.println("PRIMES "+i+" ");
try{
out.write(i);
}catch(Throwable t)
{System.out.println("error");}
}
}
try{
out.close();}
catch(Throwable t)
{}
System.out.println("");
}

}


class Fibonacci extends Thread{

public static PipedOutputStream out = new PipedOutputStream();

public static PipedOutputStream retOut()
{
return out;
}

public void run()
{int count=2;
int f1=0,f2=1,f3=0;
System.out.println("FIBO "+f1+" FIBO "+f2+" ");
//ByteArrayOutputStream baos = new ByteArrayOutputStream();
while(true)
{
f3 = f1+f2;
f1 = f2;
f2 = f3;
try{
if(f3<1000)
out.write(f3);
else
break;
}
catch(Throwable t)
{
}
System.out.println("FIBO "+f3+" ");
count=count+1;
}
try{
out.close();}
catch(Throwable t)
{}
System.out.println("");
}

}


class MainThread extends Thread{

public void run()
{

try{
PipedInputStream in=new PipedInputStream();
in.connect(Primes.retOut());
//System.out.println("HELLO");
PipedInputStream in1=new PipedInputStream();
in1.connect(Fibonacci.retOut());

System.out.println("HELLO");
Thread p=new Primes();
System.out.println("HELLO");
p.start();
Thread f=new Fibonacci();
f.start();

f.join();
p.join();

System.out.println("HELLO");
int fibo,prime;
System.out.println("HELLO");
fibo=in1.read();
System.out.println("HELLO");
prime=in.read();
System.out.println("HELLO");
//System.out.println(fibo+" "+prime);
while(fibo!=-1 && prime!=-1)
{if(fibo>prime)
prime=in.read();
else
if(fibo<prime)
fibo=in1.read();
else
{System.out.println(fibo);
prime=in.read();
fibo=in1.read();
//System.out.println("HELLO");}
}
}
}
catch(Throwable t)
{
System.out.println("ERROR");
}
}

}


public class Threading{
public static void main(String args[])
{
Thread t=new MainThread();

t.start();
}

}
