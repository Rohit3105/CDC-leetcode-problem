class Solution {
    public int countDecodings(String s,int i,int[] dp)
    {
        if(i==s.length())return 1;
         
       if(dp[i]!=-1) return dp[i];
        if(s.charAt(i)== '0')return 0;
       int one= countDecodings(s,i+1,dp);
       int two=0;
      
       if(i+1<s.length() ){
         int val= Integer.valueOf(s.substring(i,i+2));
         if( val>0 && val<27)
             two = countDecodings(s, i+2,dp);
       }
       return  dp[i] = one+two ;
    }
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return countDecodings(s,0,dp);   
    }
}