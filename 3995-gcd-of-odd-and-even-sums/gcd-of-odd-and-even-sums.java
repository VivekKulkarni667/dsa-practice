class Solution {
    public int gcdOfOddEvenSums(int n) {

//         int sumEven = 0;
//         int sumOdd = 0;

//         for (int i = 1; i < 2 * n; i += 2) {
//             sumOdd += i;
//         }

//           for (int i = 2; i <= 2 * n; i += 2) {
//             sumEven += i;
//         }

//         if (sumOdd % n == 0 && sumEven % n == 0) {
//             return n;
//         }

//         return -1;
//     }
// }






// optimized



        /*
        Observations:

        Sum of first n odd numbers = n²

        Sum of first n even numbers = n * (n + 1)

        Therefore:
        GCD(n², n * (n + 1))
        = n * GCD(n, n + 1)

        n and n + 1 are consecutive numbers,
        so GCD(n, n + 1) = 1

        Therefore:
        GCD = n * 1 = n
        */

        return n;
    }
}