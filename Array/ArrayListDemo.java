package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args)
    {
        ArrayList <Integer> a1=new ArrayList<Integer>(10);
        
        // a1.add(10);
        // a1.add(60);
        // a1.add(78);
        // a1.add(567);
        // a1.add(23);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr how many numbers you want to add in ArrayList:");
        int n=sc.nextInt();
       
        System.out.println("Enter Element of ArrayList :");
        for(int i=0;i<n;i++)
        {
            a1.add(sc.nextInt());
        }
        System.out.println(a1);
        a1.remove(3);   //3rd index value will be removed
        a1.set(2,100);  // 2nd index value get updated to 100
        //get item at any index
        System.out.println("Value at index 3 is : "+a1.get(3));  // 3rd index value got printed
        // a1[index] this will not work here ... instead use get method.

       // getting all values using for loop
    //    for(int i=0;i<n;i++)
    //    {
    //     System.out.print(" "+a1.get(i));
    //    }
    sc.close();
    }
}
