/*
Problem : Combination Sum
TC: O(2t * k) due to exploring all combinations up to the target with
    copying each valid combination of average length k.
SC:  O(k * x) to store all valid combinations, where x is the number of
     combinations and k is their average length.
 */
package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.List;

public class p010CombinationSum {
    public void build(int []nums, int index, int target , List<List<Integer>>ans, List<Integer> ds){
        if(index== nums.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(nums[index]<=target){
            ds.add(nums[index]);
            build(nums, index, target- nums[index], ans, ds);
            ds.remove(ds.size()-1);
        }
        build(nums, index+1, target, ans, ds);
    }
    public List<List<Integer>> combinationSum(int []nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        build(nums, 0 , target, ans ,ds);
        return ans ;
    }
    public static void main(String[] args) {
        p010CombinationSum obj = new p010CombinationSum();
        int[] v = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ans = obj.combinationSum(v, target);


        System.out.println("Combinations are: ");
        for (List<Integer> combination : ans) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
