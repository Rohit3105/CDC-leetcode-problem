class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int nr = p.length();
        if(n<nr) return list;
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        for(char ch : p.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i =0; i<nr; i++){
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,freq2)){
            list.add(0);
        }
        for(int i =1; i<=n-nr; i++){
            freq2[s.charAt(i-1)-'a']--;
            freq2[s.charAt(i+nr-1)-'a']++;
            if(Arrays.equals(freq,freq2)){
                list.add(i);
            }
        }
        return list;
    }
}