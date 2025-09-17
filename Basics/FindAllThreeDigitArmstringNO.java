public class FindAllThreeDigitArmstringNO {

    static boolean checkArmstrong(int no)
    {
        int original=no;
        int sum=0;
        while(no>0)
        {
            int rem=no%10;
            int cube=rem*rem*rem;
            sum=sum+cube;
            no=no/10;
        }
     return sum==original; // if both equal then return true otherwise false
    }
    public static void main(String[] args) 
    {
        System.out.print("Armstrong Numbers are= ");
        for(int i=100;i<=999;i++)
        { 
            if(checkArmstrong(i)){
                System.out.print(" "+i);
            }
        }
    }
}
