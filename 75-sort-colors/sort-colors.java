class Solution {

     public void swap( int[] arr , int a , int b){
            int temp =arr[a];
            arr[a]= arr[b];
            arr[b] = temp;
        }
        

    public void sortColors(int[] arr) {
       
int n = arr.length;
// int nof_zero = 0, nof_one = 0, nof_two = 0;

//         for (int i = 0; i < n; i++) {
//             if (arr[i] == 0)
//                 nof_zero++;
//             else if (arr[i] == 1)
//                 nof_one++;
//             else
//                 nof_two++;
//         }

//         for (int i = 0; i < n; i++) {
//             if(i<nof_zero) arr[i] = 0;
//             else if ( i<nof_zero + nof_one) arr[i] =1;
//             else arr[i]=2;

//         }


        
// optimal soultion : one pass solution 


int low =0 , high = n-1 , mid =0;
while(mid<=high){

if(arr[mid]==0){
swap(arr,low,mid);
low++; mid++;
}

else if(arr[mid]==1) mid++;
else {swap(arr ,mid , high); high--; }
}












    }
}