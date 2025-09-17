//display prime numbers count form the Array.
import java.util.*;
class StringClassMethods
{ 
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String :");
         String str=sc.nextLine();
         System.out.println("Your String is :"+str);
         
         System.out.println("String UpperCase is :"+str.toUpperCase());
         System.out.println("String UpperCase is :"+str.toLowerCase());    
         System.out.println("Replaced Spaces with - :"+str.replace(" ","-"));
        System.out.println("Replaced Spaces with - :"+str.substring(2,5));
        System.out.println("Strat with :"+str.startsWith("a"));
        System.out.println("Strat with :"+str.endsWith("y")); 
    }
}