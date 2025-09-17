package Array;
import java.util.*;
public class SecondLargestElement_Brute {

static void SecondLargestEle_Brute(int[] arr,int n) // using Brutforce ..sorting
{
    if(n==0 || n==1){
       System.out.println("-1");
    }
    Arrays.sort(arr);       //O(n log n)
    int SecLarge=arr[arr.length-2]; //secondlast index 
    int SecSmall=arr[1];  
    System.out.println("Second Largest ELement = "+SecLarge);
    System.out.println("Second Smallest ELement = "+SecSmall);

}
 public static void main(String[] args) {
    int[] arr={4,6,30,7,12,56};
    int n=arr.length;

    SecondLargestEle_Brute(arr,n);
 }   
}
