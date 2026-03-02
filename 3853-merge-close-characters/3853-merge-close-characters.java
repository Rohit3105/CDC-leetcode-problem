class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        while (true) {

            boolean merged = false;

            for (int i = 0; i < sb.length(); i++) {

                for (int j = i + 1; j < sb.length(); j++) {

                    if (sb.charAt(i) == sb.charAt(j) && (j - i) <= k) {
                        sb.deleteCharAt(j);   // merge right into left
                        merged = true;
                        break;               // smallest right index found
                    }
                }

                if (merged) break;  // smallest left index satisfied
            }

            if (!merged) break; // no more merges possible
        }

        return sb.toString();
    }
}