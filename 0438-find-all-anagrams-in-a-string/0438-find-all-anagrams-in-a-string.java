class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        for(char ch : p.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i =0; i<s.length(); i++){
            freq2[s.charAt(i)-'a']++;
            if(i>=p.length()){
                freq2[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(freq,freq2)){
                list.add(i-p.length()+1);
            }
        }
        return list;
        
    }
}