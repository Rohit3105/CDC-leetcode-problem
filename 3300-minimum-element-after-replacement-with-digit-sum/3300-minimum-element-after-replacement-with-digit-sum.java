class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length; i++){
            int num = nums[i];
            int sum = 0;
            while(num!=0){
                int mod = num%10;
                sum += mod;
                num = num/10;
            }
            nums[i] = sum;
        }
        Arrays.sort(nums);
        return nums[0];
        
    }
}