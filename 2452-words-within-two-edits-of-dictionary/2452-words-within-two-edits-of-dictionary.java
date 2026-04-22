class Solution {
    public static int same(String s, String p){
        if(s.length() != p.length()) return Integer.MAX_VALUE;
         int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != p.charAt(i)){
                count++;
                if(count > 2) return count;
            }
        }
        return count;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();
        for(int i =0; i<queries.length; i++){
            for(int j =0; j<dictionary.length; j++){
                if(same(queries[i],dictionary[j])<=2){
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;
    }
}