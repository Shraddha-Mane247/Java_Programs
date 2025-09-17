//panlindrome
import java.util.*;
class PanlindromeString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer s1=new StringBuffer();
        System.out.println("Enter your String:");
        String s2=sc.nextLine();
        s1.append(s2);


        StringBuffer s3=new StringBuffer();
        s3=s1.reverse();
       
        if(s1.equals(s3))
        {
            System.out.println("String Palindrome !!");
        }
        else{
            System.out.println("String is NOt Palindrome !!");
        }
    }
}