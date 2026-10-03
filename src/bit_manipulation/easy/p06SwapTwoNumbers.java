/*
Problem : Swap two numbers
TC: O(1) Constant operations.
SC: O(1) No extra space used.
 */
package src.bit_manipulation.easy;

public class p06SwapTwoNumbers {
    public void swap(int[]arr){
        arr[0] = arr[0]^arr[1];
        arr[1] = arr[0]^arr[1];
        arr[0] = arr[0]^arr[1];
    }
    public static void main(String[] args) {
        int[] nums = {5, 10};

        p06SwapTwoNumbers swapper = new p06SwapTwoNumbers();
        swapper.swap(nums);

        // Print the result
        System.out.println("a = " + nums[0] + ", b = " + nums[1]);
    }
}
