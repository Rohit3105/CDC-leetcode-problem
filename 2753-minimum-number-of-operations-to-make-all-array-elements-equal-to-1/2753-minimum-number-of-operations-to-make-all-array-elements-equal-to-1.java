class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;  
        }
        return gcd(b, a % b); 
    }
    public int minOperations(int[] nums) {
        int count1 =0;
        int n =nums.length;
        int minlen = Integer.MAX_VALUE;
        for(int num : nums){
            if(num==1){
                count1++;
            }
        }
        if(count1>0){
            return n-count1; 
        }else{
            for(int i =0; i<n; i++){
                int g= nums[i];
                for(int j =i+1; j<n; j++){
                    g = gcd(g,nums[j]);
                    if(g==1){
                        minlen = Math.min(minlen,j-i);
                        break;
                    }
                }
            }
        }
        if(minlen==Integer.MAX_VALUE) return -1;
        return minlen+n-1;
        
        
    }
}