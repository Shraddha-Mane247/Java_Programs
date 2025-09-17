package Array.Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args)
    {
        int []arr={7,8,3,1,2};
        System.out.println("Initial Array : "+Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++) //n-1 passes
        {
            int smallest=i; //initially 1st index considered as smallest.
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];  //swapping. placing the smallest element at start
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        System.out.println("Sorted Array : "+Arrays.toString(arr));

    }
}
