class Solution {
    int[][][] dp;
    int n,m;
    public int count(int[][] coins, int i, int j, int neu){
        if(i>=n || j>=m) return Integer.MIN_VALUE;
        if(i==n-1 && j==m-1){
            if(coins[i][j]<0 && neu>0){
                return 0;
            }
            return coins[i][j];
        }
        if(dp[i][j][neu]!=Integer.MIN_VALUE) return dp[i][j][neu];
        int take = coins[i][j] + Math.max(count(coins,i+1,j,neu),count(coins,i,j+1,neu));
        int skip = Integer.MIN_VALUE;
        if(coins[i][j]<0 && neu>0){
            skip = Math.max(count(coins,i+1,j,neu-1),count(coins,i,j+1,neu-1));
        }
        return dp[i][j][neu] = Math.max(take,skip);
    }
    public int maximumAmount(int[][] coins) {
        this.n = coins.length;
        this.m = coins[0].length;
        dp = new int[n][m][3];
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                for(int k =0; k<3; k++){
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }
        return count(coins,0,0,2);
        
    }
}