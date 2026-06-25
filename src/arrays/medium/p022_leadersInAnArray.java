package src.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;

public class p022_leadersInAnArray {
    public static ArrayList<Integer> leaders(int nums[]){
        ArrayList<Integer>result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }
        int max = nums[nums.length-1];
        result.add(nums[nums.length-1]);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>max){
                result.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans = leaders(nums);

        System.out.println(ans);

    }
}
