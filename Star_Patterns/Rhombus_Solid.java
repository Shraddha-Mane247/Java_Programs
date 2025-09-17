public class Rhombus_Solid {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {   //print spcase
            for(int s=n-i;s>0;s--)
            {
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
    *****
   *****
  *****
 *****
*****
 */
