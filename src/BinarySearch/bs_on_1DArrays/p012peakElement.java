//Problem: Peak Element

package src.BinarySearch.bs_on_1DArrays;

public class p012peakElement {
    public static int peakElement(int arr[]){
        int low =0;
        int high = arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("peak Element: " + peakElement(nums) );
    }
}
