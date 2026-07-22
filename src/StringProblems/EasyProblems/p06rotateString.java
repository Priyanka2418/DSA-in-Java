/*
Problem: Rotate String

Approach:
- Concatenate the string with itself.
- If the goal is a substring of the doubled string, it is a valid rotation.

Time Complexity: O(n)
Space Complexity: O(n)
*/

package src.StringProblems.EasyProblems;

public class p06rotateString {
    public static boolean rotateString(String s, String goal){
        if(s.length()!=goal.length())
            return false;

        String doubleS= s + s;
        return doubleS.contains(goal);
    }
    public static void main(String[] args) {
        System.out.println(rotateString("rotation", "tionrota"));
    }
}
