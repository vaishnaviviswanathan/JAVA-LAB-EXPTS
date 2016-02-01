import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
import java.awt.*;

	class gui extends JFrame
	{
		JLabel heading=new JLabel("Chat Application");
		JLabel mess=new JLabel("Message");
		JTextArea messages=new JTextArea();
		JTextField message=new JTextField(30);
		JButton send=new JButton("SEND");
		JScrollPane scroll=new JScrollPane();
		JPanel pan1=new JPanel();
		JPanel pan2=new JPanel();
		JPanel pan=new JPanel();
		public gui()
		{
			setSize(600,500);
			setTitle("CHAT CLIENT");
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			heading.setName("heading");
			scroll.setName("scroll"); 

        messages.setColumns(30);
        messages.setRows(8);
        messages.setEditable(false);
        scroll.setViewportView(messages);
	   pan1.add(heading);
//	   pan1.add(scroll);
	   pan2.add(mess);
	   pan2.add(message);
	   pan2.add(send);

	   add(pan1,BorderLayout.NORTH);
	   add(scroll,BorderLayout.CENTER);
	   add(pan2,BorderLayout.SOUTH);
	  
         }
      }

public class client extends Thread 
{
	//ServerSocket chatserver;
	Socket s;
	DataInputStream d1,d2;
	PrintStream p;
	gui fr;
	public client()
	{
	try
	{
		//chatserver=new ServerSocket(2224);
		s=new Socket("127.0.0.1",2224);
		d1=new DataInputStream(s.getInputStream());
		p=new PrintStream(s.getOutputStream());
		fr=new gui();
		
		//d2=new DataInputStream(System.in);
		fr.send.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				String sending="From client : "+fr.message.getText();
				p.println(sending);
				fr.messages.append("\n"+sending);
				fr.message.setText("");
			}
		});
		
		fr.message.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				String sending="From Client : "+fr.message.getText();
				p.println(sending);
				fr.messages.append("\n"+sending);
				fr.message.setText("");
			}
		});
		new Thread(this,"Receive").start();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public void run()
	{
	try
	{	
		while(true)
		{
			String x;
		
			while((x=d1.readLine())!=null)
			{
				fr.messages.append("\n"+x);
				Thread.sleep(10);
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
		
         public static void main(String [] args)
         {
         		client obj=new client();
         		         		
         }
}

