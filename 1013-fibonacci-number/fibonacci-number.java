// memoization recursive dp

// class Solution {

//     public int fibo(int n,int[] dp) {
//         if (n <=1) return n;
//         // agar array mein already answer hai to uss ans ko lautado ! 
//         if (dp[n] !=0 ) return dp[n];

//         //ans nhi hai to isme store kardo current jo calculate kiya usko
//        return dp[n] =  fibo(n - 1,dp) + fibo(n - 2,dp); 
       
//     }
// public int fib(int n){
//      int[] dp;
//     dp = new int[n+1];  // index 0 ninda n varegu
//     return fibo(n,dp);
// }
//     }






// tabulation dp
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}