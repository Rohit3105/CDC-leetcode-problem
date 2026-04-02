class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        if(n <= 2 * k){   // fixed 2k
            String ss = s.substring(0, Math.min(k, n));  // fixed range
            sb.append(new StringBuilder(ss).reverse());  // reverse only k part

            if(k < n) {  // remaining part
                sb.append(s.substring(k));
            }
            return sb.toString();
        } else {
            int i = 0;
            while(i < n){
                // reverse first k
                String ss = s.substring(i, Math.min(i + k, n));
                sb.append(new StringBuilder(ss).reverse());

                // append next k as it is
                if(i + k < n){
                    sb.append(s.substring(i + k, Math.min(i + 2 * k, n)));
                }

                i = i + 2 * k;   // fixed jump
            }
        }
        return sb.toString();   // fixed return
    }
}