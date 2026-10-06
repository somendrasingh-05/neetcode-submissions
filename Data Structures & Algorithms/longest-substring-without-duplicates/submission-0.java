class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left=0;
      int len=0;
      Set<Character> set=new HashSet<>();
      for(int i=left;i<s.length();i++)
      {
        while(set.contains(s.charAt(i)))
        {
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(i));//zxy
        len=Math.max(len,set.size());
      }  
      return len;
    }
}
