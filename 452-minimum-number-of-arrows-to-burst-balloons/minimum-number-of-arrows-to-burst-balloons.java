class Solution
{
    public int findMinArrowShots(int[][] points)
    {
     /*
Sort by end

arrows = 1

arrowPos = end of first balloon

For every next balloon

start > arrowPos
-> current arrow cannot burst it
-> arrows++
-> arrowPos = current balloon end

start <= arrowPos
-> current arrow already bursts it

Return arrows
*/

 Arrays.sort(points,
                (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int arrowPos = points[0][1];

        for(int i = 1; i < points.length; i++)
            if(points[i][0] > arrowPos)
            {
                arrows++;
                arrowPos = points[i][1];
            }

        return arrows;
    }
}