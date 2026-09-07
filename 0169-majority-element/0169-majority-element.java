class Solution {
    public int majorityElement(int[] nums) {
        int me = nums[0];
        int v = 1;
        int i = 1;
    while(i<nums.length){
        if(nums[i]==me){
            v++;
        }else{
            if(nums[i]!=me&&v==0){
                me = nums[i];
            }else{
                v--;
            }
        }
        i++;
    }
    return me;

    }
}