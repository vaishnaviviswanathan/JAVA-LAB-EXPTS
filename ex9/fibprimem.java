import java.util.*;
import java.io.*;
import java.math.*;



class prime extends Thread
{
public static PipedOutputStream out=new PipedOutputStream();
public static PipedOutputStream retout()
{
return out;
}//static method close

public void run()
{
int i,j,count;
for(i=2;i<1000;i++)
{
count=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
count++;
break;
}//if close
}//inner for loop close

if(count==0)
{
System.out.println(i);
try
{
out.write(i);
}
catch(Throwable t)
{
}
}//if count=0 close
}//outer for loop close


try
{
out.close();
}
catch(Throwable t)
{
}

}//run close
}//class close


class fibonacci extends Thread
{

public static PipedOutputStream out=new PipedOutputStream();
public static PipedOutputStream retout()
{
return out;
}//static method close

public void run()
{
int f1=0,f2=1,f3;

System.out.println(f1);
System.out.println(f2);
while(true)
{
f3=f1+f2;
f1=f2;
f2=f3;

try
{
if(f3<1000)
out.write(f3);
else
break;
}
catch(Throwable t)
{
}
System.out.println(f3);
}//while close

try
{
out.close();
}//try close
catch(Throwable t)
{
}//catch close

}//run close


}//class close



class mainthread extends Thread
{

public void run()
{
try
{
PipedInputStream in=new PipedInputStream();
in.connect(prime.retout());
PipedInputStream in1=new PipedInputStream();
in1.connect(fibonacci.retout());

Thread p=new prime();
p.start();
p.join();
sleep(2);

Thread f=new fibonacci();
f.start();
f.join();

System.out.println("\n---------------------------\n");

int prim,fibo;
prim=in.read();
fibo=in1.read();

while(prim!=-1 && fibo!=-1)
{
if(prim<fibo)
prim=in.read();
else if(fibo<prim)
fibo=in1.read();
else
{
System.out.println(fibo);
prim=in.read();
fibo=in1.read();
}//else close
}//while close


}
catch(Throwable t)
{
}





}//run close



}//class close



class fibprimem extends Thread
{
public static void main(String args[])
{
Thread t=new mainthread();
t.start();
}//main close

}