class Solution {
    public int maxDistance(int[] colors) {
        int idx = 0;
       for(int i =0; i<colors.length; i++){
        for(int j =0; j<colors.length; j++){
            if(colors[i]!=colors[j]){
                idx = Math.max(idx,(j-i));
            }
        }
       }
       return idx;
    }
}