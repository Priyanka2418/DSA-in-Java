/*
Problem : Divide two integers without using multiplication, division and mod operator
TC: O(|dividend| / |divisor|), worst case O(2^31)
SC: O(1)
*/
package src.bit_manipulation.easy;

public class p07DivideTwoNumbers {
    public int divide(int dividend , int divisor){
        if (dividend == divisor) return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (divisor == 1) return dividend;

        boolean isPositive = true;

        if (dividend >= 0 && divisor < 0) {
            isPositive = false;
        } else if (dividend < 0 && divisor > 0) {
            isPositive = false;
        }

        long n = dividend;
        long d = divisor;

        n = Math.abs(n);
        d = Math.abs(d);

        long ans = 0;
        long sum = 0;

        while (sum + d <= n) {
            ans++;
            sum += d;
        }

        if (isPositive) {
            return ans > Integer.MAX_VALUE
                    ? Integer.MAX_VALUE
                    : (int) ans;
        } else {
            return (int) (-ans);
        }
    }
    public static void main(String[] args) {
        int dividend = 12, divisor = 7;

        p07DivideTwoNumbers sol = new p07DivideTwoNumbers();
        int ans = sol.divide(dividend, divisor);

        System.out.println("The result of dividing " + dividend + " and " + divisor + " is " + ans);
    }
}
