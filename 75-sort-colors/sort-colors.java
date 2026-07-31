class Solution {
    public void sortColors(int[] arr) {
int n = arr.length;
int nof_zero = 0, nof_one = 0, nof_two = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                nof_zero++;
            else if (arr[i] == 1)
                nof_one++;
            else
                nof_two++;
        }

        

        for (int i = 0; i < nof_zero; i++) {
            arr[i] = 0;
        }

        for (int i = nof_zero; i < nof_zero + nof_one; i++) {
            arr[i] = 1;
        }

        for (int i = nof_zero + nof_one; i < n; i++) {
            arr[i] = 2;
        }
    }
}