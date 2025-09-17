package Array;

public class MajorityElement_BruteForceM 
{
  public static int majorityElement(int[] nums) 
  {
    int n=nums.length;
    for(int ele:nums)
    {
        int freq=0;
        for(int val:nums)
        {
            if(ele==val){
                freq++;
            }
        }
        if(freq>n/2){
            return ele;
        }
    }
    return -1;
  }
  public static void main(String[] args){
    int[] nums={3,2,3,1,3};
    System.out.println(majorityElement(nums));
  }
}
