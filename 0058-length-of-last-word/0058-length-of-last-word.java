class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String ss= arr[arr.length-1];
        return ss.length();
    }
}