import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class anonymous
{
	public static void main(String []args)
	{
		ButtonFrame f = new ButtonFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		f.makeButton("Yellow",Color.YELLOW);
		f.makeButton("Blue",Color.BLUE);
		f.makeButton("Red",Color.RED);
	}
}

class ButtonFrame extends JFrame
{
	JPanel p;
	public ButtonFrame()
	{
		setTitle("Anonymous Inner Class");
		setSize(300,200);
		
		p = new JPanel();
		add(p);
	}
	
	public void makeButton(String name,final Color bgcolor)
	{
		JButton button = new JButton(name);
		p.add(button);
		button.addActionListener(new ActionListener()
		//anonymous inner class
		{ 
			public void actionPerformed(ActionEvent event)
			{
				p.setBackground(bgcolor);
			}
		});	
	}
}

