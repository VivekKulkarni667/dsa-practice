class Solution {
        public int numRescueBoats(int[] arr, int limit) {

        Arrays.sort(arr);  
        int n=arr.length;
        int left =0 , right = n-1; // 0th index halka person , last index bhaari person
        int count =0;

        while(left<=right){  // because sorted array two pointer logic 
        if(arr[left]+arr[right] <= limit){ // ek mota + ek patla <= boat limit

                    left++;
                            right--;
                                }
                                else right--;  // matlab sirf mota person hi jayega
                                count++;
                                }
                                return count; // kitna boat chahiye saare person k liye return kardo 

                                    }
                                    }




                                            
                                                      
