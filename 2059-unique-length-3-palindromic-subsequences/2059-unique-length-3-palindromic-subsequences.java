class Solution {
    public int countPalindromicSubsequence(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for(int i =0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        for(char letter : set){
            int lefti = -1;
            int righti = -1;
            for(int i =0; i<s.length(); i++){
                if(s.charAt(i)==letter){
                     if(lefti==-1){
                    lefti = i;
                }
                righti = i;
                }
               
            }
           
            Set<Character> ans = new HashSet<>();
            for(int i=lefti+1;i<righti; i++){
                ans.add(s.charAt(i));
            }
            result += ans.size();
        }
        return result;
        
    }
}