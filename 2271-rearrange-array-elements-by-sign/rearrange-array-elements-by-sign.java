class Solution {
    public int[] rearrangeArray(int[] arr) {
        int negative =1;
        int positive=0;
        int n=arr.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            if(arr[i]<0){ 
            ans[negative]=arr[i];
            negative+=2;
            }

           else
            {
                ans[positive]=arr[i];
                positive+=2;
            }
            }
        

     
 
        return ans;


    }
}