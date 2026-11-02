class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left=0;
        int right =0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> list=new ArrayList<>();
        while(right<nums.length)
        {
            pq.offer(nums[right++]);
            if(pq.size()==k)
            {
                list.add(pq.peek());
                pq.remove(nums[left++]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
