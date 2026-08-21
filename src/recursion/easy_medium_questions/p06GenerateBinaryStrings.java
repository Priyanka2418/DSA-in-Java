/*
Problem: Generate all binary strings without consecutive 1's
TC: O(2^n), since each position has 2 choices.
SC: O(n) per recursive path (due to call stack)
 */
package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.List;

public class p06GenerateBinaryStrings {
    public List<String> generateBinaryString(int n){
        List<String >result = new ArrayList<>();
        construct(n,"", result);
        return result;

    }
    public static void construct(int n , String s, List<String> result){
        if (n==0){
            result.add(s);
            return ;
        }

        construct(n-1, s+"0", result );
        if(s.isEmpty() || s.charAt(s.length()-1)!='1'){
            construct(n-1,s+ "1", result);
        }
    }
    public static void main(String[] args) {

    }
}
