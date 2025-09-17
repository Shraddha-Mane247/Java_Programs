//exception Handeling
import java.util.*;
class ExceptionHadling
{
   public void Division ()
   {
    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b=sc.nextInt();
        int c=a/b;
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    catch(NumberFormatException e1)
    {
        System.out.println(e1);
    }
    catch(NullPointerException e2)
    {
        System.out.println(e2);
    }
   }   
}
class MultipleCatchExceptionHadling
{
    public static void main(String args[])
    {
        ExceptionHadling e1=new ExceptionHadling();
        e1.Division();
    }
}