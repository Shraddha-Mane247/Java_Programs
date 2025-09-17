package Array;
import java.util.*;
public class MaxItem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        
        System.out.println("Enter 5 Array Elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Maximum element of array is : "+CheckMaxItem(arr));
        sc.close();
    }
        static int CheckMaxItem(int[] arr)
        {
            int maxval=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>maxval)
                {
                    maxval=arr[i];
                }
            }
            return maxval;
        }
}
