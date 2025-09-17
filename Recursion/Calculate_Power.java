package Recursion;

public class Calculate_Power {
    static int CalcPower(int x,int n){
        if(n==0){       //base case1
            return 1;
        }
        if(x==0){       //base case 2
            return 0;
        }

        return x*CalcPower(x,n-1);  //work
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int result=CalcPower(x, n);
        System.out.println(result);
    }
}
