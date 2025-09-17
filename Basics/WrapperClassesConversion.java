import java.util.*;

class WrapperClassesConversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        String a=sc.next();

        int b=Integer.parseInt(a);
        System.out.println("The converted string to integer NUmber is :"+b);

        double c= Double.parseDouble(a);
        System.out.println("THe converted string to Double NUmber is :"+c);

        Float d=Float.parseFloat(a);
        System.out.println("THe converted string to Float NUmber is :"+c);
    }
}