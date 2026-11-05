class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        boolean result=true;
        if(s.length()<2) return false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                if(!st.isEmpty() && st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    result=false;
                }
            }
             else if( ch==']')
            {
                if(!st.isEmpty() && st.peek()=='[')
                {
                    st.pop();
                }
                else
                {
                    result=false;
                }
            }
             else if(ch=='}')
            {
                if(!st.isEmpty() && st.peek()=='{')
                {
                    st.pop();
                }
                else
                {
                    result=false;
                }
            }
        }
        if(!st.isEmpty())
        {
            result=false;
        }
        return result;

    }
}
