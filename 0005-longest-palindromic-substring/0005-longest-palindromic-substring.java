class Solution {
    public boolean isSubstring(String s, int i, int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isSubstring(s,i+1,j-1);
    }
    public String longestPalindrome(String s) {
        int n =s.length();
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