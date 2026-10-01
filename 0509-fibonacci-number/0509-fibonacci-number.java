class Solution {
    public int solve(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        int fib = solve(n-1)+solve(n-2);
        return fib;
    }
    public int fib(int n) {
        return solve(n);
    }
}