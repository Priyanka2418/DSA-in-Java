/*
TC: O(N)
SC: O(N)
*/
package src.stackqueues.monotonicproblems;

import java.util.ArrayList;
import java.util.Stack;

public class P014nextGraterElement {
    public static ArrayList<Integer> nextGreaterElement(int [] arr){
        Stack<Integer> ans = new Stack<>();
        Stack<Integer> findNext =  new Stack<>();

        ArrayList<Integer> result = new ArrayList<>();

        for(int i =arr.length-1; i>=0;i--){
          while(!findNext.isEmpty() && findNext.peek()<= arr[i]){
              findNext.pop();
          }
          if(findNext.isEmpty()){
              ans.push(-1);
          }else{
              ans.push(findNext.peek());
          }
          findNext.push(arr[i]);
        }
        while (!ans.isEmpty()){
            result.add(ans.pop());
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {6, 8, 0, 1, 3};
        System.out.println(nextGreaterElement(arr));

    }
}
