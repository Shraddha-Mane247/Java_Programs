public class ZeroOne_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0){  //check the sum of i and j is even or odd . if even then print 1 else print 0
                    System.out.print("1 ");  //even
                }
                else{
                    System.out.print("0 ");  //odd
                }
            }
            System.out.println();
        }
    }
}

/*
1 
0 1 
1 0 1
0 1 0 1
1 0 1 0 1
 */