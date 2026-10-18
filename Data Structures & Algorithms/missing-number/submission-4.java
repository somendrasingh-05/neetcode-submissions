class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if((i^nums[i])!=0)
            {
                return i;
            }
        }
        if(nums[n-1]==n-1)
        {
            return n;
        }
        return -1;
    }
}
