/*
Problem: Sort a Stack
TC: O(n2), where n is the number of elements in the stack.
SC: O(n), due to the recursion stack.
 */
package src.recursion.easy_medium_questions;

import java.util.Stack;

public class p04SortStackUsingRecursion {
    public void insert(Stack<Integer>stack , int temp){
        if(stack.isEmpty() || stack.peek()<=temp){
            stack.push(temp);
            return;
        }
        int val =stack.pop();
        insert(stack,temp);

        stack.push(val);
    }
    public void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insert(stack, temp);
        }
    }
    public static void main(String[] args) {
        p04SortStackUsingRecursion sol = new p04SortStackUsingRecursion();
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sol.sortStack(stack);


        System.out.print("Sorted stack : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
