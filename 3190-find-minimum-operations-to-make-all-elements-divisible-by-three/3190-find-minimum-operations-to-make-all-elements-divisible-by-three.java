class Solution {
    int count = 0;
    public int minimumOperations(int[] nums) {
        for(int num : nums){
            if(num%3!=0){
                count++;
            }
        }
        return count;
        
    }
}