package Array;

public class CheckArraySorted {
    static boolean checkSortedArr_brute(int[] arr){ //brute force
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i]){
                return false;
                }
            }
            
        }
        return true;
    }

    static boolean checkSortedArr_Optimal(int[] arr) //optimal
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
             }
        }
        return true;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(checkSortedArr_brute(arr));
        System.out.println(checkSortedArr_Optimal(arr));
    }
}
