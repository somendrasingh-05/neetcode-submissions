class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> result=new ArrayList<>();
         Map<String, List<String>> mp=new HashMap<>();
         if(strs.length<1)
         {
            return result;
         }
         for(int i=0;i<strs.length;i++)
         {
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            mp.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);
         }
         for(Map.Entry<String, List<String>> res: mp.entrySet())
         {
            result.add(res.getValue());
         }
         return result;
    }
}
