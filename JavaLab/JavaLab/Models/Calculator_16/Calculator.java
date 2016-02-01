import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class CalculatorFrame extends JFrame
{
	boolean start = true;
	String str,com,lastCommand = "=";
	JTextField text;
	JMenuBar menuBar;
	JButton one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,res;
	double result = 0;
	int flag,r=0;

	InsertActionListener insert = new InsertActionListener();
	CommandActionListener command = new CommandActionListener();

	CalculatorFrame()
	{
		setSize(400,200);
		setTitle("CALCULATOR");

		menuBar = new JMenuBar();
		JMenu oper = new JMenu("Operations");
			JMenuItem dec = new JMenuItem("Decimal");
			JMenuItem bin = new JMenuItem("Binary");
		
			dec.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					flag = 0;
					two.setEnabled(true);
					three.setEnabled(true);
					four.setEnabled(true);
					five.setEnabled(true);
					six.setEnabled(true);
					seven.setEnabled(true);
					eight.setEnabled(true);
					nine.setEnabled(true);
				}
			});

			bin.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					flag = 1;
					two.setEnabled(false);
					three.setEnabled(false);
					four.setEnabled(false);
					five.setEnabled(false);
					six.setEnabled(false);
					seven.setEnabled(false);
					eight.setEnabled(false);
					nine.setEnabled(false);

					int val = Integer.parseInt(text.getText());
					String bin = Integer.toBinaryString(val);
					text.setText(""+bin);
				}
			});
		menuBar.add(oper);
		oper.add(dec);
		oper.add(bin);

		setJMenuBar(menuBar);

		JPanel p1 = new JPanel();
		text = new JTextField("",30);
		p1.add(text);
		
		JPanel p2 = new JPanel();
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		res = new JButton("=");
	
		one.addActionListener(insert);
		two.addActionListener(insert);
		three.addActionListener(insert);
		four.addActionListener(insert);
		five.addActionListener(insert);
		six.addActionListener(insert);
		seven.addActionListener(insert);
		eight.addActionListener(insert);
		nine.addActionListener(insert);
		zero.addActionListener(insert);
		add.addActionListener(command);
		sub.addActionListener(command);
		mul.addActionListener(command);
		div.addActionListener(command);
		res.addActionListener(command);

		p2.setLayout(new GridLayout(5,3,5,5));
		p2.add(one);
		p2.add(two);
		p2.add(three);
		p2.add(four);
		p2.add(five);
		p2.add(six);
		p2.add(seven);
		p2.add(eight);
		p2.add(nine);
		p2.add(zero);
		p2.add(add);
		p2.add(sub);
		p2.add(mul);
		p2.add(div);
		p2.add(res);

		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		
	}//constructor

	public class InsertActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			str = event.getActionCommand();
			if(start)
			{
				text.setText("");
				if(!str.equals("0"))
					start = false;
			}
			
			text.setText(text.getText() + str);
		}
	}
	
	public class CommandActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			com = event.getActionCommand();
			if(start)
			{
				if(com.equals("-"))
				{
					text.setText(com);
					start = false;
				}
				else
					lastCommand = com;
			}
			else
			{
				if(flag == 1)
					calc(Integer.parseInt(text.getText(),2));
				else
					calculate(Double.parseDouble(text.getText()));
				lastCommand = com;
				start = true;
			}
		}
	}

	public void calculate(double x)
	{
		if(lastCommand.equals("+")) result += x;
		else if(lastCommand.equals("-")) result -=x;
		else if(lastCommand.equals("*")) result *=x;
		else if(lastCommand.equals("/")) result /=x;
		else if(lastCommand.equals("=")) result =x;

		text.setText(""+result);
	}//calculate
	
	public void calc(int x)
	{
		if(lastCommand.equals("+")) r += x;
		else if(lastCommand.equals("-")) r -=x;
		else if(lastCommand.equals("*")) r *=x;
		else if(lastCommand.equals("/")) r /=x;
		else if(lastCommand.equals("=")) r =x;

		String rs = Integer.toBinaryString(r);
		text.setText(""+rs);
	}//calc
}

class Calculator
{
	public static void main(String []args)
	{
		CalculatorFrame cf = new CalculatorFrame();
		cf.setVisible(true);
		cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//main
}//class

