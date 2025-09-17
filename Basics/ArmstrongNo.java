import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number :");
        int no=sc.nextInt();   //153
        int original=no;
        int sum=0;
        while(no>0)
        {
             int rem=no%10;   //3
             int cube=rem*rem*rem;
             sum=sum+cube;
             no=no/10;  //15
        }
        if(sum==original)
             System.out.println("Armstrong NUmber");
        else
             System.out.println("NOt Armstrong NUmber");
  
    sc.close();
    }
}
