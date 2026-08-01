class Solution {
    public int reverse(int n) {
int reversed=0,digit=0;
        while(n!=0){

            
             digit = n%10;
             
        if(reversed>Integer.MAX_VALUE/10|| reversed<Integer.MIN_VALUE/10) return 0;
 
        reversed = reversed*10 +digit;
            n=n/10;
        
        }
   
      
        return reversed;  
    }
}