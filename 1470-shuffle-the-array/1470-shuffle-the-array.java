class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x = nums.length;
        int[] ans = new int[x];
        int k =0;
       for(int i =0, j = n; i<n&&j<nums.length; i++,j++){
        ans[k++] = nums[i];
        ans[k++] = nums[j];
        }
        return ans;
    }
}