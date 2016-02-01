
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


class EchoServerThreads extends Thread
{

Socket channel;

public EchoServerThreads(Socket c)
{
channel=c;
}

public void run()
{ 
try
{
String line; 
DataInputStream is = new DataInputStream(channel.getInputStream());
DataOutputStream os = new DataOutputStream(channel.getOutputStream());
while(true)
{
line= is.readUTF();
System.out.println(line);
os.writeUTF(line+"\n");
}
}
catch(Throwable t)
{
}
}
}

public class Server 

{

public static void createNewThread(Socket channel)
{
Thread t=new EchoServerThreads(channel);
t.start();
}

    public static void main(String arg[])
    {
	Socket channel;
        
		try 
		{
            ServerSocket server = new ServerSocket(6523);
				while(true)
				{
					channel = server.accept();
					createNewThread(channel);

				}
        } 
		
		catch (IOException ex) 
		{
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
