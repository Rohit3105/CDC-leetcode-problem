class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        while(j<nums.length){
            sum += nums[j];
            j++;
                while(sum>=target){
                    len  = Math.min(len,(j-i));
                    sum -= nums[i];
                    i++;
                }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}