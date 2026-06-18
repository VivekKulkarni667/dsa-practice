class Solution {
    public String breakPalindrome(String str) {
        int n = str.length();
        if (n == 1) {
            return "";  
        }
        // one letter is always palindrome no way to make it non-palindrome
        
        char[] arr = str.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return new String(arr);
            }
            //if not a make the first one 'a'
        }


        arr[n - 1] = 'b';
        return new String(arr);

        //if all aaaaaa then make last 'a' --> 'b' [ lexicographically smaller non palindrome]
    }
}




        
