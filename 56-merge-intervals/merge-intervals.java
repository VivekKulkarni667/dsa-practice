
class Solution
{
    public int[][] merge(int[][] intervals)
    {
        // Input:
        // [[1,3],[2,6],[8,10],[15,18]]



        // Sort intervals based on starting point

        // Before:
        // [[8,10],[1,3],[2,6]]

        // After:
        // [[1,3],[2,6],[8,10]]

        // Why?
        // So overlapping intervals come near each other.

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);



        // Stores final merged intervals

        List<int[]> result = new ArrayList<>();



        // Take first interval as current interval

        // intervals[0] = [1,3]

        // current = [1,3]

        // Why?
        // We need one interval against which
        // all upcoming intervals will be checked.

        int[] current = intervals[0];



        // Start from second interval

        for (int i = 1; i < intervals.length; i++)
        {
            // Example:
            // current = [1,3]
            // intervals[i] = [2,6]



            // Check overlap

            // intervals[i][0]
            // = next interval start

            // current[1]
            // = current interval end

            // 2 <= 3

            if (intervals[i][0] <= current[1])
            {
                // Overlap found

                // current = [1,3]
                // next    = [2,6]

                // max(3,6)=6

                // current becomes [1,6]

                current[1] =
                    Math.max(current[1], intervals[i][1]);
            }
            else
            {
                // No overlap

                // Example:

                // current = [1,6]
                // next    = [8,10]

                // 8 <= 6 ? false

                // Current interval is complete.

                // Store it.

                result.add(current);



                // Start a new interval group.

                current = intervals[i];

                // current = [8,10]
            }
        }



        // Very Important

        // After loop ends:

        // result = [[1,6],[8,10]]

        // current = [15,18]

        // Problem:
        // [15,18] is not yet stored.

        // Why?
        // It never got a chance to enter else block.

        // Therefore manually add it.

        result.add(current);



        // Current type:

        // result = List<int[]>

        // Example:
        // [
        //   [1,6],
        //   [8,10],
        //   [15,18]
        // ]

        // But function must return:

        // int[][]

        // Therefore convert
        // List<int[]> --> int[][]

        return result.toArray(new int[result.size()][]);



        // Final Output:

        // [[1,6],[8,10],[15,18]]
    }
}