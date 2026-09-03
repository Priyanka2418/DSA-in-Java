/*
Problem : Check if a number is odd or not
TC: O(1) — The modulus operation takes constant time.
SC: O(1) — No extra space is required.
 */
package src.bit_manipulation.easy;

public class p02CheckNumber_OddOrNot {
    public boolean isOdd(int n) {
        return n % 2 != 0;  /
    }
    public static void main(String[] args) {
        p02CheckNumber_OddOrNot sol = new p02CheckNumber_OddOrNot();
        int num = 7;

        if (sol.isOdd(num)) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is not odd.");
        }
    }
}
