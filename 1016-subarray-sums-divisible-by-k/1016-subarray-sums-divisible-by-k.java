class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int result = 0;
        for(int num : nums){
           sum += num;
           int rem = ((sum%k)+k)%k;
           if(map.containsKey(rem)){
            result += map.get(rem);
           }
            map.put(rem,map.getOrDefault(rem,0)+1);

        }
        return result;
        
    }
}