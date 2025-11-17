class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        int s = 0;
        for(int i =0; i<nums.length; i++){
             if(nums[i]==1){
                 s = i;
                 break;
             } 
        }
        for(int j = s+1; j<nums.length; j++){
            if(nums[j]==1){
                if(count>=k){
                    count =0;
                }else return false;
            }else count++;
        }
        return true;
           
               
        
        
    }
}