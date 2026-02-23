class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();

        if (n < 4 || n > 12)
            return result;

        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int idx, List<String> parts, List<String> result) {
        int n = s.length();
        int partsLeft = 4 - parts.size();
        int remain = n - idx;

        if (remain < partsLeft || remain > 3 * partsLeft)
            return;

        if (parts.size() == 4) {
            if (idx == n) {
                result.add(String.join(".", parts));
            }
            return;
        }

        for (int len = 1; len <= 3 && idx + len <= n; len++) {
            if (len > 1 && s.charAt(idx) == '0') {
                break;
            }

            String chunk = s.substring(idx, idx + len);
            int value = Integer.parseInt(chunk);

            if (value > 255) {
                continue;
            }

            parts.add(chunk);
            backtrack(s, idx + len, parts, result);
            parts.remove(parts.size() - 1);
        }
    }
}