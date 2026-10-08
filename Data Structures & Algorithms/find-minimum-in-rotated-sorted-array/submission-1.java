class Solution {
    static void rotate(int nums[], int l,int r)
    {
    while(l<=r)
    {
        int tmp=nums[l];
        nums[l]=nums[r];
        nums[r]=tmp;
        r--;
        l++;
    }
    }
    public int findMin(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                k=i+1;
                break;
            }
        }
        if(k>0)
        {
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
        rotate(nums,0,nums.length-1);
        }
        return nums[0];
    }
}
