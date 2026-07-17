package src.BinarySearch.bs_on_2D_Arrays;

public class p029Serachin2Dmatrix {
    public boolean binarySearch(int []nums, int target){
        int n =nums.length;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]==target)
                return true;
            else if (target>nums[mid]) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][]matrix, int target){
        //no.of rows
        int n =matrix.length;

        //no.of columns
        int m =matrix[0].length;

        for(int i =0;i<n;i++){
            if(matrix[i][0]<=target && target<=matrix[i][m-1]){
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        p029Serachin2Dmatrix obj = new p029Serachin2Dmatrix();
        if(obj.searchMatrix(matrix, 34))
            System.out.println("true");
        else System.out.println("false");
    }
}
