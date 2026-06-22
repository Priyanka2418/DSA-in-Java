/*
Problem: Kadane's Algorithm : Maximum Subarray Sum in an Array

Brute Force:
TC: O(n³) | SC: O(1)
Generate every subarray and compute its sum separately.

Better Approach:
TC: O(n²) | SC: O(1)
Use a running sum inside the inner loop to avoid recomputing sums.

Kadane's Algorithm: It is an efficient technique used to find the maximum sum of a contiguous subarray within a
                    given array in O(n) time and O(1) extra space.It cleverly tracks only what is necessary.
                    If the running sum becomes negative, it no longer contributes positively to any future subarray.
                    Therefore, it is discarded, and a new subarray is initiated from the current element to
                    maximize the potential sum of subsequent subarrays.
                    TC: O(n) | SC: O(1)


 */
public class p018_maxSubArray {
    public static int maxSubArray(int nums[]) {
        long maxElement = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxElement) {
                maxElement = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) maxElement;
    }
    //TC: O(n)
    //SC: O(1)

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("the maximum subarray is: " + maxSubArray(arr) );
    }
}
