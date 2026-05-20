class Solution {
static int[] dp;
    public int fibo(int n) {
        if (n <=1) return n;
        // if (n == 1) return 1;  two base case
        return fibo(n - 1) + fibo(n - 2);
    }
public int fib(int n){
    return fibo(n);
}





    }


