/*
 * Problem: Find the Smallest Divisor Given a Threshold
 * Approach: Binary Search on the answer (divisor).
 * TC: O(n * log(maxElement))
 * SC: O(1)
 */

package src.BinarySearch.bs_On_Answers;

import java.util.Arrays;

public class p017samllestDivisor {
    public static int smallestDivsior(int arr[], int limit){
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while (low<=high){
            int mid = (low+high)/2;
            if(isPossible(arr, mid)<=limit){
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int isPossible(int arr[], int divisor){
        int sum =0;
        for(int num:arr){
            sum+=Math.ceil((double)num/divisor);
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
