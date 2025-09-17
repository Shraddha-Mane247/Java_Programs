import java.util.Arrays;

public class Variable_Length_arguments {
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
        func(1,2,3,4,5);
    }
}
