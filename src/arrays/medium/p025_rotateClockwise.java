package src.arrays.medium;

public class p025_rotateClockwise {
    public static void rotateClockwise(int nums[][]){
        int n =nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int temp= nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
        for(int i =0;i<n;i++){
            int left =0, right=n-1;
            while(left<right){
                int temp =nums[i][left];
                nums[i][left]=nums[i][right];
                nums[i][right]=temp;
                right--;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateClockwise(matrix);
        for(int row[]:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
