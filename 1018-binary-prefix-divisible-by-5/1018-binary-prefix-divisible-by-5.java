class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int count = 0;
        for(int num : nums){
            count = ((count<<1)+num)%5;
            if(count%5==0){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}