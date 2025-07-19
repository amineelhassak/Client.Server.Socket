package clientServerExams;
import java.io.*;
import java.net.*;

public class ServerSocket
{
    private int                 port;
    private Socket              socket;
    private java.net.ServerSocket        serverSocket;
    private  DataOutputStream   out;
    private  DataInputStream    in;
    private int                 nbr;
    public ServerSocket (int port)
    {
        this.port = port;
    }
    public void connect() throws IOException
    {
        serverSocket = new java.net.ServerSocket(this.port);
        System.out.println("Server listening on port " + this.port);
        socket = serverSocket.accept();
        System.out.println("Client connected.");
    }
    public  void communicClient() throws IOException
    {
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        nbr = in.readInt();
        Harmonique har = new Harmonique(nbr);
        double n = har.somme(nbr);
        out.writeDouble(n);
    }
    public static void main(String[] args)
    {
        try
        {
            ServerSocket server = new ServerSocket(8080);
            server.connect();
            server.communicClient();
        }
        catch(IOException e)
        {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
