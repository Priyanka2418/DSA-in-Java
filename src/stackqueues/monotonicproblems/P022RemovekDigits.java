/*
Problem : Remove K Digits
TC: O(N)
SC: O(N)
 */
package src.stackqueues.monotonicproblems;


import java.util.Stack;

public class P022RemovekDigits {
    public String removeKdig(String s , int k ){
        if(k>= s.length()) return "0";

        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            while(!st.isEmpty() && st.peek()> s.charAt(i) && k>0){
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
