class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        for(int i =0; i<n-k+1; i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int  j =i; j<i+k;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }

                List<int[]> list = new ArrayList<>();
                for(int key:map.keySet()){
                    list.add(new int[]{key,map.get(key)});
                }
                 Collections.sort(list, (a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1]; 
                else return b[0] - a[0]; 
            });
             int sum = 0;
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                sum += list.get(j)[0] * list.get(j)[1];
            }
            ans[i]  =sum;

        }
        return ans;
    }
}