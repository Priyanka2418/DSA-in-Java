/*
Problem : Palindrome Partioning
Time Complexity  : O(n × 2ⁿ), because there can be exponentially many partitions and we perform palindrome checking/construction for them.
Space Complexity : O(n × 2ⁿ) including the output, and O(n) auxiliary recursion/path space.
 */
package src.recursion.HardProblems;

import java.util.ArrayList;
import java.util.List;

public class p016PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(s, 0 , current, result);
        return result;
    }
    private void backtrack(
            String s, int start ,
            List<String> current , List<List<String>> result
    ){
        if(start== s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = start ; i<s.length(); i++){
            if(isPalindrome(s, start , i )){
                String subString = s.substring(start, i+1);
                current.add(subString);
                backtrack(s, i+1, current,result);
                current.remove(current.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s , int left , int right ){
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        p016PalindromePartitioning solution = new p016PalindromePartitioning();

        String s = "aab";

        List<List<String>> result = solution.partition(s);

        System.out.println(result);
    }
}
