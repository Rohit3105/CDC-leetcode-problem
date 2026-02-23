class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0] = nums[0];
        for(int i =1; i<n; i++){
            pref[i] = pref[i-1]+nums[i];
        }
        suff[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = suff[i+1]+nums[i];
        }
        int idx = 0;
        for(int i=0; i<n; i++){
            int left = pref[i]-nums[i];
            int right = suff[i]-nums[i];
            if(left==right){
                return i;
            }
        }
        return -1;
        
    }
}