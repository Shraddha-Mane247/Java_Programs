public class FunctionOverloading {
    static void sum()
    {
        int a=100;
        int b=200;
        System.out.println("SUm="+(a+b));
    }
    static void sum(int a,int b)
    {
        System.out.println("Sum="+(a+b));
    }
    public static void main(String[] args) {
        sum();
        sum(10,20);
    }
}
