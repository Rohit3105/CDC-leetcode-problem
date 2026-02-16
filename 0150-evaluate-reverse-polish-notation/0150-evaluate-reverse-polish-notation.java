class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String tk : tokens){
            if(tk.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }else if(tk.equals("-")){
                int a = st.pop();
                int b =st.pop();
                st.push(b-a);
            }else if(tk.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }else if(tk.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }else{
                st.push(Integer.parseInt(tk));
            }
        }
        return st.pop();
    }
}