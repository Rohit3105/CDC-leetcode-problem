class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        List<Integer> list = new ArrayList<>();
        for (int n : happiness) {
            list.add(n);
        }

        Collections.sort(list);   // sort once
        long ans = 0;
        int dec = 0;

        while (k > 0 && !list.isEmpty()) {

            int max = list.get(list.size() - 1); // max element
            list.remove(list.size() - 1);        // remove it

            max = max - dec;                     // apply decrement
            if (max <= 0) break;

            ans += max;
            dec++;
            k--;
        }

        return ans;
    }
}
