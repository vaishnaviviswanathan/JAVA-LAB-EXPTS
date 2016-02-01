import java.io.*;
import java.util.*;

class PrimeGenerator extends Thread 
{
	private PipedWriter primeWriter = new PipedWriter();
	public PipedWriter getPipedWriter()
	{
		return primeWriter;
	}
	@Override
	public void run() 
	{
		generatePrime();
	}
	public void generatePrime()
	{
		for (int i = 2; i < 10000; i++) 
		{
			if (isPrime(i)) 
			{
				try
				{
					//System.out.println("From Prime : " + i);
					primeWriter.write(i);
				} 
				catch (IOException e) {}
			}
		}
	}
	private boolean isPrime(int n) 
	{
		boolean prime = true;
		int sqrtValue = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrtValue; i++) 
		{
			if (n%i==0)
			{
				prime = false;
			}
		}
		return prime;
	}
}

class FibonacciGenerator extends Thread 
{
	private PipedWriter fibWriter = new PipedWriter();
	public PipedWriter getPipedWriter()
	{
		return fibWriter;
	}
	@Override
	public void run() 
	{
		generateFibonacci();
	}
	private int f(int n)
	{
		if (n < 2)
			return n;
		else
			return f(n-1)+ f(n-2);
	}
	public void generateFibonacci() 
	{

		for (int i = 2, fibValue = 0; (fibValue = f(i)) < 10000; i++) 
		{
			//System.out.println("From Fibo : " + fibValue);
			try 
			{
				fibWriter.write(fibValue);
			} 
			catch (IOException e) { }
		}
	}
}

class Receiver extends Thread 
{
	private PipedReader fibReader;
	private PipedReader primeReader;
	public Receiver(FibonacciGenerator fib, PrimeGenerator prime) throws IOException 
	{
		fibReader = new PipedReader(fib.getPipedWriter());
		primeReader = new PipedReader(prime.getPipedWriter());
	}
	public void run() 
	{
		int prime = 0;
		int fib = 0;
		try 
		{
			prime = primeReader.read();
			fib = fibReader.read();
		}
		catch (IOException e1) {}
		while (true) 
		{
			//System.out.println("FROM PRIME PIPE ::" + prime);
			//System.out.println("FROM FIB PIPE::" + fib);
			try 
			{
				if (prime == fib) 
				{
					System.out.println("MATCH ::" + prime);
					prime = primeReader.read();
					fib = fibReader.read();
				}
				else if (fib < prime) 
					fib = fibReader.read();
				else
					prime = primeReader.read();
			}
			catch (IOException e) 
			{
				System.exit(1);
			}
		}
	}
}

public class fibprime
{
	public static void main(String[] args) throws IOException 
	{
		FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
		PrimeGenerator primeGenerator = new PrimeGenerator();
		Receiver receiver = new Receiver(fibonacciGenerator, primeGenerator);
		fibonacciGenerator.start();
		primeGenerator.start();
		receiver.start();
	}
}

