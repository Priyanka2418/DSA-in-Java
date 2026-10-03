package src.stackqueues.conversionproblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P09InfixToPostfix {
    public int precedence(char ch ){
        if(ch =='^') return 3;
        if(ch =='*' || ch =='/' ||ch == '%')return 2;
        if(ch == '+' || ch == '-') return 1;
        return -1;
    }
    public  String infixToPostfix(String s){
        Stack<Character> st= new Stack<>();
        Queue<Character> output= new LinkedList<>();

        for(char ch : s.toCharArray()){
            //case1
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                output.add(ch);
            }else if (ch == '(') {
            st.push(ch);
        } else if (ch ==')') {
            while (st.peek() != '('){
                output.add(st.pop());
            }
            st.pop();
        }else{
            while (!st.isEmpty() &&
                    st.peek() != '(' &&
                    precedence(st.peek()) >= precedence(ch)){
                output.add(st.pop());
            }
            st.push(ch);
        }
        }

        while (!st.isEmpty()) {
            output.add(st.pop());
        }

        StringBuilder result = new StringBuilder();
        while (!output.isEmpty()){
            result.append(output.remove());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        P09InfixToPostfix obj = new P09InfixToPostfix();

        String infix = "A+(B*C-D)/E";

        String postfix = obj.infixToPostfix(infix);

        System.out.println("Infix   : " + infix);
        System.out.println("Postfix : " + postfix);
    }
}
