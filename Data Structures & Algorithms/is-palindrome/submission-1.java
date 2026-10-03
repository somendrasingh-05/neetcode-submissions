class Solution {
    public boolean isPalindrome(String str) {
    StringBuilder result = new StringBuilder();

for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);

    if (Character.isLetterOrDigit(ch)) {
        result.append(ch);
    }
}
    String s=result.toString().toLowerCase();
     int left=0;
     int right =s.length()-1;
     while(left<right)
     {
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }
        left++;
        right--;
     }
     return true;
    }
}
