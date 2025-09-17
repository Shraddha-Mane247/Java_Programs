//multithreading 
import java.util.*;

import java.lang.*;
class ABC extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
public class MainThread 
{
    public static void main(String args[])
    {
        ABC t1=new ABC();
        t1.start();
    }
}