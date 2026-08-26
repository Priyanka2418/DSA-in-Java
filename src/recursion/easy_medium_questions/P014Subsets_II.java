/*
Problem : Subset - II | Print all the Unique Subsets
TC: O(n log n + n * 2^n)
SC: O(n) auxiliary, excluding output
 */

package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P014Subsets_II {
    public void build (int[]nums, int index, List<Integer> current,List<List<Integer>>ans){
        ans.add(new ArrayList<>(current));

        for(int i =index ; i<nums.length ; i++){
            if(i>index && nums[i]==nums[i-1])continue;
            current.add(nums[i]);
            build(nums, i+1, current, ans);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> subsetsII(int[]nums){
        Arrays.sort(nums);
        List<List<Integer>>result =new ArrayList<>();
        build(nums, 0, new ArrayList<>(), result);
        return result;
    }
    public static void main(String[] args) {

        int[] nums = {1, 2, 2};

        P014Subsets_II obj = new P014Subsets_II();

        List<List<Integer>> ans = obj.subsetsII(nums);

        for (List<Integer> subset : ans) {
            System.out.print("[");
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));

                if (i != subset.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("] ");
        }
    }
}
