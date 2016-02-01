
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class NewJFrame extends JFrame 
{
JTextField txt;
    public NewJFrame() 
    {
    	txt= new JTextField();
        message = new JTextField();
        echo = new JTextField();
        Message = new JLabel();
        EchoMessage = new JLabel();
        submit = new JButton();
        Message.setText("Message");

        EchoMessage.setText("Echo Message");

        submit.setText("SEND");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
 		JPanel Panel=new JPanel(new GridLayout(2,2,30,30));
        	Panel.add(Message);
        	Panel.add(message);
        	Panel.add(EchoMessage);
        	Panel.add(echo);
        	add(Panel,BorderLayout.CENTER);
        	JPanel bPanel = new JPanel();
        	bPanel.add(submit);
 		add(bPanel,BorderLayout.SOUTH);
        
	setSize(400,200);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
    }                       

                       

    private void submitActionPerformed(ActionEvent evt) {                                       
      
 try {
           Socket client = new Socket(txt.getText(),6523);
            //Socket channel = server.accept();
            DataInputStream is = new DataInputStream(client.getInputStream());
DataOutputStream os = new DataOutputStream(client.getOutputStream());
os.writeUTF(message.getText());
String line = is.readUTF();
echo.setText(line);

client.close();




        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }                                                         
    private javax.swing.JLabel EchoMessage;
    private javax.swing.JLabel Message;
    private javax.swing.JTextField echo;
    private javax.swing.JTextField message;
    private javax.swing.JButton submit;
}



	public class Client 
	{
    public static void main(String arg[])
    {
	NewJFrame f=new NewJFrame();
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
}
