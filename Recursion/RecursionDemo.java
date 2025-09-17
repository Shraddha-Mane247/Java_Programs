package Recursion;

public class RecursionDemo {
    static void printNUmbers(int n){
        if(n==0)    //base condition
         {
            return;
         }   
        System.out.println(n);
        printNUmbers(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNUmbers(n);
    }
}
