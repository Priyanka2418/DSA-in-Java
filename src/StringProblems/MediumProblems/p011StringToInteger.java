/*
Problem: String to Integer (atoi)

Approach:
- Skip leading spaces.
- Determine the sign.
- Convert consecutive digits into a number.
- Clamp the result to the 32-bit integer range if overflow occurs.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package src.StringProblems.MediumProblems;

public class p011StringToInteger {
    public static int myAtoi(String s){
       int i =0;
       int sign=1;
       long number= 0;

       while (i<s.length() && s.charAt(i)==' '){
           i++;
       }
        // Step 2: Check sign
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            number = number * 10 +digit;

            if(sign*number >Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(sign*number<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign*number);
    }
    public static void main(String[] args) {

    }
}
