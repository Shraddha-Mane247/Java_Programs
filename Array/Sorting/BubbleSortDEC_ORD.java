package Array.Sorting;
import java.util.*;
public class BubbleSortDEC_ORD {
    public static void main(String[] args)
    {
        int []arr={32,2,3,6,9};
        System.out.println("Initial array : "+Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Decending order sorted array: "+Arrays.toString(arr));
    }
}
