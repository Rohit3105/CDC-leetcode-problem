class Solution {

    public int solve(int[] coins,Integer dp[][], int amount, int i){
        if(amount==0) return 0;
        if(amount<0)return Integer.MAX_VALUE;
        if(i>=coins.length) return Integer.MAX_VALUE;
        if(dp[i][amount]!=null)return dp[i][amount];
       
          dp[i][amount] = solve(coins,dp,amount,i+1);
        if(coins[i]<=amount){
            int x= solve(coins,dp,amount-coins[i],i);
             if(x<Integer.MAX_VALUE) x++;
         dp[i][amount] = Math.min(dp[i][amount],x);
        
        }
       
        return dp[i][amount];
    }
    public int coinChange(int[] coins, int amount) {
        Integer dp[][]=new Integer[coins.length][amount+1];
        int x=solve(coins,dp,amount,0);
        return (x!=Integer.MAX_VALUE)?x:-1; 
    }
}