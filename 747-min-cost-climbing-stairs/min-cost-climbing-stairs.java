// import java.util.Arrays;

// class Solution {

//     public int mincost(int[] cost, int index, int[] dp) {

        
//         if(index == 0 || index == 1) return cost[index];

//         // if already calculated then return from dp
//         if(dp[index] != -1) return dp[index];

//         // formula :
//         // mincost(i) = arr[i] + min(mincost(i-1), mincost(i-2))
//         return dp[index] = cost[index] + Math.min(mincost(cost,index - 1,dp), mincost(cost,index - 2,dp));
//     }

//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;

//         // n is going from n-1 to 0
//         int[] dp = new int[n];

//         // filling dp array with -1
//         Arrays.fill(dp,-1);

//         // top can be reached from last stair or second last stair
//         return Math.min(mincost(cost,n - 1,dp), mincost(cost,n - 2,dp));
//     }
// }









//  TABULATION METHOD


class Solution {

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int[] dp = new int[n];

        dp[0] = cost[0];

        dp[1] = cost[1];

        for(int i = 2; i < n; i++) {

            dp[i] = cost[i] + Math.min(dp[i - 2], dp[i - 1]);
        }

        return Math.min(dp[n - 2], dp[n - 1]);
    }
}