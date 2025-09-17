//creating 2 treads multithreading 
import java.util.*;

class PQR extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Hello");
                Thread.sleep(700);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
class XYZ extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("World");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
public class  Main2Tread
{
   public static void main(String args[])
    {
        PQR a1=new PQR();
        XYZ x1=new XYZ();
        a1.start();
        x1.start();
    }
}