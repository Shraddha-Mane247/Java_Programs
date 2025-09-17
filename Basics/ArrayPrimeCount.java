//display prime numbers count form the Array.
import java.util.*;
class ArrayPrimeCount
{
    public static void main(String []args)
    {
        int cnt=0;
        int d=2;
        boolean flag=true;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements of the Array :");
         int n=sc.nextInt();
         int []arr=new int[n];
        System.out.println("Enter elements of the Array :");

        for(int i=0;i<=arr.length;i++)
        {
            arr[i]=sc.nextInt();       
        }

       int i = 0;
        while(d<=arr[i]/2)
        {
            if(arr[i]/d==0)
            {
                flag=false;
                break;
            }
            d++;
            
        } 
        if(flag)
            {
                cnt++;
            }
        System.out.println("The number of prime no's is :"+cnt);
    }
}