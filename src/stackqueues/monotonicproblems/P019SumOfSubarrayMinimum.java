/*
Problem : Sum Of SubArray Minimums
TC: O(N)
SC: O(N)
 */
package src.stackqueues.monotonicproblems;

import java.util.Stack;

public class P019SumOfSubarrayMinimum {
    public static int subSumArray(int[]arr){
        int n = arr.length;
        int left[] = new int [n];
        int right [] =new int [n];

        Stack<Integer> st = new Stack<>();

        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = i+1;
            }else{
               left[i] =  i-st.peek();
            }
            st.push(i);
        }
        st.clear();

        for(int i =n-1 ;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] = n-i;
            }else{
                right[i] = st.peek() -i;
            }
            st.push(i);
        }
        long ans =0;
        for(int i =0;i<n;i++){
            ans+= (long) arr[i] * left[i] * right[i];
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(subSumArray(arr));
    }
}
