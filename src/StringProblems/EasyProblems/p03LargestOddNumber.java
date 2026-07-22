/*
Problem: Largest Odd Number in a String

Approach:
- Traverse from right to left to find the last odd digit.
- Skip leading zeros in the resulting substring.
- Return the largest odd-valued substring.

Time Complexity: O(n)
Space Complexity: O(1)
*/
package src.StringProblems.EasyProblems;

public class p03LargestOddNumber {
    public String largestOddNumber(String s) {

        int index = -1;

        // Find the rightmost odd digit
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                index = i;
                break;
            }
        }

        // No odd digit found
        if (index == -1)
            return "";

        // Skip leading zeros
        int start = 0;
        while (start <= index && s.charAt(start) == '0') {
            start++;
        }

        return s.substring(start, index + 1);
    }
    public static void main(String[] args) {

    }
}
