class Solution {
    List<String> res = new ArrayList<>();
    public void solve(char[] ch,int i){
        if(i==ch.length){
            res.add(new String(ch));
            return;
        }
        if(Character.isDigit(ch[i])){
            solve(ch,i+1);
        }else{
            ch[i] = Character.toUpperCase(ch[i]);
            solve(ch,i+1);
            ch[i] = Character.toLowerCase(ch[i]);
            solve(ch,i+1);
        }
    }
    public List<String> letterCasePermutation(String s) {
        solve(s.toCharArray(),0);
        return res;
    }
}