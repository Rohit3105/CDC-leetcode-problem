class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int steps =0;
        for(int i:map.values()){
           if(i==1) return -1;
           else if(i>3){
           steps += (i+2)/3;
           }
           else{
            steps += 1;
           }
        }
        return steps;
    }
}