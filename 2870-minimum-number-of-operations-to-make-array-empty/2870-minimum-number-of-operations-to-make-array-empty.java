class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int steps = 0;
        
        for(int i:map.values()){
            if(i == 1){
                return -1;  // ❌ single element can't be removed
            }
            else if(i == 2 || i == 3){
                steps += 1; // ✅ already correct
            }
            else{
                steps += (i + 2) / 3;  // ✅ FIXED HERE
            }
        }
        
        return steps;
    }
}