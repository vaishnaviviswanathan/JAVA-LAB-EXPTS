import java.io.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.DefaultEditorKit;
import javax.script.*;
import javax.swing.JComponent.*;

class MessagePanel extends JPanel 
{
  	private String message = "Welcome!!!";
  	public MessagePanel() {}
  	public MessagePanel(String message)
  	{
    		this.message = message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
		repaint();
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
 		g.drawString(message,9,9);
	}
}
	
  
class calculator extends JFrame 
{
	CardLayout cards;
	JPanel cardPanel;
	CardLayout disp;
	MessagePanel message;
	JPanel displayPanel;
	ImageIcon exit,cut,paste,copy,help,about,scin,std;
	JMenuBar menu;
	JMenu calcMenu,editMenu,helpMenu;
	JMenuItem exitItem,copyItem,cutItem,pasteItem,helpItem,aboutItem;
	JToolBar modeTool,modeTool1;
	JButton scinButton,stdButton,scinButton1,stdButton1;
	JButton oneButton,twoButton,oneButton1,twoButton1,threeButton,threeButton1,fourButton,fourButton1,fiveButton,fiveButton1,openButton1;
	JButton sixButton,sixButton1,sevenButton,sevenButton1,eightButton,eightButton1,nineButton,nineButton1,zeroButton1,zeroButton,closeButton1;
	JButton plusButton,plusButton1,minusButton,minusButton1,divideButton,divideButton1,multiplyButton,multiplyButton1,equalButton;
	JButton perButton,openButton,closeButton,absButton,pmButton,clearButton,clearButton1,backButton,backButton1,sqrButton,powButton,rootButton;
	JButton sinButton,cosButton,tanButton,logButton,lnButton,tenxButton,eButton,facButton,recButton,pointButton,pointButton1,equalButton1;
	JRadioButton decButton,binButton;
	JCheckBox invCheckBox;
	JTextField textField1,textField2;
	
	public calculator()
	{
		
		setmenu();
		setTopPanel();
		setInputPanel();	
		setStatusPanel();
		setSize(220,270);
		setTitle("Calculator");
	}
	
