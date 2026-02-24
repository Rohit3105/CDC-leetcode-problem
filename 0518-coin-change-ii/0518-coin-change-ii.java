class Solution {
    Integer dp[][];
    public int solve(int amount, int[] coins,int i){
        if(amount==0){
            return 1;
        }
        if(i==coins.length){
            return 0;
        }
        if(dp[i][amount]!=null) return dp[i][amount];
        int take = 0;
        if(coins[i]<=amount){
            take= solve(amount-coins[i],coins,i);
        }
        int skip = solve(amount,coins,i+1);
        return dp[i][amount] =  take+skip;

    }
    public int change(int amount, int[] coins) {
        dp = new Integer[coins.length][amount+1];
        return solve(amount,coins,0);
    }
}