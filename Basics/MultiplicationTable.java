import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        int n;
        System.out.println("Enter number to generate a table:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
