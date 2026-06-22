class Solution
{
public int lengthOfLongestSubstring(String s)
{
// Stores unique characters of current window
HashSet set = new HashSet<>();

// Left boundary of window
int left = 0;

// Stores longest substring length found
int max = 0;

// Expand window by moving right pointer
for(int right = 0; right < s.length(); right++)
{


char ch = s.charAt(right);  // get character at right

// If current character is already in the window,
// shrink the window from the left until the duplicate is removed
while(set.contains(ch))
{
    // Remove leftmost character
    set.remove(s.charAt(left));

    // Move left pointer forward
    left++;
}


// Add current character after removing any duplicate so the window remains unique
set.add(ch);

// Calculate current window length.
// Number of characters between left and right (inclusive)
// Example: if left = 2 and right = 5, the window is indices 2,3,4,5,
// so length = 5 - 2 + 1 = 4.
int len = right - left + 1;

// Update maximum length found
max = Math.max(max, len);

}

// Return longest substring length
return max;

}

}
