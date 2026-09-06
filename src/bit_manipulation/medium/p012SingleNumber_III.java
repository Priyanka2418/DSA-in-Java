/*
Problem : Find the two numbers appearing odd number of times
TC: O(N), traversing the array twice results in O(2*N) time complexity.
SC: O(1), using a couple of variables, i.e., constant space.
 */
package src.bit_manipulation.medium;

public class p012SingleNumber_III {
    public int[] singleNumber(int[]nums){
        int n =nums.length;

        long XOR =0;
        for(int i =0; i<n ; i++){
            XOR^=nums[i];
        }
        int rightmost = (int)(XOR & (XOR-1)) ^ (int) XOR;
        int xor1=0, xor2=0;
        for(int i =0;i<n;i++){
            if((nums[i]&rightmost)!=0){
                xor1^=nums[i];
            }else {
                xor2^=nums[i];
            }
        }
        if(xor1<xor2) return new int[]{xor1, xor2};
        return new int[]{xor2, xor1};
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 2};

        p012SingleNumber_III sol = new p012SingleNumber_III();

        int[] ans = sol.singleNumber(nums);

        System.out.println("The single numbers in given array are: " + ans[0] + " and " + ans[1]);
    }
}
