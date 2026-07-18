/*
 * Problem: Search a 2D Matrix II (LeetCode 240)
 *
 * Approach: Traverse each row and perform Binary Search only if the target
 * lies within the row's range.
 *
 * Time Complexity: O(row * log(col))
 * Space Complexity: O(1)
 */

package src.BinarySearch.bs_on_2D_Arrays;

public class p030Searchin2Dmatrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col =matrix[0].length;

        for(int i =0;i<row;i++){
            if(matrix[i][0]<=target && target<=matrix[i][col-1]){
                if(binarySearch(matrix[i], target))
                    return true;
            }
        }
        return false;
    }

    public boolean binarySearch(int matrix[], int target){
        int n =matrix.length;
        int low =0;
        int high = n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid]==target)
                return true;
            else if(matrix[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
