class Solution {

    public int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        for (int i = 0; i < rows; i++) {

            int low = 0;
            int high = cols - 1;
            int firstNegative = cols;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (grid[i][mid] < 0) {

                    firstNegative = mid;
                    high = mid - 1;

                } else {

                    low = mid + 1;
                }
            }

            count += cols - firstNegative;
        }

        return count;
    }
}