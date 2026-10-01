class Solution {
    int dp[];
    public int solve(int[] cost,int i){
        int n = cost.length;
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int a = cost[i]+solve(cost,i+1);
        int b = cost[i]+solve(cost,i+2);
        return dp[i] = Math.min(a,b);
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,0),solve(cost,1));
    }
}