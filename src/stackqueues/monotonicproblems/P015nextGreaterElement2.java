/*
Problem : Next greater element in a Circular Array
TC:
SC:
 */
package src.stackqueues.monotonicproblems;

import java.util.ArrayList;
import java.util.Stack;

public class P015nextGreaterElement2 {
    public static ArrayList<Integer> nextGreater(int []arr) {

        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        Stack<Integer> ans = new Stack<>();


        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = arr[i % n];
            while (!ans.isEmpty() && ans.peek() <= curr) {
                ans.pop();
            }
            if (i < n && !ans.isEmpty()) {
                res[i] = ans.peek();
            }
            ans.push(curr);
        }
            ArrayList<Integer> result = new ArrayList<>();
            for (int val : res) {
                result.add(val);
            }

            return result;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 2, 6};
        ArrayList<Integer> ans = nextGreater(arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
