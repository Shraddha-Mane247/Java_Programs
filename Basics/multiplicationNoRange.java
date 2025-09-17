import java.util.*;
public class multiplicationNoRange {
    public static void main(String[] args) {
        int start,end;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting and ending range for generating tables .");
        start=sc.nextInt();
        end=sc.nextInt();

        for(int i=start;i<=end;i++){
            System.out.println("Multiplication table of "+i);
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
}
