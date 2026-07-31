class Solution {
    public void moveZeroes(int[] arr) {
// my logic 
        int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i] == 0) {
        //         int j = i + 1;
        //         // Find the next non-zero element
        //         while (j < n && arr[j] == 0) {
        //             j++;
        //         }
        //         // No non-zero element found
        //         if (j == n) {
        //             break;
        //         }
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }
        // }




// optimized 
 int k=0;
 for(int i=0; i<n; i++){
    if(arr[i] !=0){

        int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;


k++;

    }
 }














    }
}