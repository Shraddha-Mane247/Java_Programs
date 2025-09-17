package Array;
import java.util.*;
public class MaximumValueFromRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[7];
        System.out.println("Enter 7 array Element:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter start index and end index for MaxValue searching:");
        int s1=sc.nextInt();
        int e1=sc.nextInt();
        
        int maxval=CheckMaxValFromRange(arr,s1,e1);
        System.out.println("Maximum value from range = "+maxval);
    }
    static int CheckMaxValFromRange(int[] arr,int s1,int e1)
    {
        int maxval=arr[s1];
        for(int i=s1;i<=e1;i++)
        {
            if(arr[i]>maxval)
            {
                maxval=arr[i];
            }
        }
        return maxval;

    }
}
