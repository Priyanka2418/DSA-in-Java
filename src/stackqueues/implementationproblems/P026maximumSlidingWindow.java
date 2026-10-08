/*
Problem :
TC: O(N)
SC: O(K)
 */
package src.stackqueues.implementationproblems;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class P026maximumSlidingWindow {
    public static ArrayList<Integer> maxWindow(int []arr, int k ){
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for(int i =0;i<arr.length;i++){
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);


            while(dq.peekFirst() < i-k+1){
                dq.removeFirst();
            }
            if(i >= k-1 ){
                result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
