import java.io.*;
import javax.swing.*;
import java.awt.*;

class frame_eg2
{
	public static void main(String args[])
	{
		JFrame f1 = new JFrame();
		f1.setTitle("Frame 2");		

		Toolkit kit = Toolkit.getDefaultToolkit(); //gets an object of class Toolkit
		Dimension screenSize = kit.getScreenSize(); //gets the user-screen size as an object of class Dimension
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		f1.setSize(screenWidth/2,screenHeight/2);

		Image img = kit.getImage("sample.jpg"); 
		f1.setIconImage(img);

		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

