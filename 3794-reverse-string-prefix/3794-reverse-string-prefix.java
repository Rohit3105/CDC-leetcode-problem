class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb1 = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();
         for(int i =0; i<k; i++){
            sb1.append(s.charAt(i));
         }
         sb1.reverse();
         for(int i =k; i<s.length(); i++){
            sb2.append(s.charAt(i));
         }
         return sb1.append(sb2).toString();
        
    }
}