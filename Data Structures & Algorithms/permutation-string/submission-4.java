class Solution {
public static boolean containsAllChars(String s1, String s2) {
    int[] freq = new int[256];

    for (char ch : s1.toCharArray()) {
        freq[ch]++;
    }

    for (char ch : s2.toCharArray()) {
        if (freq[ch] == 0) {
            return false;
        }
        freq[ch]--;
    }

    return true;
}

    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        boolean result=false;
        for(int i=0;i<=n2-n1;i++)
        {
            String s=s2.substring(i,i+n1);
            result=containsAllChars(s,s1);
            if(result)
            {
                return result;
            }
        }
         return result;
    }
}
