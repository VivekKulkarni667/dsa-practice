class Solution {
    public int countNegatives(int[][] arr) {
        int count = 0;
        int cols = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = cols - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (arr[i][mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            count += cols - left;
        }

        return count;
    }
}