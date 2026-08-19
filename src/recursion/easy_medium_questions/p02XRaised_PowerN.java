/*
Problem : Implement Pow(x,n) | X raised to the power N
TC: O(n), where n is the absolute value of the exponent.
SC: O(1), as we are using a constant amount of space
 */
package src.recursion.easy_medium_questions;

public class p02XRaised_PowerN {
    public static double power(double x, int n ){
        if(x==1.0 || n ==0) return 1;

        long temp = n ;
        if(n<0){
            x=1/x;
            temp = -1L * n;
        }
        double ans =1;
        for(long i=0;i<temp;i++){
            ans*=x;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2.000, 10));
    }
}
