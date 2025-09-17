//take 2D array and print it the spiral order
import java.util.*;
class SprialArray
{
    public static void main(String []args)
    {
        int [][]arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 9 Array Elements for the 2D array :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
     System.out.println("Your 2D Array is looking like below :\n============================================\n");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n============================================");
    System.out.println("Spiral printing of 2D array is  :\n============================================\n\n");
       
       for(int i=0;i<3;i++)
       {
            System.out.print(arr[0][i]+" ");
       }
       for(int i=1;i<=2;i++)
       {
            System.out.print(arr[i][2]+" ");
       }
        for(int i=1;i>=0;i--)
       {
            System.out.print(arr[2][i]+" ");
       }
        for(int i=0;i<=1;i++)
       {
            System.out.print(arr[1][i]+" ");
       }
       
    }
}