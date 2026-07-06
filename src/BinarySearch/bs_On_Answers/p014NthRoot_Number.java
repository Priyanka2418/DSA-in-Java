/*
Problem: Find the Nth root of number

Optimal Approach---
TC:O(log(M))
SC: O(1)
 */

package src.BinarySearch.bs_On_Answers;

public class p014NthRoot_Number {
    public static int nthRootNumber(int n, int m) {
        int low = 1;
        int high = m;
        while (low <= high) {
            long ans = 1;
            int mid = low + (high - low) / 2;
            for (int i = 0; i < n; i++) {
                ans *= mid;
                if (ans > m) break;
            }
            if (ans == m) return mid;
            else if (ans < m) {
                low = mid + 1;
            }

            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = nthRootNumber(2, 81);
        System.out.println(result);
    }
}
