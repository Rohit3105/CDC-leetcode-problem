class Solution {
    Double dp[][] = new Double[101][101];
    double solve(int poured,int i,int j){
        if(i<0 || j<0 || j>i) return 0.0;
        if(i==0 && j==0) return poured;
        if(dp[i][j]!=null) return dp[i][j];
        double lefttop = (solve(poured,i-1,j-1)-1)/2.0;
        double righttop = (solve(poured,i-1,j)-1)/2.0;
        if(lefttop<0) lefttop = 0.0;
        if(righttop<0) righttop = 0.0;
        return dp[i][j] = lefttop + righttop;
    }
    public double champagneTower(int poured, int query_row, int query_glass) {
        return Math.min(1.0,solve(poured,query_row,query_glass));
        
    }

}