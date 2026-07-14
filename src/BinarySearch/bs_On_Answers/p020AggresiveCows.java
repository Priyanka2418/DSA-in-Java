/*
Problem:Aggresive Cows

Optimal_Solution:
TC: O(NlogN) + O(N * log(max(stalls[])-min(stalls[])))
SC:0(1)
 */

package src.BinarySearch.bs_On_Answers;

import java.util.Arrays;
public class p020AggresiveCows {

    public boolean canPlace(int[] stalls, int cows, int d) {
        int count = 1;
        int lastpos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastpos >= d) {
                count++;
                lastpos = stalls[i];
            }
            if (count >= cows) return true;
        }
        return false;
    }

    public int maxPossibleMinDistance(int stalls[], int cows) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;
        p020AggresiveCows obj = new p020AggresiveCows();

        int result = obj.maxPossibleMinDistance(stalls,cows);
        System.out.println(result);
    }
}
