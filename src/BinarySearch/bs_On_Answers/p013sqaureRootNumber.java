/*
Problem: Find the square of a number

Optimal Approach---
TC:O(log(N))
SC: O(1)
 */

package src.BinarySearch.bs_On_Answers;

public class p013sqaureRootNumber {
    public static int findSquareRoot(int n ){
        if(n<2) return n ;
        int left=1;
        int right =n/2;
        int ans =0;
        while(left<=right){
            long mid = left+(right-left)/2;
            if(mid * mid <= n){
                ans = (int) mid;
                left= (int) (mid+1);
            }
            else{
                right = (int) (mid-1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
