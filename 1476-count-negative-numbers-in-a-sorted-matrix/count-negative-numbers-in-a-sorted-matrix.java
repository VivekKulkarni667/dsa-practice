class Solution {
    public int countNegatives(int[][] mat) {
         int n=mat.length;
        int count=0;
        for(int i=0; i<n; i++){
    {
        for(int j=0; j<mat[i].length; j++)
            if(mat[i][j] < 0) count++;
    }
    }
    
    return count;
        
    }
}
        

