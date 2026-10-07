/*
Problem : largest Rectangle In Histogram
TC: O(N)
SC: O(N)
 */
package src.stackqueues.monotonicproblems;

import java.util.Stack;

public class P023largestRectangleInHistogram {
    public static int maxArea(int arr[]){

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
