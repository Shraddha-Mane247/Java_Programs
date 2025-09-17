import java.util.Arrays;

public class Variable_Length_arguments1 {
    static void mutipleArgument(int a, int b,String ...v)
    {
        System.out.println(" "+a+" "+b+" "+Arrays.toString(v));
    }
    public static void main(String[] args) {
        
        mutipleArgument(10,20,"Shraddha","Karuna","Monika");
    }
}
