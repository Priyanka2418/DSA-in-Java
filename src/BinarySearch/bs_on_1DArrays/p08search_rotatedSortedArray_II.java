/*
Problem: Search in Rotated Sorted Array II

Brute Force:
TC: O(n)
SC: O(1)

Optimal:
Average TC: O(log n)
Worst TC: O(n)
SC: O(1)
*/

package src.BinarySearch.bs_on_1DArrays;

public class p08search_rotatedSortedArray_II {
    public static boolean searchSortedII(int arr[], int target){
        int low =0;
        int high =arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target)return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1; // Search left
                } else {
                    low = mid + 1;  // Search right
                }
            }
            else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;  // Search right
                } else {
                    high = mid - 1; // Search left
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;

        System.out.println(searchSortedII(arr,k));

    }
}
