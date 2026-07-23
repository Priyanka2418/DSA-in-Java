/*
Problem: Sum of Beauty of All Substrings

Approach:
- Generate all substrings.
- Maintain character frequencies using a HashMap.
- For each substring, find the maximum and minimum frequencies.
- Add (maxFreq - minFreq) to the answer.

Time Complexity: O(n² × 26) ≈ O(n²)
Space Complexity: O(26) ≈ O(1)
*/

package src.StringProblems.MediumProblems;

import java.util.HashMap;
import java.util.Map;

public class p014SumOfBeautyofAllSubstrings {
    public static int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> freq = new HashMap<>();

            for (int j = i; j < n; j++) {
                // Increase character frequency
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);

                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;

                for (int val : freq.values()) {
                    mini = Math.min(mini, val);
                    maxi = Math.max(maxi, val);
                }

                sum += (maxi - mini);
            }
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
