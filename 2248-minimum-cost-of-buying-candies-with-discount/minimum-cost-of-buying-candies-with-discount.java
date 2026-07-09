class Solution {
    public int minimumCost(int[] arr) {

        Arrays.sort(arr);// sorted in ascending but using reverse ( larger to smaller )
        int n=arr.length;
        int cost =0;
    
        for(int i=n-1; i>=0; i-=3){ 
            // take group of 3 

            cost +=arr[i]; 
            if(i>0) 
// in group of 3 , i-1 exists and if 10 elem , group of 3 , 1 remains that 1 is when condition fails 
           cost += arr[i-1];
        }
        
        return cost;
        
        }
      }
