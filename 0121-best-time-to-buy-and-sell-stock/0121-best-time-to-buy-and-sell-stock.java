class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int i = 1;
        int ans = 0;
        while(i<prices.length){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                int p = prices[i]-buy;
                ans = Math.max(p,ans);
            }
            i++;
        }
        return ans;
    }
}