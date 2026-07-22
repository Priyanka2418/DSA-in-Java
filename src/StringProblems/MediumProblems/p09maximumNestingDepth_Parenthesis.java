/*
Problem: Maximum Nesting Depth of Parentheses

Approach:
- Traverse the string once.
- Increase depth for '(' and decrease for ')'.
- Track the maximum depth reached.

Time Complexity: O(n)
Space Complexity: O(1)
*/
package src.StringProblems.MediumProblems;

public class p09maximumNestingDepth_Parenthesis {
    public static int maximumDepth(String s){
        int count =0;
        int maxCount = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                count++;
                maxCount = Math.max(count , maxCount);
            } else if (ch==')') {
                count--;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {

        String s = "(1)+((2))+(((3)))";
        System.out.println(maximumDepth(s));
    }
}
