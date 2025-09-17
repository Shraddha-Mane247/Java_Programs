import java.util.Scanner;
public class Print_N_primeNUmbers 
{
    static boolean CheckPrime(int no)
    {
        boolean flag=true;    //prime
        for(int i=2;i<no;i++)      
        {
            if(no%i==0)      //number is divisible i.e not prime
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find prime numbersupto :");
        int n=sc.nextInt();
        System.out.println("Prime numbers are :");
        for(int i=2;i<=n;i++)  // prime numbers are starting from 2 (i.e 1 is not considered as prime number)
        {
            if(CheckPrime(i))    // check if true i.e prime or not
            {
            System.out.print(i+" ");
            }
        }
    }
}
