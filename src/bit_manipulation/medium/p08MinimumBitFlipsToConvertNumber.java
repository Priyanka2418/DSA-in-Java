/*
Problem : Count number of bits to be flipped to convert A to B
TC: O(1)
SC: O(1)
 */
package src.bit_manipulation.medium;

public class p08MinimumBitFlipsToConvertNumber {
    public int minBitsFlip(int start, int goal){

        int num = start^ goal;
        int count =0;

        for(int i =0;i<32;i++){
            count+=(num & 1);
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int start = 10, goal = 7;

        /* Creating an instance of
        Solution class */
        p08MinimumBitFlipsToConvertNumber sol = new p08MinimumBitFlipsToConvertNumber();

        /* Function call to get the minimum
         bit flips to convert number */
        int ans = sol.minBitsFlip(start, goal);

        System.out.println("The minimum bit flips to convert number is: " + ans);
    }
}
