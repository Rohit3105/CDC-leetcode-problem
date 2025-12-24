class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int n: apple){
            sum += n;
        }
        Arrays.sort(capacity);
      int ans = 0;
        int i = capacity.length - 1;
        int newsum = 0;

        while (i >= 0) {
            newsum += capacity[i];
            ans++;
            if (newsum >= sum) {
                return ans;
            }
            i--;
        }
        return ans;

        
    }
}