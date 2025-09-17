package Recursion;

public class SumofNNaturalNUmbers 
{
    static void CalcSum(int i,int n,int sum){
        if(i>n){
            System.out.println("Sum is ="+sum);
            return;
        }
        sum=sum+i;
        CalcSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int i=1,n=5,sum=0;
        CalcSum(i, n, sum);
    }
}
