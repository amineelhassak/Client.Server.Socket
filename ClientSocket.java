package clientServerExams;
import java.net.*;
import java.io.*;
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

public class ClientSocket
{
    private Socket              socket;
    private int                 port;
    private String              adress;
    private DataOutputStream    out;
    private DataInputStream     in;
    private int                 nbrInp;
    public ClientSocket(int port, String adress,int nbrInp)
    {
        this.port = port;
        this.adress = adress;
        this.nbrInp = nbrInp;
    }
    public void connect() throws IOException
    {
        socket = new Socket(this.adress,this.port);
        System.out.println("Connecting succe");
    }
    public void  communicationServer()  throws IOException
    {
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        out.writeInt(this.nbrInp);
        System.out.println("resulat " + in.readLong());
    };
    public static void  main(String[] args)
    {
        try
        {
            ClientSocket cl = new ClientSocket(80808,"127.0.0.1",5);
            cl.connect();
            cl.communicationServer();
        }catch(IOException e)
        {
            System.err.println("Exception");
        }
    }
}
