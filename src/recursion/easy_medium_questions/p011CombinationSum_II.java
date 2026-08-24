/*
Problem : CombinationSum -II
TC: O(2t * k) due to exploring all combinations up to the target with
    copying each valid combination of average length k.
SC:  O(k * x) to store all X valid combinations, each of average length k.
 */
package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p011CombinationSum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        findCombination(0, target, candidates, result, new ArrayList<>());

        return result;
    }
    public void findCombination(int index, int target, int []nums, List<List<Integer>> ans , List<Integer>ds){
        if(target==0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = index; i< nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > target) {
                break;
            }

            ds.add(nums[i]);

            findCombination(i+1, target-nums[i], nums, ans, ds);
            // Backtrack by removing the last added element
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        p011CombinationSum_II obj = new p011CombinationSum_II();
        int[] v = {10, 1, 2, 7, 6, 1, 5};  // Example input
        int target = 8;  // Target sum

        // Get all combinations that sum up to 8
        List<List<Integer>> comb = obj.combinationSum2(v, target);

        // Output the combinations
        System.out.print("[ ");
        for (List<Integer> combination : comb) {
            System.out.print("[ ");
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.print("]");
        }
        System.out.println(" ]");
    }
}
