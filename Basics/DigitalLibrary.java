import java.util.*;
interface BookOperations
{
    public void addBook();    
    public void issueBook();
    public void returnBook();
}
class Library
{
    Scanner sc=new Scanner(System.in);
     
    String Lname="A1Library";
    
     final void libraryRules()
    {
        System.out.println("\n============== LIBRARY RULES ================\n");

         double Otime=10.00;
         double Ctime=5.00;
         System.out.println("Library Opening Time = "+Otime+"AM");
         System.out.println("Library Close Time = "+Ctime+"PM");
         System.out.println("All Students Must do Entry  before Going into the library and Must do Exit by Entering their Borrow ID...! ");
         System.out.println("Students should Wear the ID cards.");
         System.out.println("Keep Silence...!");
         System.out.println("Students can keep the book upto 8 days.");

         System.out.println("\n==============================\n");
    }
  
}
public class DigitalLibrary extends Library implements BookOperations
{
    
    String Lname;
    Scanner sc=new Scanner(System.in);
    @Override
    public void addBook(){
        System.out.println("\n\n========= ADD BOOK ==============\n");
        System.out.println("Enter Book ID :");
        int bookId=sc.nextInt();
        System.out.println("Enter Book Name :");
       String BookName=sc.nextLine();
       BookName=sc.nextLine();
        System.out.println("Enter Book Author ID :");
        int AuthId=sc.nextInt();
        System.out.println("Enter Book Author Name :");
        String AuthName=sc.nextLine();
        AuthName=sc.nextLine();

        System.out.println("\n\n======================================");
        System.out.println("Book ID :"+bookId);
        System.out.println("Book Name :"+BookName);
        System.out.println("Book Author ID :"+AuthId);
        System.out.println("Book Author Name :"+AuthName);
        System.out.println("\n\nBook Added Successfully..!!\n\n");
    }

    @Override
    public void issueBook() {
       
        System.out.println("\n\n========= ISSUE BOOK ==============\n");
        System.out.println("Enter Student ID :");
        int sid=sc.nextInt();
        System.out.println("Enter Book Name :");
        String BookName=sc.nextLine();
        BookName=sc.nextLine();
      
        System.out.println("Enter Book ID :");
        int bookId=sc.nextInt();
       
        System.out.println("Enter Book issueDate :");
        String Bdate=sc.nextLine();
        Bdate=sc.nextLine();

        System.out.println("\n\nBook issued Successfully..!!\n\n");
    }

    @Override
    public void returnBook() {
      
        System.out.println("\n\n========= RETURN BOOK ==============\n");
        System.out.println("Enter Student Borrow ID :");
        int BorrowId=sc.nextInt();
        System.out.println("Enter Borrow Date :");
        String BDate=sc.nextLine();
        BDate=sc.nextLine();
        System.out.println("Enter Book Name :");
        String BookName=sc.nextLine();
        BookName=sc.nextLine();
        
        System.out.println("Enter Author Name :");
        String BAuthor=sc.nextLine();
        BAuthor=sc.nextLine();
        System.out.println("\n\nBook issued Successfully..!!\n\n");
    } 

    public static void main(String args[])
    {
        DigitalLibrary d1=new DigitalLibrary();
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("========= Library Management System -(BY SHRADDHA)=============\n");
            System.out.println("1.Library Rules");
            System.out.println("2.Add Book ");
            System.out.println("3.Issue Book");
            System.out.println("4.Return Book");
            System.out.println("5.Exit");
            System.out.println("\n Enter the number which you want to perform the operation(between 1-5):");
            ch=sc.nextInt();


            switch(ch)
            {
                case 1:d1.libraryRules();
                break;
                case 2:d1.addBook();
                break;
                case 3:d1.issueBook();
                break;
                case 4:d1.returnBook();
                break;
                case 5: System.out.println("Thank you ...!");
                break;
                default:
                System.out.println("Please Enter Valid Operation Number...!");

            }
        }while(ch!=5);
              
    } 
}
