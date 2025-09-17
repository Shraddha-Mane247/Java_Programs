
import java.util.*;
class Triangle_Area
{
    public static void main (String args[])
    {
        float base,height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of the triangle :");
        base=sc.nextFloat();
        System.out.println("Enter hieght of the triangle :");
        height=sc.nextFloat();
        double area=(0.5)*(base*height);
        System.out.println("Area of Triangle = :"+area);


    }
}