/*
Problem: Valid Anagram

Approach:
- Count character frequencies of the first string.
- Decrease frequencies using the second string.
- If all frequencies become zero, the strings are anagrams.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package src.StringProblems.EasyProblems;

public class p07checkTwoStrings_Anagram {
    public static boolean checkAnagram(String s , String t){
        if(s.length()!=t.length())
            return false;

        int []freq= new int [26];
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
        }
        for(int i =0;i<t.length();i++){
            freq[t.charAt(i)-'A']--;
        }
        for(int i =0;i<26;i++) {
            if (freq[i] != 0)
                return false;
        }
            return true;
    }
    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";

        if(checkAnagram(Str1,Str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
