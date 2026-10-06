/*
Problem :Asteroid Collision
TC: O(N)
SC: O(1)
 */
package src.stackqueues.monotonicproblems;

import java.util.Stack;

public class P020AsteroidCollision {
    public int[] collision(int [] arr){
        Stack<Integer> st = new Stack<>();

        for(int x : arr ){
            if(x>0){
                st.push(x);
            }else{
                while (!st.isEmpty() && st.peek()>0 && st.peek()< -x){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()== -x){
                    st.pop();
                } else if (st.isEmpty() || st.peek()<0) {
                    st.push(x);
                }
            }
        }
        int[] result = new int [st.size()];
        for(int i = result.length-1 ;i>=0;i--){
            result[i] = st.pop();
        }
        return result;

    }
    public static void main(String[] args) {

    }
}
