class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int newnum = original;
        while(set.contains(newnum)){
            newnum = newnum*2;
        }
        return newnum;
        
    }
}