class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l =0;
        int maxfreq = 0;
        int maxwin = 0;
        for(int r =0; r<s.length(); r++){
            freq[s.charAt(r)-'A']++;
          maxfreq = Math.max(maxfreq,freq[s.charAt(r)-'A']);
          int winlen = r-l+1;

          if(winlen-maxfreq>k){
            freq[s.charAt(l)-'A']--;
            l++;
          }
          winlen = r-l+1;
          maxwin = Math.max(maxwin,winlen);
        }
        return maxwin;
        
    }
}