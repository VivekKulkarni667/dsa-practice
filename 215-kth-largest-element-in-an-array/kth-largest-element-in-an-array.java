class Solution {

    public int findKthLargest(int[] arr, int k) {
int n=arr.length;
        java.util.Arrays.sort(arr);

        return arr[n - k];
    }
}