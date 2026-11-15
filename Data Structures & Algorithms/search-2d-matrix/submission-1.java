class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int l=0;
        int r=row*col-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            int ro=m/col;
            int lo=m%col;
            if(matrix[ro][lo]==target)
            {
                return true;
            }
            else if(matrix[ro][lo]<target)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        return false;
    }
}
