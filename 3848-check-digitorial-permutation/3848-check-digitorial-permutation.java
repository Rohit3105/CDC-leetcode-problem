class Solution {
    public int fact(int num){
        int factorial = 1;
        for(int i =1; i<=num; i++){
            factorial *= i;
        }
        return factorial;
    }

    public boolean isDigitorialPermutation(int n) {
        int original = n;
        int sum = 0;
        while (n != 0) {
            int num = n % 10;
            sum += fact(num);
            n = n / 10;
        }
     char s[] = Integer.toString(original).toCharArray();
     char ss[] = Integer.toString(sum).toCharArray();
     Arrays.sort(s);
     Arrays.sort(ss);
    return Arrays.equals(s,ss);
        
    }
}