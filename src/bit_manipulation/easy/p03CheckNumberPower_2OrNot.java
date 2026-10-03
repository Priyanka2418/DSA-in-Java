/*
Problem : Check if a number is power of 2 or not
TC: O(1), because bitwise operations take constant time
SC: O(1), no extra space used.
 */
package src.bit_manipulation.easy;

public class p03CheckNumberPower_2OrNot {
    public boolean CheckPowerNumber(int n){
        return n >0 && ( n & (n-1) )==0;
    }
    public static void main(String[] args) {
        p03CheckNumberPower_2OrNot sol = new p03CheckNumberPower_2OrNot();
        int num = 8;

        if (sol.CheckPowerNumber(num)) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }
}
