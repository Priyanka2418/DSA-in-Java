/*
 * Problem: Find a Peak Element II (LeetCode 1901)
 *
 * Approach: Apply Binary Search on columns. Find the maximum element in the
 * middle column and compare it with its left and right neighbors to decide
 * the search direction until a peak is found.
 *
 * Time Complexity: O(rows * log(cols))
 * Space Complexity: O(1)
 */

package src.BinarySearch.bs_on_2D_Arrays;

public class p031findPeakElement_II {
    public int maxElement(int[][]mat, int col){
        int n =mat.length;
        int max= Integer.MIN_VALUE;
        int index=-1;

        for(int i =0;i<n ;i++){
            if(mat[i][col]>max){
                max= mat[i][col];
                index=i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int row= mat.length;
        int col = mat[0].length;

        int low =0;
        int high =col-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int r = maxElement(mat, mid);

            int left = mid-1>=0?mat[r][mid-1]:Integer.MIN_VALUE;
            int right = mid+1<col?mat[r][mid+1]:Integer.MIN_VALUE;

            if(mat[r][mid]>left && mat[r][mid]>right){
                return new int[]{r,mid};
            }else if (left>mat[r][mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {

    }
}
