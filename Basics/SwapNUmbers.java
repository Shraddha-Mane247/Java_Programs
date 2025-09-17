public class SwapNUmbers {
    static void Swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"  b="+b);
    }public static void main(String[] args) {
        
        int no1=10;
        int no2=20;
        Swap(no1,no2);
    }
}
