import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
import java.awt.*;


	class GUI extends JFrame
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
		public GUI()
		{
			setSize(600,500);
			setTitle("CHAT SERVER");
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			heading.setName("heading");
			scroll.setName("scroll"); 
			message.requestFocus();
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

public class server extends Thread 
{
	ServerSocket chatserver;
	Socket s;
	DataInputStream d1,d2;
	PrintStream p;
	GUI fr;
	public server()
	{
	try
	{
		chatserver=new ServerSocket(2224);
		s=chatserver.accept();
		d1=new DataInputStream(s.getInputStream());
		p=new PrintStream(s.getOutputStream());
		//d2=new DataInputStream(System.in);
		fr=new GUI();
		fr.send.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				String sending="From Server : "+fr.message.getText();
				p.println(sending);
				fr.messages.append("\n"+sending);
				fr.message.setText("");
			}
		});
		fr.message.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				String sending="From Server : "+fr.message.getText();
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
         		server obj=new server();
         		         		
         }
}

