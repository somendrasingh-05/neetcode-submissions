class KthLargest {

    private PriorityQueue<Integer> pq;
    private int k; 
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();

        for(int n1 : nums)
        {
            pq.offer(n1);
            if(pq.size()>k)
            {
                pq.poll();
            }
           
        }
    }
    
    public int add(int val) {
           pq.offer(val);
           if(pq.size()>k)
            {
                pq.poll();
            }
    return pq.peek();
    }
}
