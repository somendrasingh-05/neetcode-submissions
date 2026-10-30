class Solution {
    public int maxProfit(int[] prices) {
       Stack<Integer> st=new Stack<>();
       int max=0;
       int ans=0;
       for(int i=0;i<prices.length;i++)
       {
        if(st.isEmpty())
        {
            st.push(prices[i]);
        }
        else if(st.peek()<prices[i])
        {
            ans=prices[i]-st.peek();
        }
        else 
        {
            st.pop();
            st.push(prices[i]);
        }
        max=Math.max(max,ans);
       } 
       return max;
    }
}
