import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements MouseMotionListener
{
	int flag=1;
	int oldx,oldy,x,y;
	JPanel DP;

	myFrame()
	{
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	
		DP=new JPanel();
		add(DP);
		DP.addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent e)
	{
		if(flag==1)
		{
			oldx=x=e.getX();
			oldy=y=e.getY();
			flag=0;
		}
		oldx=x;
		oldy=y;
		x=e.getX();
		y=e.getY();
		Graphics g=DP.getGraphics();
		g.drawLine(oldx,oldy,x,y);
			
	}

	public void mouseMoved(MouseEvent e)
	{
		flag=1;
	}
}

public class FreeHand
{
	public static void main(String args[])
	{
		myFrame f=new myFrame();
		f.setSize(300,200);
	}
}

