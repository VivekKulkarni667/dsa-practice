class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n = arr.length;
        int total=0;
        for(int i=0; i<n; i++)
         total+=arr[i];
         int left=0;//pehle zero hhi rahega
         int[] ans = new int[n];
         for(int j=0; j<n; j++)
{

    ans[j]=Math.abs(left-(total-left-arr[j]));  // right sum is  total-left-cuurent
    left+=arr[j];
}
        return ans;

        
    }
}