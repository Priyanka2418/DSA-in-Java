package src.stackqueues.learning;

import java.util.Stack;

public class P07BalancedParenthesis {
    public boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(char ch :s.toCharArray()){
            if(ch == '(' || ch =='{' || ch =='['){
                st.push(ch);
            }else if(ch == ')' || ch== '}' || ch ==']'){
                if(st.isEmpty()) return false;
                char top = st.peek();
                if((ch == ')' && top!='(') ||
                        (ch == '}' && top!='{')||
                        (ch == ']' && top!='[')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[{}()]";
        P07BalancedParenthesis st = new P07BalancedParenthesis();
        System.out.println(st.isBalanced(s));
    }
}
