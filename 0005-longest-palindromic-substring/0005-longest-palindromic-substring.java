class Solution {
    int[][] dp;
    public boolean isSubstring(String s, int i, int j){
        if(i>j){
            return true;
        }
        if(dp[i][j]!=-1){
            return dp[i][j] == 1;
        }
        if(s.charAt(i)!=s.charAt(j)){
            dp[i][j] = 0;
            return false;
        }
        boolean res =  isSubstring(s,i+1,j-1);
        dp[i][j] = res?1:0;
        return res;
    }
    public String longestPalindrome(String s) {
        int n =s.length();
        dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        int max = Integer.MIN_VALUE;
        String ans = "";
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(isSubstring(s,i,j)){
                    int sz= j-i+1;
                    if(max<sz){
                        max = sz;
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}