import java.io.*;
import java.util.Random;

class BankAccounts
{
	int accountNo;
	String name;
	float balance;
		
	public void createAccount(int accountNo,String name,float balance)
	{
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(float val)
	{
		this.balance += val;		
	}

	public void withdraw(float val)
	{
		this.balance -=val;
	}

	public String[] getData()
	{
		String []str = new String[10];
		str[0] = String.valueOf(this.accountNo);
		str[1] = this.name;
		str[2] = String.valueOf(this.balance);
		return str;
	}
	
	public int getAccountNo()
	{
		return accountNo;
	}
	
	public float getBalance()
	{
		return balance;
	}
}

class Accounts
{
	public static void main(String []args) throws IOException
	{
		BankAccounts []acc = new BankAccounts[10];
		DataInputStream d = new DataInputStream(System.in);
		int no = 0,accountNo,flag,i;
		String name;
		String []s = new String[5];
		float balance;
		Random r = new Random();

		while(true)
		{
			System.out.print("\n\nMENU :\n1.Create an account\n2.Deposit\n3.Withdrawal\n4.Search\n5.Display\n6.Exit\nEnter your choice : ");
			int ch = Integer.parseInt(d.readLine());

			switch(ch)
			{
				case 1:
					acc[no] = new BankAccounts();
					accountNo = r.nextInt(1000);
					System.out.print("\nEnter name :");
					name = d.readLine();
					System.out.print("\nEnter initial deposit : ");
					balance = Float.parseFloat(d.readLine());
					acc[no].createAccount(accountNo,name,balance);
					System.out.print("\nAccount created!!\n");
					s = acc[no].getData();
					System.out.print("\nAccount Details :\nAccount No. : "+s[0]+"\nName : "+s[1]+"\nBalance : "+s[2]);
					no++;
					break;

				case 2:
					flag = 0;
					System.out.print("\nEnter the account no. : ");
					accountNo = Integer.parseInt(d.readLine());
					for(i=0;i<no;i++)
					{
						if(accountNo == acc[i].getAccountNo())
						{
							flag = 1;
							System.out.print("\nEnter the money you would like to deposit : ");
							acc[i].deposit(Float.parseFloat(d.readLine()));
							break;
						}
					}
					if(flag == 0)
						System.out.println("\nInvalid Account number!!\n");
					else
					{
						System.out.println("\nMoney successfully deposited!!\n");
						s = acc[i].getData();
						System.out.print("\nAccount No. : "+s[0]);
						System.out.print("\nName : "+s[1]);
						System.out.println("\nBalance : "+s[2]);
					}
					break;

				case 3:
					int f = 0;
					flag = 0;
					System.out.print("\nEnter the account no. : ");
					accountNo = Integer.parseInt(d.readLine());
					for(i=0;i<no;i++)
					{
						if(accountNo == acc[i].getAccountNo())
						{
							flag = 1;
							System.out.print("\nEnter the money you would like to withdraw : ");
							float amount = Float.parseFloat(d.readLine());
							if(acc[i].getBalance() <= amount)
							{
								f = 1;
								System.out.println("\nInsufficient balance in account!!\n");
							}
							else
								acc[i].withdraw(amount);
							break;
						}
					}
					if(flag == 0)
						System.out.println("\nInvalid Account number!!\n");
					else if(f == 0)
					{
						System.out.println("\nBalance updated!!\n");
						s = acc[i].getData();
						System.out.print("\nAccount No. : "+s[0]);
						System.out.print("\nName : "+s[1]);
						System.out.println("\nBalance : "+s[2]);
					}
					break;

				case 4:
					flag = 0;
					System.out.print("\nEnter the account no. : ");
					accountNo = Integer.parseInt(d.readLine());
					for(i=0;i<no;i++)
					{
						if(accountNo == acc[i].getAccountNo())
						{
							flag = 1;
							s = acc[i].getData();
							System.out.print("\nAccount No. : "+s[0]);
							System.out.print("\nName : "+s[1]);
							System.out.println("\nBalance : "+s[2]);
						}
					}
					if(flag == 0)
						System.out.println("\nInvalid Account number!!\n");
					break;

				case 5:
					for(i=0;i<no;i++)
					{
						s = acc[i].getData();
						System.out.print("\nAccount No. : "+s[0]);
						System.out.print("\nName : "+s[1]);
						System.out.println("\nBalance : "+s[2]);
					}				
					break;

				case 6:
					System.out.println("\nProgram terminating!!\n");
					System.exit(0);
			}//switch
		}//while
	}//main
}//class

