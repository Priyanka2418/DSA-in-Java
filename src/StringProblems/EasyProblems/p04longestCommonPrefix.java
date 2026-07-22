/*
Problem: Longest Common Prefix

Approach:
- Sort the array lexicographically.
- Compare the first and last strings character by character.
- The common prefix between the first and last string is the longest common prefix of the entire array.

Time Complexity: O(n log n * m)
Space Complexity: O(1)
*/
package src.StringProblems.EasyProblems;

import java.util.Arrays;

public class p04longestCommonPrefix {
    public static String longestCommonPrefix(String[] s){
        StringBuilder result = new StringBuilder();

        Arrays.sort(s);
        String first= s[0];
        String last =s[s.length-1];

        for(int i =0;i<Math.min(first.length(), last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return result.toString();
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String[] input = {"interview", "internet", "internal", "interval"};
        System.out.println(longestCommonPrefix(input));
    }
}
