package Recursion;

public class Calculate_PowerLogn {
    static int CalcPower(int x,int n){
        if(n==0){   //base case 1
            return 1;
        }
        if(x==0){  //base case 2
            return 0;
        }  
        //if n is even 
        if(n%2==0){
            return CalcPower(x, n/2) * CalcPower(x, n/2);
        }
        else{
            return CalcPower(x, n/2) * CalcPower(x, n/2) * x;

        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int result=CalcPower(x,n);
        System.out.println(result);
    }
}