	public void setmenu()
	{
		menu=new JMenuBar();
		calcMenu = new JMenu("Calculator");
		calcMenu.setMnemonic(KeyEvent.VK_C);
		exitItem = new JMenuItem("Exit",exit);
		exitItem.setToolTipText("Exit application");
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.ALT_MASK));
		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		calcMenu.add(exitItem);
		
		editMenu = new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_E);
		copyItem = new JMenuItem(new DefaultEditorKit.CopyAction() );
		copyItem.setText("Copy");
		copyItem.setIcon(copy);
		copyItem.setToolTipText("Copy text");
		copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		copyItem.setMnemonic(KeyEvent.VK_C);
		cutItem = new JMenuItem(new DefaultEditorKit.CutAction());
		cutItem.setText("Cut");
		cutItem.setIcon(cut);
		cutItem.setToolTipText("Cut text");
		cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		cutItem.setMnemonic(KeyEvent.VK_X);
		pasteItem = new JMenuItem(new DefaultEditorKit.PasteAction() );
		pasteItem.setText("Paste");
		pasteItem.setIcon(paste);
		pasteItem.setToolTipText("Paste text");
		pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
		pasteItem.setMnemonic(KeyEvent.VK_V);
		editMenu.add(cutItem);
		editMenu.add(copyItem);
		editMenu.add(pasteItem);
		
		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		helpItem = new JMenuItem("Help",help);
		helpItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JOptionPane pane1 = new JOptionPane();
				pane1.showOptionDialog(null,"www.google.com","Help", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
			}
		});
		aboutItem = new JMenuItem("About",about);
		helpItem.setToolTipText("Get Help");
		aboutItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JOptionPane pane2 = new JOptionPane();
				pane2.showOptionDialog(null,"Calculator","About", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
			}
		});
		aboutItem.setToolTipText("About the app");
		helpMenu.add(helpItem);
		helpMenu.add(aboutItem);
		
		menu.add(calcMenu);
		menu.add(editMenu);
		menu.add(helpMenu);
		setJMenuBar(menu);
	}
	public void setTopPanel()
	{
		modeTool = new JToolBar();
		scinButton = new JButton("sci");
		scinButton.setToolTipText("Scientific Mode");
		scinButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				setSize(500,270);
				displayPanel.setPreferredSize(new Dimension(25,50));
				cards.next(cardPanel);
				disp.next(displayPanel);
			}
		});
		
		modeTool.add(scinButton);
		stdButton = new JButton("std");
		stdButton.setToolTipText("Standard Mode");
		stdButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				displayPanel.setPreferredSize(new Dimension(20,40));
				setSize(220,270);
				cards.next(cardPanel);
				disp.next(displayPanel);
			}
		});
		modeTool.add(stdButton);
		
		modeTool1 = new JToolBar();
		scinButton1 = new JButton("sci");
		scinButton1.setToolTipText("Scientific Mode");
		scinButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				setSize(500,270);
				displayPanel.setPreferredSize(new Dimension(25,50));
				cards.next(cardPanel);
				disp.next(displayPanel);
			}
		});
		
		modeTool1.add(scinButton1);
		stdButton1 = new JButton("std");
		stdButton1.setToolTipText("Standard Mode");
		stdButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				setSize(220,270);
				displayPanel.setPreferredSize(new Dimension(20,40));
				cards.next(cardPanel);
				disp.next(displayPanel);
			}
		});
		modeTool1.add(stdButton1);
		
		JPanel rPanel = new JPanel();
		decButton = new JRadioButton("Dec",true);
		decButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				twoButton.setEnabled(true);
				threeButton.setEnabled(true);
				fourButton.setEnabled(true);
				fiveButton.setEnabled(true);
				sixButton.setEnabled(true);
				sevenButton.setEnabled(true);
				eightButton.setEnabled(true);
				nineButton.setEnabled(true);
				perButton.setEnabled(true);
				openButton.setEnabled(true);
				closeButton.setEnabled(true);
				eButton.setEnabled(true);
				powButton.setEnabled(true);
				lnButton.setEnabled(true);
				logButton.setEnabled(true);
				sinButton.setEnabled(true);
				cosButton.setEnabled(true);
				tanButton.setEnabled(true);
				rootButton.setEnabled(true);
				tenxButton.setEnabled(true);
				facButton.setEnabled(true);
				recButton.setEnabled(true);
				absButton.setEnabled(true);
				sqrButton.setEnabled(true);
				pointButton.setEnabled(true);
			}
		});
		binButton = new JRadioButton("Bin");
		binButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent Event){
				twoButton.setEnabled(true);
				threeButton.setEnabled(true);
				fourButton.setEnabled(false);
				fiveButton.setEnabled(false);
				sixButton.setEnabled(false);
				sevenButton.setEnabled(false);
				eightButton.setEnabled(false);
				nineButton.setEnabled(false);
				perButton.setEnabled(false);
				openButton.setEnabled(false);
				closeButton.setEnabled(false);
				eButton.setEnabled(false);
				powButton.setEnabled(false);
				lnButton.setEnabled(false);
				logButton.setEnabled(false);
				sinButton.setEnabled(false);
				cosButton.setEnabled(false);
				tanButton.setEnabled(false);
				rootButton.setEnabled(false);
				tenxButton.setEnabled(false);
				facButton.setEnabled(false);
				recButton.setEnabled(false);
				absButton.setEnabled(false);
				sqrButton.setEnabled(false);
				pointButton.setEnabled(false);
			}
		});
				
		ButtonGroup group1 = new ButtonGroup();
		group1.add(decButton);
		group1.add(binButton);
		invCheckBox = new JCheckBox("Inv", false);
		rPanel.add(binButton);
		rPanel.add(decButton);
		
		JPanel cPanel = new JPanel();
		cPanel.add(invCheckBox);
		
		textField1 = new JTextField();
		textField2 = new JTextField();
		displayPanel = new JPanel();
		disp = new CardLayout();
        	displayPanel.setLayout(disp);
        	
        JPanel displayPanel1 = new JPanel();
        JPanel displayPanel2 = new JPanel();
		displayPanel1.setLayout(new GridLayout(1,2));
		displayPanel1.add(modeTool);
		displayPanel1.add(textField1);
		
		displayPanel2.setLayout(new GridLayout(2,2));
		
		displayPanel2.add(modeTool1);
		displayPanel2.add(textField2);
		displayPanel2.add(rPanel);
		displayPanel2.add(cPanel);
		
		displayPanel.add(displayPanel1,"Standard Display");
		displayPanel.add(displayPanel2,"Scientific display");
		displayPanel.setPreferredSize(new Dimension(20,40));
		add(displayPanel,BorderLayout.NORTH);
	}
	public void setInputPanel()
	{
		oneButton = new JButton("1");
		oneButton.setToolTipText("One");
		oneButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"1");
			}
		});
		oneButton1 = new JButton("1");
		oneButton1.setToolTipText("One");
		oneButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"1");
			}
		});
		twoButton = new JButton("2");
		twoButton.setToolTipText("Two");
		twoButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"2");
			}
		});
		twoButton1 = new JButton("2");
		twoButton1.setToolTipText("Two");
		twoButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"2");
			}
		});
		threeButton1 = new JButton("3");
		threeButton1.setToolTipText("Three");
		threeButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"3");
			}
		});
		threeButton = new JButton("3");
		threeButton.setToolTipText("Three");
		threeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"3");
			}
		});
		fourButton = new JButton("4");
		fourButton.setToolTipText("Four");
		fourButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"4");
			}
		});
		fourButton1 = new JButton("4");
		fourButton1.setToolTipText("Four");
		fourButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"4");
			}
		});
		fiveButton1 = new JButton("5");
		fiveButton1.setToolTipText("Five");
		fiveButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"5");
			}
		});
		fiveButton = new JButton("5");
		fiveButton.setToolTipText("Five");
		fiveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"5");
			}
		});
		sixButton = new JButton("6");
		sixButton.setToolTipText("Six");
		sixButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"6");
			}
		});
		sixButton1 = new JButton("6");
		sixButton1.setToolTipText("Six");
		sixButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"6");
			}
		});
		sevenButton = new JButton("7");
		sevenButton.setToolTipText("Seven");
		sevenButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"7");
			}
		});
		sevenButton1 = new JButton("7");
		sevenButton1.setToolTipText("Seven");
		sevenButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"7");
			}
		});
		eightButton = new JButton("8");
		eightButton.setToolTipText("Eight");
		eightButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"8");
			}
		});
		eightButton1 = new JButton("8");
		eightButton1.setToolTipText("Eight");
		eightButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"8");
			}
		});
		nineButton = new JButton("9");
		nineButton.setToolTipText("Nine");
		nineButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"9");
			}
		});
		nineButton1 = new JButton("9");
		nineButton1.setToolTipText("Nine");
		nineButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"9");
			}
		});
		zeroButton = new JButton("0");
		zeroButton.setToolTipText("Zero");
		zeroButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"0");
			}
		});
		zeroButton1 = new JButton("0");
		zeroButton1.setToolTipText("Zero");
		zeroButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"0");
			}
		});
		plusButton = new JButton("+");
		plusButton.setToolTipText("Add");
		plusButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"+");
			}
		});
		plusButton1 = new JButton("+");
		plusButton1.setToolTipText("Add");
		plusButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"+");
			}
		});
		minusButton = new JButton("-");
		minusButton.setToolTipText("Subtract");
		minusButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"-");
			}
		});
		minusButton1 = new JButton("-");
		minusButton1.setToolTipText("Subtract");
		minusButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"-");
			}
		});
		multiplyButton = new JButton("*");
		multiplyButton.setToolTipText("Multiply");
		multiplyButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"*");
			}
		});
		multiplyButton1 = new JButton("*");
		multiplyButton1.setToolTipText("Multiply");
		multiplyButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"*");
			}
		});
		divideButton = new JButton("/");
		divideButton.setToolTipText("Divide");
		divideButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"/");
			}
		});
		divideButton1 = new JButton("/");
		divideButton1.setToolTipText("Divide");
		divideButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"/");
			}
		});
		backButton = new JButton("C");
		backButton.setToolTipText("BackSpace");
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				String s=textField2.getText();
				s = s.substring(0, s.length() - 1);
				textField2.setText(s);
			}
		});
		backButton1 = new JButton("C");
		backButton1.setToolTipText("BackSpace");
		backButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				String s=textField1.getText();
				s = s.substring(0, s.length() - 1);
				textField1.setText(s);
			}
		});
		clearButton1 = new JButton("CE");
		clearButton1.setToolTipText("Clear Display");
		clearButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText("");
			}
		});
		clearButton = new JButton("CE");
		clearButton.setToolTipText("Clear Display");
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText("");
			}
		});
		pointButton = new JButton(".");
		pointButton.setToolTipText("Decimal point");
		pointButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+".");
			}
		});
		pointButton1 = new JButton(".");
		pointButton1.setToolTipText("Decimal point");
		pointButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+".");
			}
		});
		equalButton = new JButton("=");
		equalButton.setToolTipText("Equals");
		equalButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				String str2,str1,s1,s2,s;
				double a,b;
				if(decButton.isSelected())
				{
					str2 = textField2.getText();
					if(str2.contains("^"))
					{
						StringTokenizer strTok = new StringTokenizer(str2, "^");
						s1=strTok.nextToken();
						s2=strTok.nextToken();
						a=Double.parseDouble(s1);
						b=Double.parseDouble(s2);
						a=Math.pow(a,b);
						str1=String.format("%f",a);
						textField2.setText(str1);
					}
					else
					{
						ScriptEngineManager mgr = new ScriptEngineManager();
    						ScriptEngine engine = mgr.getEngineByName("JavaScript");
    						try 
						{
							Object o = engine.eval(str2);
							s1=String.valueOf(o);
							a=Double.parseDouble(s1);
							str1=String.format("%.5f",a);
							textField2.setText(str1);
						}
						catch(ScriptException ss)
						{
							message.setMessage("Malformed Expression");
						}
					}
				}
				else
				{
					str1 = textField2.getText();
					StringTokenizer strTok = new StringTokenizer(str1, "+-*/");
					s1=strTok.nextToken();
					s2=strTok.nextToken();
					int i1=Integer.parseInt(s1,2);
					int i2=Integer.parseInt(s2,2);
					s1=Integer.toString(i1);
					s2=Integer.toString(i2);
					s=s1;
					if(str1.contains("-"))
						s=s+"-";
					else if(str1.contains("+"))
						s=s+"+";
					else if(str1.contains("*"))
						s=s+"*";
					else if(str1.contains("/"))
						s=s+"/";
					s=s+s2;
					ScriptEngineManager mg = new ScriptEngineManager();
    					ScriptEngine engin = mg.getEngineByName("JavaScript");
    					try 
					{
						Object o = engin.eval(s);
                                                
						s1=String.valueOf(o);

						double i=Double.parseDouble(s1);

			                        int ii=(int)Math.round(i);
			                        s2=Integer.toBinaryString(ii);

						textField2.setText(s2);
					}
					catch(ScriptException ss)
					{
						message.setMessage("Malformed Expression");
					}
				}					
			}
		});
		
		openButton = new JButton("(");
		openButton.setToolTipText("open braces");
		openButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"(");
			}
		});
		equalButton1 = new JButton("=");
		equalButton1.setToolTipText("Equals");
		equalButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
					String str1 = textField1.getText();
					ScriptEngineManager mgr = new ScriptEngineManager();
    					ScriptEngine engine = mgr.getEngineByName("JavaScript");
    					try 
					{
						Object o = engine.eval(str1);
						String s=String.valueOf(o);
						float f=Float.parseFloat(s);
						String s1=String.format("%.5f",f);
						textField1.setText(s1);
					}
					catch(ScriptException ss)
					{
						message.setMessage("Malformed Expression");
					}
				}
		});
		openButton1 = new JButton("(");
		openButton1.setToolTipText("open braces");
		openButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+"(");
			}
		});
		closeButton = new JButton(")");
		closeButton.setToolTipText("Close braces");
		closeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+")");
			}
		});
		closeButton1 = new JButton(")");
		closeButton1.setToolTipText("Close braces");
		closeButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField1.setText(textField1.getText()+")");
			}
		});
		absButton = new JButton("abs");
		absButton.setToolTipText("Absolute Value");
		absButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					float f=Float.parseFloat(s);
					float f1=Math.abs(f);
					String s1=String.format("%f",f1);
					textField2.setText(s1);
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the absolute value");
				}
			}
		});
		pmButton = new JButton("+/-");
		pmButton.setToolTipText("Unary plus / minus");
		pmButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					if(s.charAt(0)=='-')
					{
						float f=Float.parseFloat(s);
						float f1=Math.abs(f);
						String s1=String.format("%f",f1);
						textField2.setText(s1);
					}
					else 
					{
						String s2="-"+s;
						textField2.setText(s2);
					}
				}
				catch(StringIndexOutOfBoundsException s)
				{
					message.setMessage("Enter a number to change the sign");
				}
			}
		});
		perButton = new JButton("%");
		perButton.setToolTipText("modulus");
		perButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"%");
			}
		});
		recButton = new JButton("1/x");
		recButton.setToolTipText("Reciprocal");
		recButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				String str1 = textField2.getText();
				ScriptEngineManager mgr = new ScriptEngineManager();
    				ScriptEngine engine = mgr.getEngineByName("JavaScript");
    				try 
				{
					str1="1/"+str1;
					Object o = engine.eval(str1);
					String s=String.valueOf(o);
					float f=Float.parseFloat(s);
					String s1=String.format("%.5f",f);
					textField2.setText(s1);
				}
				catch(ScriptException ss)
				{
					message.setMessage("Enter a number to find the reciprocal");
				}
			}
		});
		sqrButton = new JButton("x^2");
		sqrButton.setToolTipText("square");
		sqrButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					double f=Double.parseDouble(s);
					double f1=Math.pow(f,2);
					String s1=String.format("%f",f1);
					textField2.setText(s1);
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the square");
				}
			}
		});
		rootButton = new JButton("root");
		rootButton.setToolTipText("Square Root");
		rootButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					double f=Double.parseDouble(s);
					double f1=Math.sqrt(f);
					String s1=String.format("%f",f1);
					textField2.setText(s1);
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the squareroot");
				}
			}
		});
		powButton = new JButton("x^y");
		powButton.setToolTipText("Power");
		powButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				textField2.setText(textField2.getText()+"^");
			}
		});
		eButton = new JButton("e^x");
		eButton.setToolTipText("e^x");
		eButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					double f=Double.parseDouble(s);
					double f1=Math.exp(f);
					String s1=String.format("%f",f1);
					textField2.setText(s1);
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find e^x");
				}
			}
		});
		facButton = new JButton("x!");
		facButton.setToolTipText("Factorial");
		facButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					int f=Integer.parseInt(s);
					int fact=1;
					for (int c=1;c<=f;c++)
            					fact = fact*c;
            				s=Integer.toString(fact);
            				textField2.setText(s);
            			}
            			catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the factorial");
				}
			}
		});
		lnButton = new JButton("ln");
		lnButton.setToolTipText("Natural logarithms");
		lnButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					double f=Double.parseDouble(s);
					double f1=Math.log(f);
					String s1=String.format("%f",f1);
					textField2.setText(s1);
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the Natural logarithm");
				}
			}
		});
		logButton = new JButton("log");
		logButton.setToolTipText("Logarithms");
		logButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				
				try
				{
					String s=textField2.getText();
					double f=Double.parseDouble(s);
					double f1=Math.log10(f);
					String s1=String.format("%f",f1);
					textField2.setText(s1);
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the logarithm");
				}
			}
		});
		tenxButton = new JButton("10^x");
		tenxButton.setToolTipText("10 power x");
		tenxButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					String s=textField2.getText();
					double f=Double.parseDouble(s);
					double f1=Math.pow(10,f);
					String s1=String.format("%f",f1);
					textField2.setText(s1);
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the 10th power");
				}
			}
		});
		sinButton = new JButton("sin");
		sinButton.setToolTipText("Sine");
		sinButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				try
				{
					if(invCheckBox.isSelected())
					{
						String s=textField2.getText();
						double f=Double.parseDouble(s);
						double f1=Math.asin(f);
						f1=f1*180/Math.PI;
						String s1=String.format("%f",f1);
						textField2.setText(s1);
					}
					else
					{
						String s=textField2.getText();
						double f=Double.parseDouble(s);
						double f1=Math.sin(f*Math.PI/180);
						String s1=String.format("%f",f1);
						textField2.setText(s1);
					}
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the sine value");
				}
			}
		});
		cosButton = new JButton("cos");
		cosButton.setToolTipText("Cosine");
		cosButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					if(invCheckBox.isSelected())
					{
						String s=textField2.getText();
						double f=Double.parseDouble(s);
						double f1=Math.acos(f);
						f1=f1*180/Math.PI;
						String s1=String.format("%f",f1);
						textField2.setText(s1);
					}
					else
					{
						String s=textField2.getText();
						double f=Double.parseDouble(s);
						double f1=Math.cos(f*Math.PI/180);
						String s1=String.format("%f",f1);
						textField2.setText(s1);
					}
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the cosine value");
				}
			}
		});
		tanButton = new JButton("tan");
		tanButton.setToolTipText("tangent");
		tanButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try
				{
					if(invCheckBox.isSelected())
					{
						String s=textField2.getText();
						double f=Double.parseDouble(s);
						double f1=Math.atan(f);
						f1=f1*180/Math.PI;
						String s1=String.format("%f",f1);
						textField2.setText(s1);
					}
					else
					{
						String s=textField2.getText();
						double f=Double.parseDouble(s);
						double f1=Math.tan(f*Math.PI/180);
						String s1=String.format("%f",f1);
						textField2.setText(s1);
					}
				}
				catch(NumberFormatException nfe)
				{
					message.setMessage("Enter a number to find the tangent");
				}
			}
		});
		
		cards = new CardLayout();
        	cardPanel = new JPanel();
        	cardPanel.setLayout(cards);

		JPanel scinPanel = new JPanel();
		scinPanel.setLayout(new GridLayout(5,7,3,3));
		scinPanel.add(openButton);
		scinPanel.add(closeButton);
		scinPanel.add(absButton);
		scinPanel.add(perButton);
		scinPanel.add(pmButton);
		scinPanel.add(clearButton);
		scinPanel.add(backButton);
		scinPanel.add(rootButton);
		scinPanel.add(sqrButton);
		scinPanel.add(powButton);
		scinPanel.add(sevenButton);
		scinPanel.add(eightButton);
		scinPanel.add(nineButton);
		scinPanel.add(divideButton);
		scinPanel.add(recButton);
		scinPanel.add(facButton);
		scinPanel.add(eButton);
		scinPanel.add(fourButton);
		scinPanel.add(fiveButton);
		scinPanel.add(sixButton);
		scinPanel.add(multiplyButton);
		scinPanel.add(lnButton);
		scinPanel.add(tenxButton);
		scinPanel.add(logButton);
		scinPanel.add(oneButton);
		scinPanel.add(twoButton);
		scinPanel.add(threeButton);
		scinPanel.add(minusButton);
		scinPanel.add(sinButton);
		scinPanel.add(cosButton);
		scinPanel.add(tanButton);
		scinPanel.add(zeroButton);
		scinPanel.add(pointButton);
		scinPanel.add(equalButton);
		scinPanel.add(plusButton);
			
		JPanel stdPanel = new JPanel();
		stdPanel.setLayout(new GridLayout(5,4,3,3));
		stdPanel.add(openButton1);
		stdPanel.add(closeButton1);
		stdPanel.add(clearButton1);
		stdPanel.add(backButton1);
		stdPanel.add(sevenButton1);
		stdPanel.add(eightButton1);
		stdPanel.add(nineButton1);
		stdPanel.add(divideButton1);
		stdPanel.add(fourButton1);
		stdPanel.add(fiveButton1);
		stdPanel.add(sixButton1);
		stdPanel.add(multiplyButton1);
		stdPanel.add(oneButton1);
		stdPanel.add(twoButton1);
		stdPanel.add(threeButton1);
		stdPanel.add(minusButton1);
		stdPanel.add(zeroButton1);
		stdPanel.add(pointButton1);
		stdPanel.add(equalButton1);
		stdPanel.add(plusButton1);	
		
		cardPanel.add(stdPanel,"Standard");
        	cardPanel.add(scinPanel,"Scientific");
		add(cardPanel,BorderLayout.CENTER);
	}
	public void setStatusPanel()
	{
		message=new MessagePanel();
		add(message,BorderLayout.SOUTH);
	}
}

public class cal
{
	public static void main(String[] args)
	{
		calculator cal=new calculator();
		cal.setVisible(true);
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

