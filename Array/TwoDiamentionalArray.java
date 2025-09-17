package Array;
import java.util.*;
public class TwoDiamentionalArray {
    public static void main(String[] args) {
     //    int [][]arr=new int[3][3];      //row number is mandatory only .. coulmns are not.
    // columns may vary 
    /*
    int [3][]arr={
     {1 2 3}
     {3 4}
     {6 7 8 9}
    };
    
     */
    //OR
    // int [][]arr2={
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}};
    Scanner sc=new Scanner(System.in);
    int [][]arr=new int[3][3];
    //taking array input
    System.out.println("Enter 2D array element :");
    for(int i=0;i<arr.length;i++)  //arr.length gives no .of rows 
    {
        for(int j=0;j<arr[i].length;j++)   // arr[i].length gives columns from that perticular row
        {
            arr[i][j]=sc.nextInt();
        }
    }
//printing
System.out.println("Array elements are:\n");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            } 

    // or
            // for(int i=0;i<arr.length;i++)
            // {
            //     System.out.println(Arrays.toString(arr[i]));
            // }

    //or using ehanced for loop (For each loop)
            // for(int[] i:arr)
            // {
            //     System.out.println(Arrays.toString(i));
            // }
            sc.close();
    }
  
}
