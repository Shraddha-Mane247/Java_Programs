package Array;
import java.util.*;
public class LargestElement 
{
    static int LargestEle_Brute(int[] arr){  // brute force method ..using sorting
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    static int LargestEle_Optimal(int[] arr){// optimal solution.. using max variable 
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
       // #brute force method i.e using sort
        int[] arr={3,12,4,5,6};
        
        System.out.println("Largest Element using Brute force method = "+LargestEle_Brute(arr));
        System.out.println("Largest Element using Optimal method="+LargestEle_Optimal(arr));
    }
}
