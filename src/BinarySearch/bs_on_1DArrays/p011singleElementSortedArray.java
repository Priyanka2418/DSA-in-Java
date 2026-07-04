// Problem: Single Element in a Sorted Array
//
// Brute Force:
// Traverse the array and find the element appearing once.
// TC: O(N)
// SC: O(1)
//
// Optimal (Binary Search):
// Use the even/odd index pairing pattern to determine which half
// contains the single element and eliminate the other half.
// TC: O(log N)
// SC: O(1)
package src.BinarySearch.bs_on_1DArrays;

public class p011singleElementSortedArray {
    public static int singleElement(int arr[]) {
        int n = arr.length - 1;
        if (arr.length == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n] != arr[n - 1]) return arr[n];

        int low = 1;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
                    (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("The single element in the array is: "+ singleElement(arr));
    }
}

