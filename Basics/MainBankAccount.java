import java.util.*;
class Bank_Account extends Thread
{
    private int Amount=5000;
    synchronized public void withdraw(int withdraw)
        {
            if(Amount>=withdraw)
            {
                Amount=Amount-withdraw;
                System.out.println("Thread 1 Account Balance="+Amount);
                System.out.println("Thread 1 Your Withdraw Cash ="+withdraw);
            }
            else
            {
                System.out.println("Insufficient Amount !!!");
            }
        }    
}
/* 
class Bank_Account1 extends Thread
{
    
     public void withdraw1(int withdraw)
        {
            if(Amount>=withdraw)
            {
                Amount=Amount-withdraw;
                System.out.println("Thread 2 Account Balance="+Amount);
                System.out.println("Thread 2 Your Withdraw Cash ="+withdraw);
            }
            else
            {
                System.out.println("Insufficient Amount !!!");
            }
        }    

} */
class MainBankAccount
{
    public static void main(String args[])
    {   
        Bank_Account b1=new Bank_Account();
       // Bank_Account1 b2=new Bank_Account1();
        b1.withdraw(500);
        //b2.withdraw1();
    }
   
}

