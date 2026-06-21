class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int count = 0;
        long sum = 0;
        for(int i : costs){
            sum += i;
            if(sum<=coins){
                count++;
            }
        }
        return count;
    }
}