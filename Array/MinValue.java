package Array;
import java.util.*;
public class MinValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        
        System.out.println("Enter 5 Array Elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Minimum element of array is : "+CheckMinItem(arr));
        sc.close();
    }
        static int CheckMinItem(int[] arr)
        {
            int minval=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<minval)
                {
                    minval=arr[i];
                }
            }
            return minval;
        }
}
