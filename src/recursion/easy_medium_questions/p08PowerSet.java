/*
Problem : Power Set
TC: O(n * 2^n), for each subsequence, we construct and print the entire subsequence.
SC: O(n * 2^n), space used to store all possible subsequences.
 */
package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.List;

public class p08PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int index, int []nums,
                       List<Integer>current,
                       List<List<Integer>> result ){
        if(index==nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        backtrack(index+1, nums, current, result);

        current.remove(current.size()-1);
        backtrack(index+1, nums, current, result);
    }
    public static void main(String[] args) {

    }
}
