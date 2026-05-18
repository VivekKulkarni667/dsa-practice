class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int low = 0;
        int high = nums.length - 1;

        while(low < high)
        {
            int mid = low + (high - low) / 2;

            // If right side is bigger,
            // peak must exist on right
            if(nums[mid] < nums[mid + 1])
            {
                low = mid + 1;
            }
            // If left side is bigger,
            // peak exists on left including mid
            else
            {
                high = mid;
            }
        }

        // low == high
        // Only one index remains
        // That index is peak
        return low;
    }
}














