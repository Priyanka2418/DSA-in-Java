package src.arrays.medium;//PROBLEM: Find the Majority Element that occurs more than N/2 times
/*
Brute force: using nested loop
TC: O(n)^2
SC: O(1)

Better Approach: using hashmap
TC: O(n)
SC: O(n)

Optimal Approach (Moore's Voting Algorithm):
TC: O(n)
SC: O(1)
 */

public class p017_majorityElement {
    public static int majorityElement(int arr[]) {
        int n = arr.length;
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else count--;
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count1++;
            }
        }
        if (count1 > n / 2) {
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("the majority element is: " + majorityElement(arr) );
    }
}
