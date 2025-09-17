class ProductArrayElement
{
    public static void main (String []args)
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int result[]=new int[n];
       
        for(int i=0;i<n;i++)
        {
            int prod=1;
            for(int j=0;j<n;j++)
            {
               if(i!=j)
               {
                prod=prod*arr[j];
               } 
            }
            result[i]=prod;
        }
        System.out.println("The Final resultant Array of Product : ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+"  ");
        }
    }
}