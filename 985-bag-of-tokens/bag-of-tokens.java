/*
ALGORITHM

1. Sort all tokens.
2. Use two pointers:
      left  -> smallest token
      right -> largest token
3. If power is enough:
      buy smallest token
      gain 1 score
4. Otherwise if score > 0:
      sell largest token
      gain power
5. Track maximum score obtained.
6. Return maximum score.

TIME COMPLEXITY : O(n log n)
SPACE COMPLEXITY : O(1)
*/

class Solution
{
    public int bagOfTokensScore(int[] tokens, int power)
    {
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;
        int score = 0;
        int maxScore = 0;

        while(left <= right)
        {
            if(power >= tokens[left])
            {
                power -= tokens[left];

                score++;

                maxScore =
                    Math.max(maxScore, score);

                left++;
            }

            
            else if(score > 0)
            {
                power += tokens[right];

                score--;

                right--;
            }
            else
            {
                break;
            }
        }

        return maxScore;
    }
}
