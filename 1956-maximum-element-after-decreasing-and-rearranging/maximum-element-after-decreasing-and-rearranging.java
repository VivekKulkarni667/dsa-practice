class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        Arrays.sort(arr);
        arr[0] = 1;

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            if (arr[i] - arr[i - 1] > 1) {

                int sub = arr[i] - (arr[i - 1] + 1);

                arr[i] = arr[i] - sub;

            }

        }

        return arr[n - 1];
    }
}