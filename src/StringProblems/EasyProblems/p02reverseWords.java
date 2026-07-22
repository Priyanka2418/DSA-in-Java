/*
Problem: Reverse Words in a String

Brute Force:
- Split, reverse, and join the words.
- Time: O(n), Space: O(n)

Optimal:
- Traverse from right to left.
- Extract and append each word while skipping extra spaces.
- Time: O(n), Space: O(n)
*/

package src.StringProblems.EasyProblems;

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
