/*
Problem : Divide two integers without using multiplication, division and mod operator
TC: O(log² |dividend|)
SC: O(1)
*/
package src.bit_manipulation.easy;

public class p07DivideTwoNumbers {
    public int divide(int dividend , int divisor){
        if (dividend == divisor)
            return 1;


        boolean isPositive = (dividend < 0) == (divisor < 0);


        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long ans = 0;


        while (a >= b) {
            int q = 0;


            while (a > (b << (q + 1)))
                q++;


            ans += (1L << q);
            a -= (b << q);
        }


        if (ans == (1L << 31) && isPositive)
            return Integer.MAX_VALUE;


        return isPositive ? (int) ans : (int) -ans;
    }
    public static void main(String[] args) {
        int dividend = 12, divisor = 7;

        p07DivideTwoNumbers sol = new p07DivideTwoNumbers();
        int ans = sol.divide(dividend, divisor);

        System.out.println("The result of dividing " + dividend + " and " + divisor + " is " + ans);
    }
}
