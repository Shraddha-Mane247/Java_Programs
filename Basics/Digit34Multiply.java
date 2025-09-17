//W.A.P to reverse a given five digit no.
//need to change the code .
import java.util.*;
class Digit34Multiply
{
    public static void main (String args[])
    {
        int no;
        int prod=1;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a 34 digit number :");
        no=sc.nextInt();
        while(no!=0)
        {
             prod=prod*no%10;
             no=no/10;
        }
        System.out.println("The Multiplication od 34 digit  Number :"+prod);
    }
}