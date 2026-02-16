class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i : nums){
            set.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for(int j=1; j<=n; j++){
            if(!set.contains(j)){
                list.add(j);
            }
        }
        return list;
    }
}