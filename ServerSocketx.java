package clientServerExams;
import java.io.*;
import java.net.*;

class Harmonique implements  Runnable
{
    private int nbr;
    private Double val_ret;
    public Harmonique(int nbr)
    {
        this.nbr = nbr;
    }
    public double somme (int N )
    {
        double somme =0;
        for (int i = 1 ; i <= N ; i ++)
        {
            somme += 1.0 / i;
        }
        return somme ;
    }
    @Override
    public void run()
    {
        val_ret = somme(nbr);
        System.out.println("somme is " + val_ret);
    }
    public static void main (String [] args ) {
        Harmonique har ;
        int a = 3;
        int b = 10;
        har = new Harmonique(a);
        har = new Harmonique(b);
    }
}

public class ServerSocketx
{
    private int                 port;
    private Socket              socket;
    private ServerSocket        serverSocket;
    private  DataOutputStream   out;
    private  DataInputStream    in;
    private int                 nbr;
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
        Harmonique har = new Harmonique(nbr);
        Double n = har.somme(nbr);
        out.writeDouble(n);
    }
    public static void main()
    {
        try
        {
            ServerSocketx cl = new ServerSocketx(80808);
            cl.connect();
            cl.communicClient();
        }
        catch(IOException e)
        {
            System.err.println("Exception");
        }
    }
}
