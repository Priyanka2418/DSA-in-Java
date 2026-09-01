/*
Problem : Check if the i-th bit is set or not
TC: O(1), constant time bitwise operation.
SC: O(1), no additional space used.
 */
package src.bit_manipulation.easy;

public class p01CheckIthBitSetOrNot {
    public boolean checkIthBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        p01CheckIthBitSetOrNot sol = new p01CheckIthBitSetOrNot();
        int num = 5;  // Binary: 101
        int bitIndex = 2;

        if (sol.checkIthBit(num, bitIndex)) {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is not set (0).");
        }
    }
}
