class Solution
{
    public int findMinArrowShots(int[][] points)
    {
        // Sort balloons by their ending coordinate
        Arrays.sort(points,
                (a, b) -> Integer.compare(a[1], b[1]));

        // One arrow is needed for the first group of overlapping balloons
        int arrows = 1;

        // Place the arrow at the end of the first balloon
        // This gives the maximum chance of hitting future balloons
        int arrowPos = points[0][1];

        for(int i = 1; i < points.length; i++)
        {
            // If current balloon starts after the arrow position,
            // it does not overlap with the current group
            if(points[i][0] > arrowPos)
            {
                // Start a new group, so one more arrow is needed
                arrows++;

                // Place the new arrow at the end of this balloon
                arrowPos = points[i][1];
            }

            // Else:
            // Current balloon overlaps with the current group
            // The existing arrow already bursts it
        }

        return arrows;
    }
}