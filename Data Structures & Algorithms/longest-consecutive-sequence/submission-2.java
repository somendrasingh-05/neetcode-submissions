class Solution {
    public int longestConsecutive(int[] nums) {
        int mcount=0;
        int count=0;
        if(nums.length==0)
        {
            return 0;
        }
         TreeSet<Integer> st=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
           st.add(nums[i]);
        }
        int a=st.first();
       while(st.size()>0)
       {
        if(st.first()==a)
        {
            count++;
            st.remove(a);
            a++; 
                
        }
        else{
            a=st.first();
            mcount=Math.max(mcount,count);
            count=0;
        }
         mcount=Math.max(mcount,count);  
       }
        return mcount;
    }
}
