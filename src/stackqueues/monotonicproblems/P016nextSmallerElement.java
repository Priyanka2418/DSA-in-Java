/*
/*
Problem : Next smaller element
TC: O(N)
SC: O(N)
 */
package src.stackqueues.monotonicproblems;

import java.util.ArrayList;
import java.util.Stack;

public class P016nextSmallerElement {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        Stack<Integer> nextSmaller =  new Stack<>();

        Stack<Integer> res = new Stack<>();

        for(int i = arr.length-1; i>=0 ; i-- ){
            while(!nextSmaller.isEmpty() && nextSmaller.peek()>= arr[i]){
                nextSmaller.pop();
            }
            if(!nextSmaller.isEmpty()){
                res.push(nextSmaller.peek());
            }else{
                res.push(-1);
            }
            nextSmaller.push(arr[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i =0;i<arr.length;i++){
            result.add(res.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 0, 7, 4};

        ArrayList<Integer> result = nextSmallerEle(arr);

        System.out.println(result);
    }
}
