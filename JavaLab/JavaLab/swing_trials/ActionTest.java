import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ActionTest
{
	public static void main(String []args)
	{
		ActionFrame f = new ActionFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

class ActionFrame extends JFrame
{
	JPanel p;
	public ActionFrame()
	{
		setTitle("ActionTest");
		setSize(300,200);
	
		p = new JPanel();
		add(p);

		//define actions
		Action yellowAction = new ColorAction("Yellow",Color.YELLOW);
		Action blueAction = new ColorAction("Blue",Color.BLUE);
		Action redAction = new ColorAction("Red",Color.RED);

		//add buttons for these actions
		p.add(new JButton(yellowAction));	//these constructors read the name from the action, set the short description as the tooltip
		p.add(new JButton(blueAction));		//and set the action as the listener.
		p.add(new JButton(redAction)); 

		//associate the Y,B,R keys with (object) names --arbitrary object
		KeyStroke ctrlY = KeyStroke.getKeyStroke("ctrl Y");
		KeyStroke ctrlB = KeyStroke.getKeyStroke("ctrl B");
		KeyStroke ctrlR = KeyStroke.getKeyStroke("ctrl R");

		InputMap imap = p.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		imap.put(ctrlY,"panel.yellow");
		imap.put(ctrlB,"panel.blue");
		imap.put(ctrlR,"panel.red");

		//associate the (object) names with actions
		ActionMap amap = p.getActionMap();
		amap.put("panel.yellow",yellowAction);
		amap.put("panel.blue",blueAction);
		amap.put("panel.red",redAction);
	}//constructor

//inner class
	public class ColorAction extends AbstractAction
	{
		public ColorAction(String name,Color c)
		{
			putValue(Action.NAME,name);
			putValue(Action.SHORT_DESCRIPTION,"Set panel color to "+name.toLowerCase());
			putValue("color",c);
		}

		public void actionPerformed(ActionEvent event)
		{
			Color c = (Color) getValue("color");
			p.setBackground(c);
		}
	}
}

