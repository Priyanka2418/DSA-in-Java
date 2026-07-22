/*
Problem: Isomorphic Strings

Approach:
- Use two mapping arrays to track the last seen position of characters.
- If the positions don't match, the strings are not isomorphic.

Time Complexity: O(n)
Space Complexity: O(1)
*/
package src.StringProblems.EasyProblems;

public class p05isomorphicString {
    public static boolean isomorphicStrings(String s, String t){
        if(s.length()!=t.length())
            return false;

      int []m1= new int[256], m2= new int [256];
      for(int i =0;i<s.length();i++){
          if(m1[s.charAt(i)]!=m2[t.charAt(i)])
              return false;

          m1[s.charAt(i)]=i+1;
          m2[t.charAt(i)]=i+1;
        }
      return true;

    }
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isomorphicStrings(s,t));
    }
}
