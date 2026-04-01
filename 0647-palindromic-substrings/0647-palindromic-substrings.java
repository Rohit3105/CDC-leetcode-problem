class Solution {
    public int checks(String s, int i , int j){
        if(i>j){
            return 1;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return 0;
        }
        return checks(s,i+1,j-1);
    }
    public int countSubstrings(String s) {
        int count =0;
        for(int i =0; i<s.length(); i++){
            for(int j =i; j<s.length(); j++){
                count+= checks(s,i,j);
            }
        }
        return count;
    }
}