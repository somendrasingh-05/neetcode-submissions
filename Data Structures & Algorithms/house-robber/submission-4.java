class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int p1=nums[0];
        int p2=Math.max(nums[0],nums[1]);
        int result=p2;
        for(int i=2;i<n;i++)
        {
            result=Math.max(nums[i]+p1,p2);
            p1=p2;
            p2=result;
        }
        return result;
    }
}
