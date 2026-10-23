class Solution {
    public int digitSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(true)
        {
            int s=digitSum(n);
            if(s==1) return true;
            else if(s<10) return false;
            else
            {
                n=s;
            }
        }
    }
}
