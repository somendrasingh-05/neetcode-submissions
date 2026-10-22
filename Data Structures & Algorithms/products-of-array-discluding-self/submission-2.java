class Solution {
    public int[] productExceptSelf(int[] nums) {
       int result[]=new int[nums.length];
        int product=1;
       //left sum
       for(int i=0;i<nums.length;i++)
       {
       result[i]=product;
       product*=nums[i];
       } 
       product =1;
       //right sum
       for(int i=nums.length-1;i>-1;i--)
       {
       result[i]*=product;
       product*=nums[i];
       } 
       
       return result;
    }
}  
