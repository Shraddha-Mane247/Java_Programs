package Array;
import java.util.*;
import java.util.ArrayList;

public class MutiDimensionalArrayList {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList <ArrayList<Integer>> a1=new ArrayList<>();  //muti dimentional array list
        
        for(int i=0;i<3;i++)
        {
            a1.add(new ArrayList(i));  // 3 arraylist area created
        }
        System.out.println("Enter Elements of Array list :");
        //assining values
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            a1.get(i).add(sc.nextInt());//  getting Arraylist index and  adding values in it.
            }
        }

        System.out.println(a1);
        sc.close();
    }
}
