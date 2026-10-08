/*
Problem : Stock Span Problem
TC:  O(N)
SC: O(N)
 */
package src.stackqueues.monotonicproblems;

import java.util.ArrayList;
import java.util.Stack;

public class P025stockSpanProblem {
    public static ArrayList<Integer> calculateSpan(int []arr){

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
                result.add(i+1);
            }else{
                result.add(i - st.peek());
            }
            st.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
    }
}
