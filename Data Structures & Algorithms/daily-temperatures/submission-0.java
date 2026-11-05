class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
            {
                int prev=st.pop();
                result[prev]=i-prev;
            }
            st.push(i);
        }
        return result;
    }
}
