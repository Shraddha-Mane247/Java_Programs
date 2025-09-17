
public class Butterfly {
    public static void main(String[] args)
    {
        int n=5;
        //upper part
        for(int i=1;i<=n;i++)
        {
            //left side stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int s=1;s<=(2*(n-i));s++)
            {
                System.out.print(" ");
            }
            // right side stars .. (as it is left side)
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            // Lower part .( only the outer loop i condition will be changed .)

        for(int i=n; i>=1; i--)
        {
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }
            for(int s=1;s<=(2*(n-i));s++){
                 System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                  System.out.print("*");
            }
            System.out.println();

        }
       
    }
}

/*
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
 */