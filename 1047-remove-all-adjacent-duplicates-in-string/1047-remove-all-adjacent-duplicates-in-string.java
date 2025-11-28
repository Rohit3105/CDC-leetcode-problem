class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(!st.isEmpty()&&st.peek()==ch){
                st.pop();
            }else{
                 st.push(ch);
            }
           
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st) sb.append(c);
        return sb.toString();
    }
}