package src.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class p026_spiralOrder {
    public List<Integer> spiralOrder(int nums[][]){
        List result = new ArrayList<>();
        int top =0;  //starting row
        int bottom =nums.length-1; //ending row
        int left =0; //starting col
        int right=nums[0].length-1;  //ending col

        while(top<=bottom && left<=right){
            for(int i =left;i<=right;i++){
                result.add(nums[top][i]);
            }
            top++;

            for(int i =top;i<=bottom;i++){
                result.add(nums[i][right]);
            }
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(nums[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i =bottom;i>=top;i--){
                    result.add(nums[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        p026_spiralOrder obj= new p026_spiralOrder();
        int [][]matrix={
                { 1,  2,  3,  4 },
                { 5,  6,  7,  8 },
                { 9, 10, 11, 12 },
                { 13,14, 15, 16 }
        };
        List ans = obj.spiralOrder(matrix);
        System.out.println(ans);
    }
}
