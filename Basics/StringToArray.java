//panlindrome
import java.util.*;
class StringToArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    String s1="70 60 30 10 50";
    String []arr=s1.split(" ");
    System.out.println(Arrays.toString(arr));
       /* for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        } */
        Arrays.sort(arr);
        System.out.println("Your Sorted Array :");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print("  "+arr[i]);        
        }
        
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           sum=sum+Integer.parseInt(arr[i]);        
        }
        System.out.println("Sum of Array :"+sum);
        float avg=sum/arr.length;
        System.out.println("Average ="+avg);



    }
}