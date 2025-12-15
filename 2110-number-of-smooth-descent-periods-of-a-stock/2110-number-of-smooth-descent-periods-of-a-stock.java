class Solution {
    public long getDescentPeriods(int[] nums) {
       long result = 1;
       int count =1;
       for(int i =1; i<nums.length; i++){
        if(nums[i]==nums[i-1]-1){
            count++;
        }else{
            count = 1;
        }
        result += count;
       }
       return result;
        
    }
}