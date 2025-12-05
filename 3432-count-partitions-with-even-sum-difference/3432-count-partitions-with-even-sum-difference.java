class Solution {
    public int countPartitions(int[] nums) {
        //prefix sum approach
        // int len = nums.length;
        // int prefixSum[] = new int[len];
        // prefixSum[0]= nums[0];
        // for(int i=1; i<len; i++){
        //     prefixSum[i] = prefixSum[i-1] + nums[i];
        // }
        // int count = 0;
        // for(int i=0; i<len-1; i++){
        //     int diff = prefixSum[i] - (prefixSum[len-1]-prefixSum[i]);
        //     if(diff % 2 == 0) count++;
        // }
        // return count;
        int len = nums.length;
        int totalSum = 0;
        for(int i=0; i<len; i++){
            totalSum += nums[i];
        }
        int leftSum = 0, rightSum = totalSum;
        int count = 0;
        for(int i=0; i<len-1; i++){
            leftSum += nums[i];
            rightSum -= nums[i];
            if((leftSum - rightSum) % 2 == 0) count++;
        }
        return count;
    }
}