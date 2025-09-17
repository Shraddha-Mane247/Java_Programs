package Array;

public class ArrayCoulumnNoFixedSized {
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        System.out.println("Array elements are:\n");
            for(int i=0;i<arr.length;i++)   //arr.length gives no .of rows 
            {
                for(int j=0;j<arr[i].length;j++) // arr[i].length gives columns from that perticular row
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            } 
    }
}
