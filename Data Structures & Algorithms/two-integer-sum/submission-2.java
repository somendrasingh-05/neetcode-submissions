class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(target-nums[i]))
            {
                result[1]=i;
                result[0]=mp.get(target-nums[i]);
            }
            mp.put(nums[i],i);
        }
        return result;
    }
}
