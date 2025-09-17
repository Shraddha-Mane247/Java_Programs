//User Defined Exception
import java.util.*;
class InvalidMarksEception extends Exception
{
    public void display()
        {
            System.out.println("Marks Cannot be Negative ,Invalid Marks Exception ..!");
        }
      
}
class StudentGradeUserDefinedException 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Marks :");
        
        int marks=sc.nextInt();
        InvalidMarksEception i1=new InvalidMarksEception();
        try{
            if(marks<0)
            {
                throw new InvalidMarksEception();
            }
        }
        catch(InvalidMarksEception e)
        {
            e.display();
            System.out.println(e);
        }
          
    }
}