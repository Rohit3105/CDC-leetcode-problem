class Solution {
    public char findTheDifference(String s, String t) {
        char ans = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            int count = map.getOrDefault(ch,0);
            if(count==0){
                ans = ch;
                break;
            }else{
                map.put(ch,count-1);
            }
        }
        return ans;
        
    }
}