//User Defined Exception
import java.util.*;
class InvalidPassengerException extends Exception
{
    public void display()
        {
            System.out.println("Invalid Passenger Exception Occured..!");
        }    
}
class SeatNotAvailableException extends Exception
{
    public void display()
        {
            System.out.println("Seat Not Available Exception Occured ..!");
        } 
}
class InvalidDestinationException extends Exception
{
    public void display()
        {
            System.out.println("Invalid Destination Exception Occured..!");
        }  
}
class FlightBookingSystem
{
    public static void main(String[] args) 
    {
        String Dest1[]={"Delhi","Mumbai","Chennai","Dubai","Itali"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Distination :");
        String Dest=sc.next();
        System.out.println("Enter the Number passenger :");
       int Pno =sc.nextInt();
        System.out.println("Enter the Seat Number :");
        int SeatNO =sc.nextInt();
        System.out.println("Enter the Seat Class :");
        String SeatClass =sc.next();

        
        InvalidPassengerException i1=new InvalidPassengerException();
        SeatNotAvailableException i2=new SeatNotAvailableException();
        InvalidDestinationException i3=new InvalidDestinationException();
        try{
            if(Pno<=0)
            {
                throw new InvalidPassengerException();
            }
            if(SeatNO>=20)
            {
                throw new SeatNotAvailableException();
            }
            int flag=0;
            for(int i=0;i<5;i++)
            {
                if(Dest == Dest1[i])
                {
                    flag=1;
                }
                else{
                    throw new InvalidDestinationException();
                }
            }
           
        }
        catch(InvalidPassengerException e)
        {
            e.display();
            System.out.println(e);
        }
        catch(SeatNotAvailableException e)
        {
            e.display();
            System.out.println(e);
        }
        catch(InvalidDestinationException e1)
        {
            e1.display();
            System.out.println(e1);
        }
       
    }
}