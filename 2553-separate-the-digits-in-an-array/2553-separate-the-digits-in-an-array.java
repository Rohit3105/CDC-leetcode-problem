class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(i>9){
               String s = String.valueOf(i);
               for(int j =0; j<s.length(); j++){
                list.add(s.charAt(j)-'0');
               }
            }else{
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}