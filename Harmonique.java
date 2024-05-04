package clientServerExams;
import java.io.*;
import java.net.*;

public class Harmonique implements  Runnable
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
