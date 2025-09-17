import java.util.Scanner;
public class multiplication_Funciton 
{
    public static int Multiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1st number :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int b=sc.nextInt();

        System.out.println("Multiplication two numbers ="+Multiply(a, b));
    }
}
