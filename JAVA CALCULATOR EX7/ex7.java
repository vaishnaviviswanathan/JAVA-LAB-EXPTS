import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class framecreate extends JFrame
{
public static final int DEFAULT_WIDTH=450;
public static final int DEFAULT_HEIGHT=500;
framecreate()
{
super("Calculator");
setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
}
}
class action implements ActionListener
{
ArrayList<String> str=new ArrayList<String>();
ArrayList<String> str3=new ArrayList<String>();
static int i=0;
public void actionPerformed(ActionEvent e)
{
ex7 obj=new ex7();
if(e.getSource() == obj.button1)
{
int k;
str.add("1");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button2)
{
int k;
str.add("2");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button3)
{
int k;
str.add("3");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button4)
{
int k;
str.add("4");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button5)
{
int k;
str.add("5");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button6)
{
int k;
str.add("6");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button7)
{
int k;
str.add("7");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button8)
{
int k;
str.add("8");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button9)
{
int k;
str.add("9");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button10)
{
int k;
str.add(".");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button11)
{
int k;
str.add("0");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button12)//backspace
{
int k;
i--;
str.remove(i);
StringBuffer str1=new StringBuffer();
for(k=0;k<=i-1;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
}
else if(e.getSource() == obj.button13)// "+"
{
int k;
str.add("+");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button14)// "-"
{
int k;
str.add("-");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button15)// "*"
{
int k;
str.add("*");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button16)// "/"
{
int k;
str.add("/");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource() == obj.button17)
{
int k;
double x;
StringBuffer str1=new StringBuffer();

if(str.get(0).equals("abs"))
{
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
x=Double.parseDouble(s1);
str.add(Double.toString(Math.abs(x)));
}
else if(str.get(0).equals("log"))
{
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
x=Double.parseDouble(s1);
str.add(Double.toString(Math.log(x)));
}
else if(str.indexOf("^")>-1)
{
double k1,k2,k3;
StringBuffer str2=new StringBuffer();
for(k=0;k<i;k++)
if(str.indexOf("^")>k)
str1.append(str.get(k));
else if(str.indexOf("^")<k)
str2.append(str.get(k));
String s1=new String(str1);
//System.out.println(s1);
k1=Double.parseDouble(s1);
//System.out.println(str.size());
String s2=new String(str2);
k2=Double.parseDouble(s2);
k3=Math.pow(k1,k2);
str.add(Double.toString(k3));
}
else if(str.indexOf("^-1")>-1)
{
double k1,k2;
for(k=0;k<i;k++)
if(str.indexOf("^-1")>k)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
k2=1/k1;
str.add(Double.toString(k2));
}
else if(str.indexOf("!")>-1)
{
int k1,k2=1;
for(k=0;k<i;k++)
if(str.indexOf("!")>k)
str1.append(str.get(k));
String s1=new String(str1);
k1=Integer.parseInt(s1);
for(k=1;k<=k1;k++)
k2*=k;
str.add(Double.toString(k2));
}
else if(str.indexOf("log10")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
str.add(Double.toString(Math.log10(k1)));
}
else if(str.indexOf("10^")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
str.add(Double.toString(Math.pow(10,k1)));
}
else if(str.indexOf("e^")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
str.add(Double.toString(Math.exp(k1)));
}
else if(str.indexOf("sin-1")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
k1=Math.asin(k1);
str.add(Double.toString(Math.toDegrees(k1)));
}
else if(str.indexOf("cos-1")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
k1=Math.acos(k1);
str.add(Double.toString(Math.toDegrees(k1)));
}
else if(str.indexOf("tan-1")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
k1=Math.atan(k1);
str.add(Double.toString(Math.toDegrees(k1)));
}
else if(str.indexOf("sin")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
k1=Math.toRadians(k1);
str.add(Double.toString(Math.sin(k1)));
}
else if(str.indexOf("cos")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
k1=Math.toRadians(k1);
str.add(Double.toString(Math.cos(k1)));
}
else if(str.indexOf("tan")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
k1=Math.toRadians(k1);
str.add(Double.toString(Math.tan(k1)));
}
else if(str.indexOf("sqrt")>-1)
{
double k1;
for(k=1;k<i;k++)
str1.append(str.get(k));
String s1=new String(str1);
k1=Double.parseDouble(s1);
str.add(Double.toString(Math.sqrt(k1)));
}
else if(obj.button23.isSelected())
{
//System.out.println("binary ulla");
int n1,n2,n3;
String c1;
for(k=0;!(str.get(k).equals("+")||str.get(k).equals("-")||str.get(k).equals("*")||str.get(k).equals("/"));k++)
{
//System.out.println("in first for!!");
str1.append(str.get(k));
}
String s1=new String(str1);
n1=Integer.parseInt(s1,2);
str1=new StringBuffer();
c1=str.get(k);
for(k=k+1;k<i;k++)
{
//System.out.println("in second for!!");
str1.append(str.get(k));
}
String s2=new String(str1);
n2=Integer.parseInt(s2,2);
n3=0;
if(c1.equals("+"))
n3=n1+n2;
else if(c1.equals("-"))
n3=n1-n2;
else if(c1.equals("*"))
n3=n1*n2;
else if(c1.equals("/"))
n3=n1/n2;
str.add(Integer.toBinaryString(n3));
}
else
{
/*int j=0;
for(k=0;k<i;k++)
System.out.println(str.get(k));
for(k=0;k<i;k++)
{
if(!(str.get(k).equals("+")||str.get(k).equals("-")||str.get(k).equals("*")||str.get(k).equals("/")))
{
//System.out.println("in if");
str1.append(str.get(k));
}
else if(k==str.size()-1)
{
//System.out.println("in else if");
double k1;
j++;
str1.append(str.get(k));
String s2=new String(str1);
k1=Double.parseDouble(s2);
String s1=new String(Double.toString(k1));
str3.add(s1);
//String s3=new String(str3);
break;
}
else
{
/*double k1;
j+=2;
//System.out.println("in else");
String s2=new String(str1);
k1=Double.parseDouble(s2);
String s1=new String(Double.toString(k1));
str3.add(s1);
str3.add(str.get(k));
str1=new StringBuffer();*/
int n1,n2,n3;
String c1;
for(k=0;!(str.get(k).equals("+")||str.get(k).equals("-")||str.get(k).equals("*")||str.get(k).equals("/"));k++)
{
//System.out.println("in first for!!");
str1.append(str.get(k));
}
String s1=new String(str1);
n1=Integer.parseInt(s1);
str1=new StringBuffer();
c1=str.get(k);
for(k=k+1;k<i;k++)
{
//System.out.println("in second for!!");
str1.append(str.get(k));
}
String s2=new String(str1);
n2=Integer.parseInt(s2);
n3=0;
if(c1.equals("+"))
n3=n1+n2;
else if(c1.equals("-"))
n3=n1-n2;
else if(c1.equals("*"))
n3=n1*n2;
else if(c1.equals("/"))
n3=n1/n2;
str.add(Integer.toString(n3));
}
//double  n1,n2,n3;
//for(k=0;k<j;k++)
//{
//}
//while((s3.IndexOf('*')||s3.IndexOf('/'))>(s3.IndexOf('-')||s3.IndexOf('+')))
//{
//if(s3.IndexOf('*')>s3.IndexOf('/'))
//{
//}
//}
if(i!=-1)
obj.text.setText(str.get(i));
str=new ArrayList<String>();
i=0;
}
else if(e.getSource()==obj.button18)// "%"
{
int k;
str.add("%");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button19)// "abs"
{
int k;
str.add("abs");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button20)// "log"
{
int k;
str.add("log");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button21)// "x^y"
{
int k;
str.add("^");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button22)//Decimal
{
int k;
obj.button22.setSelected(true);
obj.button23.setSelected(false);
obj.button2.setEnabled(true);
obj.button3.setEnabled(true);
obj.button4.setEnabled(true);
obj.button5.setEnabled(true);
obj.button6.setEnabled(true);
obj.button7.setEnabled(true);
obj.button8.setEnabled(true);
obj.button9.setEnabled(true);
}
else if(e.getSource()==obj.button23)//Binary
{
int k;
obj.button19.setEnabled(false);
obj.button20.setEnabled(false);
obj.button21.setEnabled(false);
//obj.button22.setEnabled(false);
//obj.button23.setEnabled(false);
obj.button31.setEnabled(false);
obj.button25.setEnabled(false);
obj.button26.setEnabled(false);
obj.button27.setEnabled(false);
obj.button28.setEnabled(false);
obj.button29.setEnabled(false);
obj.button30.setEnabled(false);
obj.button32.setEnabled(false);
obj.button33.setEnabled(false);
obj.button34.setEnabled(false);
obj.button23.setSelected(true);
obj.button22.setSelected(false);
obj.button2.setEnabled(false);
obj.button3.setEnabled(false);
obj.button4.setEnabled(false);
obj.button5.setEnabled(false);
obj.button6.setEnabled(false);
obj.button7.setEnabled(false);
obj.button8.setEnabled(false);
obj.button9.setEnabled(false);
}
else if(e.getSource()==obj.button24)//clear
{
str=new ArrayList<String>();
String s1=new String(" ");
obj.text.setText(s1);
i=0;
}
else if(e.getSource()==obj.button26)//x!
{
int k;
str.add("!");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button25)//1/x
{
int k;
str.add("^-1");
obj.button26.setSelected(true);
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button27)//log10
{
int k;
str.add("log10");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button28)//10^x
{
int k;
str.add("10^");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button29)//1/x
{
int k;
str.add("e^");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button30&&!obj.button33.isSelected())//sin
{
int k;
str.add("sin");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button31&&!obj.button33.isSelected())//cos
{
int k;
str.add("cos");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button32&&!obj.button33.isSelected())//tan
{
int k;
str.add("tan");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button30)//Inv sin
{
int k;
str.add("sin-1");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button31)//Inv cos
{
int k;
str.add("cos-1");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button32)//Inv tan
{
int k;
str.add("tan-1");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.button34)//Sqrt
{
int k;
str.add("sqrt");
StringBuffer str1=new StringBuffer();
for(k=0;k<=i;k++)
str1.append(str.get(k));
String s1=new String(str1);
obj.text.setText(s1);
i++;
}
else if(e.getSource()==obj.menuitem1)//menu item scientific calculator
{
int k;
System.out.println("Scientific");
obj.button19.setEnabled(true);
obj.button20.setEnabled(true);
obj.button21.setEnabled(true);
obj.button22.setEnabled(true);
obj.button23.setEnabled(true);
obj.button31.setEnabled(true);
obj.button25.setEnabled(true);
obj.button26.setEnabled(true);
obj.button27.setEnabled(true);
obj.button28.setEnabled(true);
obj.button29.setEnabled(true);
obj.button30.setEnabled(true);
obj.button32.setEnabled(true);
obj.button33.setEnabled(true);
obj.button34.setEnabled(true);
}
else if(e.getSource()==obj.menuitem2)//menu item normal calculator
{
int k;
obj.button19.setEnabled(false);
obj.button20.setEnabled(false);
obj.button21.setEnabled(false);
obj.button22.setEnabled(false);
obj.button23.setEnabled(false);
obj.button31.setEnabled(false);
obj.button25.setEnabled(false);
obj.button26.setEnabled(false);
obj.button27.setEnabled(false);
obj.button28.setEnabled(false);
obj.button29.setEnabled(false);
obj.button30.setEnabled(false);
obj.button32.setEnabled(false);
obj.button33.setEnabled(false);
obj.button34.setEnabled(false);
}
else if(e.getSource()==obj.menuitem3)//menu item normal calculator
{
System.exit(0);
}

}
}
class ex7
{
static JTextField text=new JTextField(20);
static JButton button1=new JButton("1");
static JButton button2=new JButton("2");
static JButton button3=new JButton("3");
static JButton button4=new JButton("4");
static JButton button5=new JButton("5");
static JButton button6=new JButton("6");
static JButton button7=new JButton("7");
static JButton button8=new JButton("8");
static JButton button9=new JButton("9");
static JButton button10=new JButton(".");
static JButton button11=new JButton("0");
static JButton button12=new JButton("<-");
static JButton button13=new JButton("+");
static JButton button14=new JButton("-");
static JButton button15=new JButton("*");
static JButton button16=new JButton("/");
static JButton button17=new JButton("=");
static JButton button18=new JButton("%");
static JButton button19=new JButton("abs");
static JButton button20=new JButton("log");
static JButton button21=new JButton("x^y");
static JButton button25=new JButton("1/x");
static JButton button26=new JButton("x!");
static JButton button24=new JButton("clear");
static JButton button27=new JButton("log10");
static JButton button28=new JButton("10^x");
static JButton button29=new JButton("e^x");
static JButton button30=new JButton("sin");
static JButton button31=new JButton("cos");
static JButton button32=new JButton("tan");
static JButton button34=new JButton("sqrt");
static JMenuBar menubar=new JMenuBar();
static JMenu menu1=new JMenu("Calculator");
static JMenuItem menuitem1=new JMenuItem("Scientific");
static JMenuItem menuitem2=new JMenuItem("Normal");
static JMenuItem menuitem3=new JMenuItem("Quit");
static JCheckBox button33=new JCheckBox("Inv",false);
static JRadioButton button22=new JRadioButton("Decimal",true);
static JRadioButton button23=new JRadioButton("Binary",false);
//static JButton button21=new JButton("x^y");
public static void main(String[] a)
{
 action obj=new action();
framecreate frame=new framecreate();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
JPanel pane2= new JPanel();
pane2.setVisible(true);
pane2.setLayout(new GridLayout(6,6));
JPanel pane3= new JPanel();
pane3.setLayout(new FlowLayout());
//JPanel pane4= new JPanel();
//pane4.setLayout(new BorderLayout());
menu1.add(menuitem1);
menu1.add(menuitem2);
menu1.add(menuitem3);
menubar.add(menu1);
pane3.add(button22); //BUTTON13=radio button
pane3.add(button23); //BUTTON13=radio button
pane2.add(button1); //BUTTON13=1
pane2.add(button2); //BUTTON13=2
pane2.add(button3); //BUTTON13=3
pane2.add(button13); //BUTTON13=+
pane2.add(button12); //BUTTON13=->
pane2.add(button19); //BUTTON13=abs

pane2.add(button4); //BUTTON13=4
pane2.add(button5); //BUTTON13=5
pane2.add(button6); //BUTTON13=6
pane2.add(button14); //button14='-'
pane2.add(button20); //BUTTON13=log
pane2.add(button21); //BUTTON13=x^y

pane2.add(button7); //BUTTON13=7
pane2.add(button8); //BUTTON13=8
pane2.add(button9); //BUTTON13=9
pane2.add(button15); //BUTTON13='*' 
pane2.add(button24); //BUTTON13=clear
pane2.add(button25); //BUTTON13=1/x

pane2.add(button10); //BUTTON13=.
pane2.add(button11); //BUTTON13=0

pane2.add(button16); //button16='/' 
pane2.add(button17); //button17='=' 
pane2.add(button26); //BUTTON13=x!
pane2.add(button27); //BUTTON13=log10
pane2.add(button28); //BUTTON13=10^x
pane2.add(button18); //BUTTON13=%
pane2.add(button29); //BUTTON13=e^x
pane2.add(button30); //BUTTON13=sin
pane2.add(button31); //BUTTON13=cos
pane2.add(button32); //BUTTON13=tan
pane2.add(button34); //BUTTON13=sqrt
pane2.add(button33); //BUTTON13=inv 

JPanel pane1= new JPanel();
pane1.setVisible(true);
pane1.setLayout(new BorderLayout());
text.setEnabled(false);
text.setPreferredSize(new Dimension(50,50));
pane1.add(text,BorderLayout.NORTH);
//pane4.add(menubar,BorderLayout.NORTH);
pane2.add(pane3);
pane1.add(pane2);
frame.add(pane1);
button1.addActionListener(obj);
button2.addActionListener(obj);
button3.addActionListener(obj);
button4.addActionListener(obj);
button5.addActionListener(obj);
button6.addActionListener(obj);
button7.addActionListener(obj);
button8.addActionListener(obj);
button9.addActionListener(obj);
button10.addActionListener(obj);
button11.addActionListener(obj);
button12.addActionListener(obj);
button13.addActionListener(obj);
button14.addActionListener(obj);
button15.addActionListener(obj);
button16.addActionListener(obj);
button17.addActionListener(obj);
button18.addActionListener(obj);
button19.addActionListener(obj);
button20.addActionListener(obj);
button21.addActionListener(obj);
button22.addActionListener(obj);
button23.addActionListener(obj);
button24.addActionListener(obj);
button25.addActionListener(obj);
button26.addActionListener(obj);
button27.addActionListener(obj);
button28.addActionListener(obj);
button29.addActionListener(obj);
button30.addActionListener(obj);
button31.addActionListener(obj);
button32.addActionListener(obj);
button33.addActionListener(obj);
button34.addActionListener(obj);
menuitem1.addActionListener(new action());
menuitem2.addActionListener(new action());
menuitem3.addActionListener(new action());
frame.setJMenuBar(menubar);
}
}
