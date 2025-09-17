package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String [] args)
    {
        int [] arr=new int[5];
        arr[0]=1; 
        arr[1]=23;
        arr[2]=45;
        arr[3]=56;
        arr[4]=3;  

        System.out.println("using simple for loop\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nusing for each loop :\n");
        for(int i:arr)      //for each loop . for every element in array printing i
        {
            System.out.print(i+" ");
        }

        System.out.println("\n\nArray printing using Arrays.toString method\n");
        System.out.println(Arrays.toString(arr)+"");
    }
}
