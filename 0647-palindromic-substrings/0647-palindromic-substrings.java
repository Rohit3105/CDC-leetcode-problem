class Solution {
    int[][] dp;
    public int checks(String s, int i , int j){
        if(i>=j){
            return 1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)!=s.charAt(j)){
            return dp[i][j]=0;
        }
        return dp[i][j]= checks(s,i+1,j-1);
    }
    public int countSubstrings(String s) {
        int n = s.length();
        dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        int count =0;
        for(int i =0; i<s.length(); i++){
            for(int j =i; j<s.length(); j++){
                count+= checks(s,i,j);
            }
        }
        return count;
    }
}