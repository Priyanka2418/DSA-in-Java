/*
Problem: Reverse Words in a String

Brute Force:
- Split the string into words.
- Traverse the words array in reverse order.
- Append non-empty words using StringBuilder.
- Time: O(n), Space: O(n)

Optimal:
- Traverse the string from right to left.
- Extract each word using substring().
- Append words directly to StringBuilder.
- Skip extra spaces without using split().
- Time: O(n), Space: O(1) (excluding output)
*/

package src.stringProblems.EasyProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p02reverseWords {
    public String reverseWords(String s ){
        StringBuilder result= new StringBuilder();
        
        int i= s.length()-1;
        while(i>=0){
            while (i>=0 && s.charAt(i)==' ')
                i--;
            if(i<0)break;

            int end = i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String word= s.substring(i+1, end+1);
            if(!result.isEmpty()){
                result.append(" ");
            }
            result.append(word);
        }
        return  result.toString();
    }
    public static void main(String[] args) {

    }
}
