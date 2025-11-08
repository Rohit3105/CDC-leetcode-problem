class Solution {
    public int minSteps(String s, String t) {
        int count =0;
       Map<Character, Integer> map1 = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        for(char ch : map1.keySet()){
            if(!map2.containsKey(ch)){
                count += map1.get(ch);
            }else if (map1.get(ch) > map2.get(ch)) {
                count += map1.get(ch) - map2.get(ch);
            }
        }
         for(char ch : map2.keySet()){
            if(!map1.containsKey(ch)){
                count += map2.get(ch);
            }else if (map2.get(ch) > map1.get(ch)) {
                count += map2.get(ch) - map1.get(ch);
            }
        }
        return count;

        
    }
}