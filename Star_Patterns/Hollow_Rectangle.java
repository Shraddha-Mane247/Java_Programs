
public class Hollow_Rectangle {
    public static void main(String[] args) {
        int n=5;
       
        for(int i=1;i<=n;i++) //for rows
        {
            for(int j=1;j<=n;j++)  // for colums 
            {
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/* pattern 

 * * * * *
 *       *
 *       *
 *       *
 * * * * *
 
 */