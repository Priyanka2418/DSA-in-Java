/*
 * Problem: Matrix Median
 *
 * Approach: Apply Binary Search on the value range. For each mid, count the
 * elements less than or equal to mid using Binary Search in every row. Adjust
 * the search range until the median is found.
 *
 * Time Complexity: O(log(max - min) * row * log(col))
 * Space Complexity: O(1)
 */

package src.BinarySearch.bs_on_2D_Arrays;

public class p032MatrixMedian {

    public int binarySearch(int []arr, int mid ){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int  m =(low+high)/2;
            if(arr[m]<=mid ){
                low=m+1;
            }else {
                high=m-1;
            }
        }
        return low;
    }

    public int findMedian(int[][]matrix){
        int row=matrix.length;
        int col = matrix[0].length;

        int low = matrix[0][0];
        int high = matrix[0][col-1];
        for(int i =0;i<row;i++){
            low= Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][col-1]);
        }
        while(low<=high){
            int mid =(low+high)/2;
            int count =0;
            for(int i =0;i<row;i++){
                count+=binarySearch(matrix[i], mid);
            }
            if(count<(row*col+1)/2)
                low=mid+1;
            else{
                high=mid-1;
            }
        }
        return  low;
    }
    public static void main(String[] args) {

    }
}
