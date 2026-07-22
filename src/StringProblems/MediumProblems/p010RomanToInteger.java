/*
Problem: Roman to Integer

Approach:
- Traverse the string from left to right.
- If the current value is smaller than the next value, subtract it.
- Otherwise, add it.
- Add the last Roman numeral separately.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package src.StringProblems.MediumProblems;

import java.util.HashMap;
import java.util.Map;

public class p010RomanToInteger {
    public static int romanToInt(String s ){
        int result =0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i =0;i<s.length()-1;i++){
            if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
                result-= roman.get(s.charAt(i));
            }else{
                result+= roman.get(s.charAt(i));
            }
        }
        return  result + roman.get(s.charAt(s.length()-1));
    }
    public static void main(String[] args) {
        String s =  "LVIII";
        System.out.println(romanToInt(s));
    }
}
