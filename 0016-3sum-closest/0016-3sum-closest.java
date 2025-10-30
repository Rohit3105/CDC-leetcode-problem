class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int cl = 0;
        for(int k =0; k<nums.length; k++){
            int i = k+1;
            int j = nums.length-1;
            while(i<j){
                int sum = nums[k]+nums[i]+nums[j];
                int diff = Math.abs(sum-target);
                if(diff<min){
                    min = diff;
                    cl = sum;
                }
               if(sum<target){
                i++;
               }
               else if(sum>target){
                j--;
               }
               else{
                return sum;
               }
            }
        }
        return cl;

        
    }
}