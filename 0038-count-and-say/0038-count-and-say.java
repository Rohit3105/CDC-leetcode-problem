class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String say = countAndSay(n-1);
        String result = "";
        for(int i =0; i<say.length(); i++){
            int count = 1;
            while(i+1<say.length() && say.charAt(i)==say.charAt(i+1)){
                count += 1;
                i++;
            }
            result += count+""+say.charAt(i);
        }
        return result;
    }
}