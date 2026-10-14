class Solution {
    public int count(int n)
    {
        int c=0;
        for(int i=0;i<32;i++)
        {
            int a=1<<i;
            if(( n & a)>0 )
            {
                c++;
            }
        }
         return c; 
    }
    public int[] countBits(int n) {
      int res[] =new int[n+1];
      res[0]=0;
        for(int i=1;i<n+1;i++)
        {
            res[i]=count(i);
        }
        return res;
    }
}
