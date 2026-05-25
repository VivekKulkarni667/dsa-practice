import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums); // [-5,-2,1,3] negatives first
        
        // Flip negatives to positive (biggest gain)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i]; // -5 → 5
                k--;
            }
        }
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num); // track smallest for leftover k
        }
        
        // k odd? Must flip one more. Smallest num loses 2x value:
        // +min → -min, diff = 2*min
        if (k % 2 == 1) sum -= 2 * min;
        
        return sum;
    }
}