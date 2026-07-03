/*
Problem: Search in Rotated Sorted Array I

Brute Force:
TC: O(n)
SC: O(1)

Optimal:
TC: O(log n)
SC: O(1)
*/

package src.BinarySearch.bs_on_1DArrays;

public class p07search_rotatedSortedArray_I {
    public static int searchSortedArray_I(int arr[],int target){
        int low=0;
        int high = arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
                //left half is sorted
            } else if (arr[low]<=arr[mid]) {
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
                //right part is sorted
            }else{
                if(arr[mid]<target && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 8;
        System.out.println("target index is: "+ searchSortedArray_I(nums,target));
    }
}
