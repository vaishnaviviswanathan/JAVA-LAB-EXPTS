import java.io.*;
import java.util.*;
import java.lang.*;
import java.sql.*;
import java.util.Properties;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class opac extends JFrame implements ActionListener
{
	CardLayout cards;
	JPanel cardPanel;
	Connection c;
	JTextField loginField,nameField,categoryField,catField,idField,yearField,deptField,titleField,accessField,authorField,titleField1,accessField1,authorField1,categoryField1,statusField1;
	JPasswordField passwdField;
	public opac()
	{
		establishConnection();
		
		cards = new CardLayout();
        	cardPanel = new JPanel();
        	cardPanel.setLayout(cards);
        	
		JPanel welcomePanel = new JPanel();
		ImageIcon libopac = new ImageIcon(getClass().getResource("opac.png"));
		JPanel picPanel = new JPanel();
		JLabel pic=new JLabel(libopac);
		welcomePanel.add(pic,BorderLayout.CENTER);
		JButton entryButton=new JButton("Entry");
		entryButton.addActionListener(this);
		JButton searchButton=new JButton("Search");
		searchButton.addActionListener(this);
		JButton issueButton=new JButton("Issue");
		issueButton.addActionListener(this);
		JButton returnButton=new JButton("Return");
		returnButton.addActionListener(this);
		JButton listButton=new JButton("List");
		listButton.addActionListener(this);
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputPanel.add(entryButton);
		inputPanel.add(searchButton);
		inputPanel.add(issueButton);
		inputPanel.add(returnButton);
		inputPanel.add(listButton);
		welcomePanel.add(inputPanel,BorderLayout.SOUTH);
		cardPanel.add(welcomePanel,"Welcome");
        	
        	JPanel accessPanel=new JPanel();
        	JPanel loginPanel=new JPanel(new GridBagLayout());
        	GridBagConstraints g = new GridBagConstraints();
		g.gridx = 0;
		g.gridy = 0;
        	JLabel loginLabel = new JLabel("UserName");
        	loginPanel.add(loginLabel,g);
        	g.gridx = 1;
		g.gridy = 0;
        	loginField = new JTextField(10);
        	loginPanel.add(loginField,g);
        	g.gridx = 0;
		g.gridy = 1;
        	JLabel passwdLabel = new JLabel("Passsword");
        	loginPanel.add(passwdLabel,g);
        	g.gridx = 1;
		g.gridy = 1;
        	passwdField = new JPasswordField(10);
        	loginPanel.add(passwdField,g);
        	accessPanel.add(loginPanel,BorderLayout.CENTER);
        	JPanel buttonPanel= new JPanel();
        	JButton loginButton= new JButton("Login");
        	JButton cancelButton = new JButton("Back");
        	
        	loginButton.addActionListener(this);
        	cancelButton.addActionListener(this);
        	buttonPanel.add(loginButton);
        	buttonPanel.add(cancelButton);
        	accessPanel.add(buttonPanel,BorderLayout.SOUTH);
        	cardPanel.add(accessPanel,"login");
        	
        	JLabel titleLabel = new JLabel("Title :",SwingConstants.RIGHT);
		titleField = new JTextField(10);
		titleField.setMaximumSize(titleField.getPreferredSize());
		Box titleHbox = Box.createHorizontalBox();
		titleHbox.add(titleLabel);
		titleHbox.add(Box.createHorizontalStrut(10));
		titleHbox.add(titleField);
		JLabel accessLabel = new JLabel("Access No :",SwingConstants.RIGHT);
		accessField = new JTextField(10);
		accessField.setMaximumSize(accessField.getPreferredSize());
		Box accessHbox = Box.createHorizontalBox();
		accessHbox.add(accessLabel);
		accessHbox.add(Box.createHorizontalStrut(10));
		accessHbox.add(accessField);
		JLabel authorLabel = new JLabel("Author :",SwingConstants.RIGHT);
		authorField = new JTextField(10);
		authorField.setMaximumSize(authorField.getPreferredSize());
		Box authorHbox = Box.createHorizontalBox();
		authorHbox.add(authorLabel);
		authorHbox.add(Box.createHorizontalStrut(10));
		authorHbox.add(authorField);
		JLabel categoryLabel = new JLabel("Category :",SwingConstants.RIGHT);
		categoryField = new JTextField(10);
		categoryField.setMaximumSize(categoryField.getPreferredSize());
		Box categoryHbox = Box.createHorizontalBox();
		categoryHbox.add(categoryLabel);
		categoryHbox.add(Box.createHorizontalStrut(10));
		categoryHbox.add(categoryField);
		Box bentryHbox = Box.createHorizontalBox();
		JButton enterbButton = new JButton("Enter Book");
		enterbButton.addActionListener(this);
		JButton cancButton = new JButton("Back");
		cancButton.addActionListener(this);
		bentryHbox.add(enterbButton);
		bentryHbox.add(Box.createGlue());
		bentryHbox.add(cancButton);
		Box bookEntry = Box.createVerticalBox();
		bookEntry.add(titleHbox);
		bookEntry.add(accessHbox);
		bookEntry.add(authorHbox);
		bookEntry.add(categoryHbox);
		bookEntry.add(Box.createGlue());
		bookEntry.add(bentryHbox);
		cardPanel.add(bookEntry,"Book Entry");

		JLabel nameLabel = new JLabel("Name :",SwingConstants.RIGHT);
		nameField = new JTextField(10);
		nameField.setMaximumSize(nameField.getPreferredSize());
		Box nameHbox = Box.createHorizontalBox();
		nameHbox.add(nameLabel);
		nameHbox.add(Box.createHorizontalStrut(10));
		nameHbox.add(nameField);
		JLabel idLabel = new JLabel("ID :",SwingConstants.RIGHT);
		idField = new JTextField(10);
		idField.setMaximumSize(idField.getPreferredSize());
		Box idHbox = Box.createHorizontalBox();
		idHbox.add(idLabel);
		idHbox.add(Box.createHorizontalStrut(10));
		idHbox.add(idField);
		JLabel catLabel = new JLabel("Category :",SwingConstants.RIGHT);
		catField = new JTextField(10);
		catField.setMaximumSize(catField.getPreferredSize());
		Box catHbox = Box.createHorizontalBox();
		catHbox.add(catLabel);
		catHbox.add(Box.createHorizontalStrut(10));
		catHbox.add(catField);
		JLabel deptLabel = new JLabel("Department :",SwingConstants.RIGHT);
		deptField = new JTextField(10);
		deptField.setMaximumSize(deptField.getPreferredSize());
		Box deptHbox = Box.createHorizontalBox();
		deptHbox.add(deptLabel);
		deptHbox.add(Box.createHorizontalStrut(10));
		deptHbox.add(deptField);
		JLabel yearLabel = new JLabel("Year Of Study :",SwingConstants.RIGHT);
		yearField = new JTextField(10);
		yearField.setMaximumSize(yearField.getPreferredSize());
		Box yearHbox = Box.createHorizontalBox();
		yearHbox.add(yearLabel);
		yearHbox.add(Box.createHorizontalStrut(10));
		yearHbox.add(yearField);
		Box mentryHbox = Box.createHorizontalBox();
		JButton entermButton = new JButton("Enter Member");
		entermButton.addActionListener(this);
		JButton canButton = new JButton("Back");
		canButton.addActionListener(this);
		mentryHbox.add(entermButton);
		mentryHbox.add(Box.createGlue());
		mentryHbox.add(canButton);
		
		Box memberEntry = Box.createVerticalBox();
		memberEntry.add(nameHbox);
		memberEntry.add(idHbox);
		memberEntry.add(catHbox);
		memberEntry.add(deptHbox);
		memberEntry.add(yearHbox);
		memberEntry.add(Box.createGlue());
		memberEntry.add(mentryHbox);
		cardPanel.add(memberEntry,"Member Entry");
		
		JLabel titleLabel1 = new JLabel("Title :",SwingConstants.RIGHT);
		titleField1 = new JTextField(10);
		titleField1.setMaximumSize(titleField1.getPreferredSize());
		Box titleHbox1 = Box.createHorizontalBox();
		titleHbox1.add(titleLabel1);
		titleHbox1.add(Box.createHorizontalStrut(10));
		titleHbox1.add(titleField1);
		JLabel accessLabel1 = new JLabel("Access No :",SwingConstants.RIGHT);
		accessField1 = new JTextField(10);
		accessField1.setMaximumSize(accessField1.getPreferredSize());
		Box accessHbox1 = Box.createHorizontalBox();
		accessHbox1.add(accessLabel1);
		accessHbox1.add(Box.createHorizontalStrut(10));
		accessHbox1.add(accessField1);
		JLabel authorLabel1 = new JLabel("Author :",SwingConstants.RIGHT);
		authorField1 = new JTextField(10);
		authorField1.setMaximumSize(authorField1.getPreferredSize());
		Box authorHbox1 = Box.createHorizontalBox();
		authorHbox1.add(authorLabel1);
		authorHbox1.add(Box.createHorizontalStrut(10));
		authorHbox1.add(authorField1);
		JLabel categoryLabel1 = new JLabel("Category :",SwingConstants.RIGHT);
		categoryField1 = new JTextField(10);
		categoryField1.setMaximumSize(categoryField1.getPreferredSize());
		Box categoryHbox1 = Box.createHorizontalBox();
		categoryHbox1.add(categoryLabel1);
		categoryHbox1.add(Box.createHorizontalStrut(10));
		categoryHbox1.add(categoryField1);
		JLabel statusLabel1 = new JLabel("Status :",SwingConstants.RIGHT);
		statusField1 = new JTextField(10);
		statusField1.setMaximumSize(statusField1.getPreferredSize());
		Box statusHbox1 = Box.createHorizontalBox();
		statusHbox1.add(statusLabel1);
		statusHbox1.add(Box.createHorizontalStrut(10));
		statusHbox1.add(statusField1);
		Box bsearchHbox = Box.createHorizontalBox();
		JButton searchTButton = new JButton("Search by Title");
		searchTButton.addActionListener(this);
		JButton searchAButton = new JButton("Search by Author");
		searchAButton.addActionListener(this);
		JButton cancButton1 = new JButton("Back");
		cancButton1.addActionListener(this);
		bsearchHbox.add(searchTButton);
		bsearchHbox.add(Box.createGlue());
		bsearchHbox.add(searchAButton);
		bsearchHbox.add(Box.createGlue());
		bsearchHbox.add(cancButton1);
		Box bookSearch = Box.createVerticalBox();
		bookSearch.add(titleHbox1);
		bookSearch.add(accessHbox1);
		bookSearch.add(authorHbox1);
		bookSearch.add(categoryHbox1);
		bookSearch.add(statusHbox1);
		bookSearch.add(Box.createGlue());
		bookSearch.add(bsearchHbox);
		cardPanel.add(bookSearch,"Book Search");
		
        	add(cardPanel,BorderLayout.CENTER);
        	
		setSize(400,340);
		setTitle("Library Management System");
	}
	private void establishConnection()
	{
		try
  		{
    			Class.forName("com.mysql.jdbc.Driver");
    			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/libopac","lakshmi","blueberry");
			System.out.println("Connection Established!!!");
		}
		catch(Exception e)
		{
			System.out.println("Connection not Established!!!");
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("Entry"))
		{
			setSize(400,100);
			cards.show(cardPanel,"login");
		}
		else if(s.equals("Login"))
		{
			setSize(400,340);
			int c;
			if(loginField.getText().equals("ssn") && passwdField.getText().equals("ssn"))
			{
				String op[]={"Book","Member"};
				c=JOptionPane.showOptionDialog(null,"Enter Book Details or Member Details ?","Choose an option",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,op,null);
				if(c == 0 )
					cards.show(cardPanel,"Book Entry");
				else
					cards.show(cardPanel,"Member Entry");
			}
			else
				JOptionPane.showMessageDialog(null,"Access Denied! Only the Librarian is given Access!");
		}
		else if(s.equals("Back"))
		{
			setSize(400,340);
			loginField.setText("");
			nameField.setText("");
			categoryField.setText("");
			categoryField1.setText("");
			catField.setText("");
			idField.setText("");
			yearField.setText("");
			deptField.setText("");
			titleField.setText("");
			accessField.setText("");
			authorField.setText("");
			titleField1.setText("");
			accessField1.setText("");
			authorField1.setText("");
			statusField1.setText("");
			passwdField.setText("");
			cards.show(cardPanel,"Welcome");
		}
		else if(s.equals("Enter Member"))
		{
			try
			{
				String sql=("insert into MemberDetails values(?,?,?,?,?,?)");
				int a=0;
				PreparedStatement p=c.prepareStatement(sql);
				p.setString(1,nameField.getText());
				p.setString(2,idField.getText());
				p.setString(3,catField.getText());
				p.setString(4,deptField.getText());
				p.setString(5,yearField.getText());
				p.setString(6,Integer.toString(a));
				p.executeUpdate();
				JOptionPane.showMessageDialog(null,"Member Added!");
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(null,"Primary key violated!","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(s.equals("Enter Book"))
		{
			try
			{
				String sql=("insert into BookDetails values(?,?,?,?,?)");
				int a=0;
				PreparedStatement p=c.prepareStatement(sql);
				p.setString(1,titleField.getText());
				p.setString(2,accessField.getText());
				p.setString(4,categoryField.getText());
				p.setString(3,authorField.getText());
				p.setString(5,"Available");
				p.executeUpdate();
				JOptionPane.showMessageDialog(null,"Book Added!");
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(null,"Primary key violated!","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(s.equals("Search by Title"))
		{
			try
			{
				String t=titleField1.getText();
				Statement stmt=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				String query ="select * from BookDetails where Title='" + t +"'";      
				ResultSet rs = stmt.executeQuery(query);
				rs.first();
				String a=rs.getString(2);
				accessField1.setText(a);
				authorField1.setText(rs.getString(3));
				categoryField1.setText(rs.getString(4));
				String st=rs.getString(5);
				statusField1.setText(st);
				JOptionPane.showMessageDialog(null,"Record Found!");
				if(st.equals("Issued"))
				{
					try
					{
						Statement stmt1=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);;
						String query2 ="select MemberId from IssueDetails where BookAccessNo='" + a +"'";
						ResultSet rs1 = stmt1.executeQuery(query2);
						rs1.first();
						String m=rs1.getString(1);
						Statement stmt2=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);;
						String query3="select MemberName from MemberDetails where MemberId='" + m +"'";
						ResultSet rs2 = stmt1.executeQuery(query3);
						rs2.first();
						m=rs2.getString(1);
						JOptionPane.showMessageDialog(null,"Book issued to "+m);
					}
					catch(SQLException es)
					{
						JOptionPane.showMessageDialog(null,"Issue Details not found !!");
					}
				}
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(s.equals("Search by Author"))
		{
			try
			{
				String t=authorField1.getText();
				Statement stmt=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				String query ="select * from BookDetails where Author='" + t +"'";            
				ResultSet rs = stmt.executeQuery(query);
				rs.first();
				titleField1.setText(rs.getString(1));
				String a=rs.getString(2);
				accessField1.setText(a);
				categoryField1.setText(rs.getString(4));
				String st=rs.getString(5);
				statusField1.setText(st);
				JOptionPane.showMessageDialog(null,"Record Found!");
				if(st.equals("Issued"))
				{
					try
					{
						Statement stmt1=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);;
						String query2 ="select MemberId from IssueDetails where BookAccessNo='" + a +"'";
						ResultSet rs1 = stmt1.executeQuery(query2);
						rs1.first();
						String m=rs1.getString(1);
						Statement stmt2=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);;
						String query3="select MemberName from MemberDetails where MemberId='" + m +"'";
						ResultSet rs2 = stmt1.executeQuery(query3);
						rs2.first();
						m=rs2.getString(1);
						JOptionPane.showMessageDialog(null,"Book issued to "+m);
					}
					catch(SQLException es)
					{
						JOptionPane.showMessageDialog(null,"Issue Details not found!!!");
					}
				}
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(null,"Book not found!","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(s.equals("Search"))
		{
			cards.show(cardPanel,"Book Search");
		}
	}	
}

public class db
{
  	public static void main(String[] args) throws ClassNotFoundException,SQLException
  	{
  		opac lib = new opac();
  		lib.setVisible(true);
  		lib.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}
}
