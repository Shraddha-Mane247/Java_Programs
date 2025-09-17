import java.util.*;
public class Function_Retun_ex
{
    public static String Greeting(String name)
    {
        String msg="Hello ! "+name;
        return msg;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String nm=sc.nextLine();
        String message= Greeting(nm);
        System.out.println(message);
        sc.close();
    }
}