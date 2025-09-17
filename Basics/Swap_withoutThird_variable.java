public class Swap_withoutThird_variable {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("BEFORE      x="+x+" y="+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("AFTER       x="+x+" y="+y);

    }
}
