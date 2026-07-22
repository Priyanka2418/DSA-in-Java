/*
Problem: Remove Outermost Parentheses

Optimal:
- Use a balance counter while traversing.
- Skip the first '(' and last ')' of every primitive.
- Store the result in StringBuilder.
- Time: O(n), Space: O(n)
*/
package src.stringProblems.EasyProblems;

public class p01removeOutermostParenthesis {
    public String removeOutermostParenthesis(String s ) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0)
                    sb.append(ch);
                count++;
            } else {
                count--;
                if (count > 0)
                    sb.append(ch);
            }
        }
     return sb.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        p01removeOutermostParenthesis obj = new p01removeOutermostParenthesis();
        String ans = obj.removeOutermostParenthesis(s);
        System.out.println(ans);
    }

}
