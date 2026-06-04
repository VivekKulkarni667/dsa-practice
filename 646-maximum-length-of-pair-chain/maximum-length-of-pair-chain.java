class Solution {
    public int findLongestChain(int[][] pairs) {

        /*
Sort by end

Keep first pair

currentEnd = end of kept pair

count = 1

For every next pair

start > currentEnd
-> non-overlapping
-> keep pair
-> count++
-> currentEnd = pair end

start <= currentEnd
-> overlap
-> skip pair

Return count
*/

Arrays.sort(pairs,(a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int currentEnd = pairs[0][1];

        for(int i = 1; i < pairs.length; i++)
            if(pairs[i][0] > currentEnd)
     {       count++;
             currentEnd = pairs[i][1];
            }

        return count;









        
    }
}