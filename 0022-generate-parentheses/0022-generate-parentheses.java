class Solution {
    List<String> res = new ArrayList<>();
    public boolean isvalid(String s){
        Stack<Character> st  =new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && ch==')' && st.peek()=='('){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public void solve(int n, StringBuilder sb){
        if(sb.length()==2*n){
            if(isvalid(sb.toString())){
                res.add(sb.toString());
            }
            return;
        }
        sb.append('(');
        solve(n,sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append(')');
        solve(n,sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> generateParenthesis(int n) {
       solve(n,new StringBuilder());
       return res;
    }
}