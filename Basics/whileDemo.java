import java.util.*;
public class whileDemo {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        while(true){
            n=sc.nextInt();
            if(n==0){
                break;
            }
         System.out.println("You have entere "+n);

        }
    }
}
