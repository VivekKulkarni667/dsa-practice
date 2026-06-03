class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

/*
Sort by end

Keep first interval

currentEnd = end of kept interval

For every next interval

start < currentEnd
    -> overlap
    -> remove current interval

start >= currentEnd
    -> no overlap
    -> keep current interval
    -> currentEnd = current interval end

Return removed
*/

        Arrays.sort(intervals,
                (a, b) -> Integer.compare(a[1], b[1]));

        int removed = 0;
        int currentEnd = intervals[0][1];

        for(int i = 1; i < intervals.length; i++)
            if(intervals[i][0] < currentEnd)
                removed++;
            else
                currentEnd = intervals[i][1];

        return removed;
    }
}


    




        
    