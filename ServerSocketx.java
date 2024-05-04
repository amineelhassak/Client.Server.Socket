package clientServerExams;
import java.io.*;
import java.net.*;

public class ServerSocketx
{
    private int                 port;
    private Socket              socket;
    private ServerSocket        serverSocket;
    private  DataOutputStream   out;
    private  DataInputStream    in;
    private int                 nbr;
    private Harmonique                  har;
    public ServerSocketx (int port)
    {
        this.port = port;
    }
    public void connect() throws IOException
    {
        serverSocket = new ServerSocket(this.port);
        socket = serverSocket.accept();
        System.out.println("server listing...");
    }
    public  void communicClient() throws IOException
    {
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        nbr = in.readInt();
        out.writeLong(har.somme(nbr));
    }
    public static void main()
    {
        try
        {
            ServerSocketx cl = new ServerSocketx(80800);
            cl.connect();
            cl.communicClient();
        }
        catch(IOException e)
        {
            System.err.println("Exception");
        }
    }
}
