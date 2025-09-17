//creating 2 treads multithreading printing even numbers and odd numbers .
import java.util.*;

class Even extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=100;i++)
            {
                if(i%2==0)
                {
                    System.out.println("Even number ="+i);
                    Thread.sleep(500);
                }   
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
class Odd extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=100;i++)
            {
                if(i%2!=0)
                {
                    System.out.println("Odd NUmber ="+i);
                     Thread.sleep(600);
                }
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
public class  MainTreadEvenOdd
{
   public static void main(String args[])
    {
        Even e1=new Even();
        Odd x1=new Odd();
        e1.start();
        x1.start();
    }
}