class Solution {
    public int differenceOfSums(int n, int m) {
        int dividableSum = 0;
        int nonDividableSum = 0;
        int i=1;
        while(i<=n){
            if(i%m == 0){
                dividableSum += i;
            }
            else{
                nonDividableSum += i;
            }
            i++;
        }
        return nonDividableSum-dividableSum;
    }
}