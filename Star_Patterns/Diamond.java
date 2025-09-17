public class Diamond {
    public static void main(String[] args) {
        int n=4;
        //upper side 
        for(int i=1;i<=n;i++)
        {
            for(int s=n-i;s>0;s--) // for spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*"); 
            }
           
            System.out.println();
        }
         //Lower side (same as it is only outer loop i condition will be changed)
        for(int i=n;i>=1;i--)
        {
            for(int s=n-i;s>0;s--) // for spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");  
            }
            System.out.println();
        }
    }
}
