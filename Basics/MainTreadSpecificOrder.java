//creating 2 treads multithreading printing even numbers and odd numbers .
import java.util.*;

class OneThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                    System.out.println("Step 1 completed !!");
                    Thread.sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
class TwoThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            { 
                    System.out.println("Step 2 Completed !!");
                     Thread.sleep(600);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
class ThreeThread extends Thread
{
    public void run()
    {
        try
        {  
            for(int i=1;i<=10;i++)
            { 
                    System.out.println("Step 3 Completed !!");
                     Thread.sleep(700);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
public class  MainTreadSpecificOrder
{
   public static void main(String args[])throws Exception

    {
        OneThread a1=new OneThread();
        TwoThread a2=new TwoThread();
        ThreeThread a3=new ThreeThread();
        a1.start();
        a1.join();
        a2.start();
       a2.join();
        a3.start();
       a3.join();
    }
}