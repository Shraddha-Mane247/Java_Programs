//display prime numbers count form the Array.
import java.util.*;
class StringBuffer_Builder
{ 
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer s1=new StringBuffer();
        System.out.println("Enter your String:");
        String s2=sc.nextLine();
        s1.append(s2);
        s1.append("World");

        System.out.println("Your Entered String :"+s1);
        s1.insert(0,"Java");
        System.out.println("Inserted Java At 0th index :"+s1);
        
        System.out.println("Reversed String :"+s1.reverse());
        System.out.println("Replace MEthod :"+s1.replace(0,0,"P"));


        StringBuilder sx=new StringBuilder();
        System.out.println("Enter your String:");
        String s3=sc.nextLine();
        sx.append(s3);
        sx.append("World");

        System.out.println("Your Entered String :"+sx);
        sx.insert(0,"Java");
        System.out.println("Inserted Java At 0th index :"+sx);
        
        System.out.println("Reversed String :"+sx.reverse());
        System.out.println("Replace MEthod :"+sx.replace(0,0,"Z"));
    }
}