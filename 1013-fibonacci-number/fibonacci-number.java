class Solution {
    public int fib(int n) {
        if (n <=1) return n;
        // if (n == 1) return 1;  two base case
        return fib(n - 1) + fib(n - 2);
    }
}
