package Array;
import java.util.*;
public class SwapArrayElement {
    
    public static void main(String[] args)
    {
        int [] arr={1,56,78,4,9};
     System.out.println("Array Befor Swapping :\n"+Arrays.toString(arr));      
    
     swap(arr,1,4);
     System.out.println("Array After swapping index 1 and 4 :\n"+Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1 ,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
