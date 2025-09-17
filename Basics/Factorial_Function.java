import java.util.Scanner;
public class Factorial_Function {

    public static int Factorial(int no)
    {
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any NUmber :");
        int n=sc.nextInt();

        int fact=Factorial(n);
        System.out.println("Factorial = "+fact);
    }
}
