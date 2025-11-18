class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<minutes){
            if(grumpy[j]==1){
                sum += customers[j];
            }
            j++;
        }
        int maxsum = sum;
         i =0;
        while(j<grumpy.length){
            sum += customers[j]*grumpy[j];
            sum -= customers[i]*grumpy[i];
            maxsum = Math.max(maxsum,sum);
            i++;
            j++;
        }
        for(int k =0 ;k<customers.length; k++){
           if (grumpy[k] == 0) {
                maxsum += customers[k];
            }
        }
        return maxsum;

        
    }
}