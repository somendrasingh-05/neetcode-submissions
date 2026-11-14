class Solution {
    private boolean canEat(int[] piles, int h, int k)
    {
        long hour=0;
        for(int p:piles)
        {
            hour+=(p+(long)k-1)/k;//for ceil value
        }
        return hour<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int p:piles)
        {
            high=Math.max(high,p);
        }
        int ans=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canEat(piles,h,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}
