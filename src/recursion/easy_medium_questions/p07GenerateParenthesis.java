/*
Problem : Generate Paranthesis
TC: O(n × Cₙ), because there are Cₙ valid combinations and each string has length 2n.
SC: O(n × Cₙ) including the result, and O(n) auxiliary space for the recursion stack.
 */
package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.List;

public class p07GenerateParenthesis {
    public List<String> generateParenthesis( int n  ){
        List<String> res = new ArrayList<>();
        backtrack("", 0, 0, n, res);
        return res;
    }
    public void backtrack(String s, int open,
                          int close, int n ,
                          List<String>res){
        if(s.length()==2*n){
            res.add(s);
            return;
        }
        if(open<n) backtrack(s +"(", open + 1, close, n , res );
        if(close<open) backtrack(s+ ")", open, close+1, n ,res);

    }
    public static void main(String[] args) {
        p07GenerateParenthesis sol = new p07GenerateParenthesis();
        List<String> result = sol.generateParenthesis(3);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
