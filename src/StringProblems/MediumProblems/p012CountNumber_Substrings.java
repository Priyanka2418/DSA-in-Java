/*
Problem: Count Number of Substrings with Exactly K Distinct Characters

Approach:
- Use a sliding window to count substrings with at most K distinct characters.
- Result = AtMost(K) - AtMost(K-1).

Time Complexity: O(n)
Space Complexity: O(k)
*/

package src.StringProblems.MediumProblems;

import java.util.HashMap;
import java.util.Map;

public class p012CountNumber_Substrings {
    public static int countAtMostK(String s, int k ){

        if(k < 0)return 0;

        int count =0;
        int i =0;

        Map<Character , Integer> map = new HashMap<>();
        for(int j =0;j<s.length();j++){
            char right =s.charAt(j);
            map.put(right, map.getOrDefault(right, 0)+1);
            while(map.size()>k){
                char left =s.charAt(i);
                map.put(left, map.get(left)-1);

                if(map.get(left)==0){
                    map.remove(left);
                }
                i++;
            }
            count+=(j-i+1);
        }
        return count;
    }
    public static int countSubstrings(String s, int k) {
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }
    public static void main(String[] args) {

    }
}
