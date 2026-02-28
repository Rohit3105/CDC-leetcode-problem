class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        int MOD = 1_000_000_007;

        for (int i = 1; i <= n; i++) {

            // get binary length using string (simple way)
            int len = Integer.toBinaryString(i).length();

            // shift and add
            res = (res * (1L << len) + i) % MOD;
        }

        return (int) res;
    }
}