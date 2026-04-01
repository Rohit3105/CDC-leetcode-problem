class Solution {
    int[][] dp;
    public int check(String s,int i,int j){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)) return dp[i][j] = 2 + check(s,i+1,j-1);
        return dp[i][j] = Math.max(check(s,i+1,j),check(s,i,j-1));

    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return check(s,0,s.length()-1);
    }
}