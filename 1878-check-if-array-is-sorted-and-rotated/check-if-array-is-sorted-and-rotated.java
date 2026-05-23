class Solution {

    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

       
        for(int i = 0; i < n - 1; i++) {

            // if current element is greater than next
            // then order breaks here

            if(nums[i+1] < nums[i]) {

                count++;
            }
        }

        // check last element with first element
        // because rotated array is circular

        if(nums[n - 1] > nums[0]) {

            count++;
        }

        // valid only if break occurs at most once
        return count <= 1;
    }
}