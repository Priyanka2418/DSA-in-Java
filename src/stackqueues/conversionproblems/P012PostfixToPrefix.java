package src.stackqueues.conversionproblems;

import java.util.Stack;

public class P012PostfixToPrefix {
    static boolean isOperator(char ch){
        switch(ch){
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }
    static String postToPre(String s) {

        Stack<String> result = new Stack<>();

        for(int i =0;i<=s.length()-1;i++){
            if(isOperator(s.charAt(i))){

                String op1 = result.pop();
                String op2 = result.pop();

                result.push( s.charAt(i) + op2 + op1);

            }else{
                result.push(s.charAt(i) + "");
            }
        }
        return result.peek();
    }
    public static void main(String[] args) {
        String postToPre = "AB+C*";
        System.out.println(postToPre(postToPre));
    }
}
