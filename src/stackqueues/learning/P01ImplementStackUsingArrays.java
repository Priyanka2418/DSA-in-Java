/*
Problem : Implement Stack using Array
TC: O(1) for all operations (push, pop, top, isEmpty).
SC: O(N), where N is the maximum capacity of the stack
 */
package src.stackqueues.learning;

import java.util.*;

public class P01ImplementStackUsingArrays {
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    public P01ImplementStackUsingArrays(int size){
        capacity =size;
        stackArray = new int [capacity];
        topIndex = -1;
    }
    public P01ImplementStackUsingArrays(){
        this(1000);
    }

    public void push (int x){
        if(topIndex>=capacity-1){
            System.out.println("stack over-flow");
            return;
        }
        stackArray[++topIndex] = x;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            // Return invalid value
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    /* Returns true if the
       stack is empty, false otherwise */
    public boolean isEmpty() {
        return topIndex == -1;
    }
    public static void main(String[] args) {
        P01ImplementStackUsingArrays stack = new P01ImplementStackUsingArrays();
        List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10), Arrays.asList(), Arrays.asList(), Arrays.asList());

        for (int i = 0; i < commands.size(); ++i) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print((stack.isEmpty() ? "true" : "false") + " ");
                    break;
                case "ArrayStack":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
