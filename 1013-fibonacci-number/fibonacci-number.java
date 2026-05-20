class Solution {
static int[] dp; // creating array for knwon solutions already calculated
    public int fibo(int n) {
        if (n <=1) return n;
        if (dp[n] !=0 ) return dp[n];
        // if (n == 1) return 1;  two base case
        return fibo(n - 1) + fibo(n - 2);
    }
public int fib(int n){
    dp = new int[n+1];  // index o ninda n varegu
    return fibo(n);
}





    }


