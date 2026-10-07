/*
Problem : Maximum Rectangle
TC: O(R*C)
SC: O(C)
 */
package src.stackqueues.monotonicproblems;

import java.util.Stack;

public class P024MaximumRectangle {
    public static int maxRectangle(int[][]mat){

        int row = mat.length;
        int col =mat[0].length;

        int maxArea = 0;
        int height[] = new int [col];

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                if(mat[i][j]==1){
                    height[j]++;
                }else {
                    height[j] = 0 ;
                }
            }
            maxArea = Math.max(maxArea, getMaxArea(height));
        }
        return maxArea;
    }

    public static int getMaxArea(int arr[]){

        int maxArea = 0;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int height = arr[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                int width = right-left -1;
                maxArea =Math.max(maxArea, height* width);
            }
            st.push(i);
        }

        while (!st.isEmpty()){
            int height = arr[st.pop()];
            int right = arr.length;
            int left = st.isEmpty()? -1 : st.peek();
            int width = right - left -1 ;
            maxArea = Math.max(maxArea , height* width);
        }
        return maxArea;
    }
    public static void main(String[] args) {

    }
}
