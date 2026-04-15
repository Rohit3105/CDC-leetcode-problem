class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int l = 0; 
        int r = 0;
        for(int i=0; i<n; i++){
            if(words[(startIndex+i)%n].equals(target)){
                return i;
            }
            if(words[(startIndex-i+n)%n].equals(target)){
                return i;
            }
        }
        return -1;
    }
}