/*
Problem: Remove Outermost Parentheses

Approach:
- Traverse the string using a balance counter.
- Skip the outermost '(' and ')' of each primitive.
- Build the result using StringBuilder.

Time Complexity: O(n)
Space Complexity: O(n)
*/

package src.StringProblems.EasyProblems;

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
