package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.List;

public class p015LetterCombinationPhoneNumber {
    private final String[]map={
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
    };

    public void helper(String digits, List<String> ans, int index, String current) {
        if (index == digits.length()) {
            ans.add(current);
            return;
        }
        String s = map[digits.charAt(index) - '0'];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            helper(digits, ans, index + 1, current + ch);
        }
    }
        public List<String> letterCombinations(String digits){
            List<String> ans = new ArrayList<>();
            if(digits==null || digits.isEmpty()){
                return ans;
            }
            helper(digits, ans, 0, "");
            return ans;
    }
    public static void main(String[] args) {
        p015LetterCombinationPhoneNumber obj =
                new p015LetterCombinationPhoneNumber();

        String digits = "23";

        List<String> ans = obj.letterCombinations(digits);

        System.out.println(ans);
    }
}
