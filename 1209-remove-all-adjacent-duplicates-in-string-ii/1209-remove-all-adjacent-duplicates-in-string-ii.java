class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack();
         Stack<Integer> count = new Stack();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(!st.isEmpty() && st.peek()==ch){
                count.push(count.pop()+1);
            }else{
                count.push(1);
            }
            st.push(ch);
            if(count.peek()==k){
                for(int i =0; i<k; i++){
                    st.pop();
                   
                }
                 count.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
         return sb.toString();  
        
    }
}