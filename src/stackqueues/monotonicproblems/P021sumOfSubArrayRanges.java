package src.stackqueues.monotonicproblems;

import java.util.Stack;

public class P021sumOfSubArrayRanges {
    public static int subArrayRanges(int []arr){
        Stack<Integer> st = new Stack<>();
        int n =arr.length;
        int[] leftMin = new int[n], rightMin = new int[n];
        int[] rightMax = new int[n], leftMax = new int [n];


        //left-Minimums
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }

            leftMin[i] = st.isEmpty() ?  i+1 : i - st.peek();
            st.push(i);
        }
        st.clear();


        //right minimum
        for(int i =n- 1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i] ){
                st.pop();
            }
            rightMin[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }
        st.clear();

        //left-max

        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            leftMax[i] = st.isEmpty() ? i+1 : i- st.peek();
            st.push(i);
        }
        st.clear();

        //right-max
        for(int i = n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            rightMax[i] = st.isEmpty() ? n-i : st.peek()-i;
            st.push(i);
        }

        long  totalSum = 0;
        for(int i =0;i<n;i++){
            long maxContri = (long) leftMax[i] * rightMax[i] * arr[i];
            long minContri = (long) leftMin[i] * rightMin[i] * arr[i];
            totalSum += (maxContri - minContri);
        }
        return (int)totalSum ;
    }
    public static void main(String[] args) {

    }
}
