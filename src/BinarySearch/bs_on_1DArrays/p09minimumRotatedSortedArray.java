// Problem: Minimum in Rotated Sorted Array
//
// Brute Force:
// Traverse the array to find the minimum element.
// TC: O(N)
// SC: O(1)
//
// Optimal (Binary Search):
// Eliminate the sorted half while tracking the minimum.
// TC: O(log N)
// SC: O(1)

package src.BinarySearch.bs_on_1DArrays;

public class p09minimumRotatedSortedArray {
    public static int findMinimum(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid =low+(high-low)/2;
            if(arr[mid]<arr[high]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("The minimum element in an array is: " + findMinimum(nums));
    }
}
