/*
Problem : Reverse a stack using recursion
TC: O(n²), as each element is popped and inserted at the bottom (O(n) per element).
SC: O(n), as only the recursion stack is used.
 */
package src.recursion.easy_medium_questions;

import java.util.Stack;

public class p05ReverseStack {
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int val = stack.pop();
        reverseStack(stack);;
        insert(stack, val);
    }
    public static void insert(Stack<Integer> stack, int temp){
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }
        int topVal = stack.pop();
        insert(stack, temp);
        stack.push(topVal);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);

        // Reverse the stack
        p05ReverseStack.reverseStack(st);

        // Print the reversed stack
        System.out.print("Reversed Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
    }
