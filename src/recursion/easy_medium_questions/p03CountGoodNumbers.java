/*
Problem : Sort stack
TC: O(2^n) because at each index, we check 5 even digits for even indices and 4
    prime digits for odd indices, leading to exponential recursion.
SC: O(n) due to the recursion depth, where each function call adds to the call stack.
 */
package src.recursion.easy_medium_questions;

public class p03CountGoodNumbers {
    static final int MOD = 1_000_000_007;
    public static int countGoodNumbers(int index, int n ){
        if(index==n)return 1;

        if (index % 2 == 0) {
            return (5 * countGoodNumbers(index + 1, n)) % MOD;
        }
        return (4 * countGoodNumbers(index + 1, n)) % MOD;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countGoodNumbers(0, n));
    }
}
