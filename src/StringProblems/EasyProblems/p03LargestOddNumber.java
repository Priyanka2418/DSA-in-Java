/*
Problem: Largest Odd Number in a String

Optimal:
- Traverse from right to left.
- Find the first odd digit.
- Return substring(0, i + 1).
- Time: O(n), Space: O(1)
*/
package src.stringProblems.EasyProblems;

public class p03LargestOddNumber {
    public String largestOddNumber(String s){
        int index=-1;
        //here we will if the last index is even we will break
        for(int i =s.length()-1;i>=-;i--){
            if(s.charAt(i)%2==1){
                index=i;
                break;
            }
            //if no digit is found odd return an empty string
            if(index==-1)return "";

            // Skip leading zeroes up to the odd digit
            i=0;
            while(i<=index && s.charAt(i)=='0')i++;

            //return substring from non-zero to odd digit
            return s.substring(i,index+1);
        }
    }
    public static void main(String[] args) {

    }
}
