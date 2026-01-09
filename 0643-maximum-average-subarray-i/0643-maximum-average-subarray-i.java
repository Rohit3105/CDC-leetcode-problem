class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i =0; i<k; i++){
            sum += nums[i];
        }
        int maxsum = sum;
        int i =0;
        int j = k;
        while(j<nums.length){
            sum += nums[j];
            sum -= nums[i];
            maxsum = Math.max(maxsum,sum);
            i++;
            j++;
        }
        return (double)maxsum/k;
    }
}