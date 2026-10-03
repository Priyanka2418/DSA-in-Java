package src.stackqueues.conversionproblems;

import java.util.Stack;

public class P010PrefixToInfix {
    public static boolean isOpeartor(char ch ){
        switch(ch){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }
    public static String preToInfi(String s){
        Stack<String> result = new Stack<String>();

        for(int i = s.length()-1;i>=0;i--){
            if(isOpeartor(s.charAt(i))){
                String op1 = result.pop();
                String op2 = result.pop();

                result.push( '(' + op1 + s.charAt(i) + op2 + ')');
            }
            else{
                result.push(s.charAt(i)+ "");
            }
        }
        return result.peek();
    }
    public static void main(String[] args) {
        String input = "*-A/BC-/AKL";
        String output = preToInfi(input);
        System.out.println(output);
    }
}
