class Solution {
    public int maxDistinct(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch : arr){
            set.add(ch);
        }
        return set.size();
        
    }
}