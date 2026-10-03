package src.stackqueues.conversionproblems;

import java.util.Stack;

public class P011PrefixToPostfix {

    public static boolean isOpeartor(char s){

        switch (s){
            case '+':
            case '-':
            case '/':
            case '*' :
                return true;
        }
        return false;
    }
    public static String preToPost(String s){
        Stack<String> result = new Stack<String>();

        int length = s.length();
        for(int i = length -1;i>=0 ;i--){
            if(isOpeartor(s.charAt(i))){
                String op1 = result.peek();
                result.pop();
                String op2 = result.peek();
                result.pop();

                String temp = op1+op2 + s.charAt(i);
                result.push(temp);
            }
            else{
                result.push(s.charAt(i)+ "");
            }
        }
        return result.peek();

    }
    public static void main(String[] args) {
        String preExp = "*-A/BC-/AKL";
        System.out.println(preToPost(preExp));
    }

}
