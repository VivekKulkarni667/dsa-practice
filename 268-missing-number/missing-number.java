import java.util.Arrays;
class Solution {
    public int missingNumber(int[] arr) {
   int n=arr.length;

        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] != i) {
        //         return i;
        //     }
        // }





        // optimal


        int expected_sum = n*(n+1)/2;
        int actual_sum =0;


        for(int i=0; i<n; i++){
            actual_sum +=arr[i];
        }
int missing = expected_sum - actual_sum;

        return missing;
    }
}


