class Solution {
    public int solve(int[] nums,int target,int currsum, int i){
        if(i==nums.length){
            if(currsum==target) return 1;
            else return 0;
        }
        int plus = solve(nums,target,currsum+nums[i],i+1);
        int minus = solve(nums,target,currsum-nums[i],i+1);
        return plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
}