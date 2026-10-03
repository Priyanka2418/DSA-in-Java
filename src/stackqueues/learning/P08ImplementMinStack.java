
package src.stackqueues.learning;

import java.util.Stack;

public class P08ImplementMinStack {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void push(int x){
        if(st1.isEmpty() && st2.isEmpty()){
            st1.push(x);
            st2.push(x);
        }else{
            st1.push(x);
            st2.push(Math.min(x , st2.peek()));
        }
    }
    public void pop(){
        if(st1.isEmpty()){
            return;
        }else{
            st1.pop();
            st2.pop();
        }
    }
    public int peek(){
        if(st1.isEmpty()){
            return -1;
        }else{
           return st1.peek();
        }
    }

    public boolean isEmpty(){
        if(st1.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public int getMin(){
        if(st1.isEmpty()){
            return -1;
        }
        else{
            return st2.peek();
        }
    }


    public static void main(String[] args) {
        P08ImplementMinStack st = new P08ImplementMinStack();

        st.push(5);
        st.push(3);
        st.push(7);
        st.push(2);
        st.push(8);

        System.out.println(st.getMin());

        st.pop();
        System.out.println(st.getMin());

        st.pop();
        System.out.println(st.getMin());

        System.out.println(st.peek());
    }
}
