//display prime numbers count form the Array.
import java.util.*;
class Sorting_Searching_Using_ArraysClass
{
   
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter number of elements of the Array :");
        // int n=sc.nextInt();
         int []arr=new int[5];
        System.out.println("Enter 5 elements of the Array :");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();       
        }
       System.out.println("Sorted Array USing Arrays MEthod =");
      Arrays.sort(arr);
      for(int i=0;i<arr.length;i++)
      {
         System.out.print("  "+arr[i]);        
      }
      System.out.println("Enter Search element for performing Binary Searcing: ");
      int n=sc.nextInt();
        System.out.println("\n\nThe Element  of Array present at Index ="+Arrays.binarySearch(arr,n));
       
    }
}