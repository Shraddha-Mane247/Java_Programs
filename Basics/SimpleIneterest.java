import java.util.*;
class SimpleIneterest
{
    public static void main(String args[])
    {
        float pri;
        int rate;
        float time ;
         
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Amount :");
          pri=sc.nextFloat();
         System.out.println("Enter Rate :");
          rate=sc.nextInt();
         System.out.println("Enter Time (in year) :");
          time=sc.nextFloat();

         float SI=(pri*rate*time)/100;
         System.out.println("Simple Interest = "+SI);

    }
}