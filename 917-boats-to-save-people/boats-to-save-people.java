class Solution {
    public int numRescueBoats(int[] arr, int limit) {


Arrays.sort(arr);
int n=arr.length;
int left =0 , right = n-1; // 0th index halka person , last index bhaari person
int count =0;

while(left<=right){
    if(arr[left]+arr[right] <= limit){

        left++;
        right--;
    }
else right--;

count++;

}


return count;


    }
}




        
          