class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n =arr.length;
     int current =0;
     int max=0;

        for(int i=0; i<n; i++){
           
            if(arr[i]==1)
            current++;
            
            else
            current =0;
            

            if(current>max)
            max=current;
            

        }
            
        
        return max;
}
    
    }
    

    
