class Solution {
    Set <List<Integer>> res = new HashSet<>();
    public void solve(int[] nums, int i, List<Integer> list){
        if(i==nums.length){
         res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        solve(nums,i+1,list);
        list.remove(list.size()-1);
        
        solve(nums,i+1,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>());
        return new ArrayList<>(res);
    }
}