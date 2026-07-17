/*
 * Problem: Find the Row with Maximum Number of 1s
 *
 * Approach: For each row, use Binary Search (Lower Bound) to find the first occurrence
 * of 1. The row with the highest count of 1s is the answer.
 *
 * Time Complexity: O(n * log m)
 * Space Complexity: O(1)
 */

package src.BinarySearch.bs_on_2D_Arrays;

public class p028FindRow_Maximum1s {
    public static int lowerBound(int []arr, int n,int x){
        int low=0;
        int high =n-1;
        int ans =n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int rowWithMtarix(int[][]matrix, int row, int col){
        int countMax=0;
        int index=-1;
        for(int i =0;i<row;i++){
            int countOnes=col-lowerBound(matrix[i],col ,1 );
                if(countOnes>countMax){
                    countMax=countOnes;
                    index=i;
                }
        }
        return index;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        int n = 3, m = 3;

        System.out.println(rowWithMtarix(matrix,n , m));
    }
}
