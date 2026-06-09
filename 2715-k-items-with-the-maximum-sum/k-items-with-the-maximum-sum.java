class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

/*
        ALGORITHM

        1. First pick all possible 1's because they increase sum.
        2. If k is still left, pick 0's because they do not decrease sum.
        3. If k is still left, pick -1's because no other choice remains.
        4. Return the final sum.
*/
 
 if(k<=numOnes)
 {
    return k;  
    // jitna k hai utna 1 add hoga k banke retrun kar do takes only 1's sum=k
 }

if(k<=numOnes+numZeros)
{
    return numOnes;
}


//matalab k bada hai total no of 0's and 1's se to wo negative bhi lega
return numOnes - (k - numOnes - numZeros);

// sum - (k- 1's and 0's ) that is -1's

        
    }
}