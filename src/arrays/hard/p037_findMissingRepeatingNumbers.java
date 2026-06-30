/*
Problem: Find Missing and Repeating Numbers

Approach: Cyclic Sort
- Place each element at its correct index.
- The mismatched index gives the repeating and missing numbers.

TC: O(n)
SC: O(1)
*/

package src.arrays.hard;
public class p037_findMissingRepeatingNumbers {
    public static int[] missingRepeatingNumbers(int []nums){
        int i =0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp =nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        for( i =0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
        int result[]= missingRepeatingNumbers(nums);
        System.out.printf("The repeating and missing numbers are: {%d, %d}\n", result[0], result[1]);

    }
}
