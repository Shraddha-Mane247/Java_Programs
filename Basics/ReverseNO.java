//W.A.P to reverse a given five digit no.
import java.util.*;
class ReverseNO
{
    public static void main (String args[])
    {
        int no;
        int digit;
        int rev=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a five digit number :");
        no=sc.nextInt();
        while(no!=0)
        {
             digit=no%10;
             rev=rev*10+digit;
             no=no/10;
        }

        System.out.println("Enter Reversed Number :"+rev);

    }
}