package Recursion;

public class FibonacciSeries {
    static void PrintFib(int Fno,int Sno,int n)
    {
         if(n==0){
            return;
        }
        int Tno=Fno+Sno;
        System.out.print(Tno+" ");
        PrintFib(Sno, Tno, n-1);   
    }
    public static void main(String[] args){
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
        int n=7;
        PrintFib(a,b,n-2);  //n-2 because a and b have already printed so we cant consider that
    }
}
