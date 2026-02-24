class Solution {
    Boolean dp[][];
    public boolean solve(int[] nums,int target,int i){
        if(target==0){
            return true;
        }
        if(i>=nums.length) return false;
        boolean take = false;
        if(dp[i][target]!=null) return dp[i][target];
        if(target>=nums[i]){
            take = solve(nums,target-nums[i],i+1);
        }
        boolean not_take = solve(nums,target,i+1);
        return dp[i][target] = (take || not_take);
    }    
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int mid = 0;
        for(int i =0; i<nums.length; i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }else{
            mid = sum/2;
            dp = new Boolean[nums.length][mid+1];
            return solve(nums,mid,0);
        }
    }
}