// Problem: Find Number of Rotations in a Rotated Sorted Array
//
// Brute Force:
// Find the minimum element by traversing the array.
// TC: O(N)
// SC: O(1)
//
// Optimal (Binary Search):
// Find the minimum (pivot); its index is the rotation count.
// TC: O(log N)
// SC: O(1)

package src.BinarySearch.bs_on_1DArrays;

public class p010findRotations {
    public static int countRotations(int nums[]){
        int low=0;
        int high =nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,6,8,9};
        System.out.println("Total no. of rotations: " + countRotations(arr) );
    }
}
