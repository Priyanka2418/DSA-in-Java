/*
Problem : Count the number of set bits
TC: O(log n), because each bit of the integer is checked once.
SC: O(1), only a few variables are used.
 */
package src.bit_manipulation.easy;

public class p04CountNumberofSetBits {
    public int countSetBits(int n ){
        int count = 0;
        while ( n > 0 ){
            count += ( n & 1 );
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 29;

        p04CountNumberofSetBits sol = new p04CountNumberofSetBits();
        int result = sol.countSetBits(n);

        System.out.println("The number of set bits is: " + result);
    }
}
