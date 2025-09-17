package Array;
import java.util.*;
public class ReverseArrayUsingFunc_Swap {

    //this is also called as 2 pointer method for reversing the array using swaping the start and end values
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        ReverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ReverseArray(int[] arr)
    {
       int start=0;
       int end=arr.length-1;
       
       while(start<end)
       {
        //swap
        swap(arr,start,end);
        start++;
        end--;
       }
       
    }
    static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
