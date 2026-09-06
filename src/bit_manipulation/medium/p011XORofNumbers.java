/*
Problem : Find XOR of numbers from L to R
TC: O(N) Traversing through all the numbers take O(N) time.
SC: O(1) Using only a couple of variables, i.e., constant space.
 */
package src.bit_manipulation.medium;

public class p011XORofNumbers {
    public int findRangeXor(int l , int r){
        int ans =0;
        for(int i =l;i<=r;i++){
            ans^=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int l = 3, r = 5;

        /* Creating an instance of
        Solution class */
        p011XORofNumbers sol = new p011XORofNumbers();

        /* Function call to get the
        XOR of numbers from L to R */
        int ans = sol.findRangeXor(l, r);

        System.out.println("The XOR of numbers from " + l + " to " + r + " is: " + ans);
    }
}
