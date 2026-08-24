/*
Problem : Combination Sum _III
TC: O(2^9 * k), due to the exploration of all subsets of the set {1, 2, ..., 9}..
SC: O(k), where k is the number of elements in the combination.
 */
package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.List;

public class p013CombinationSum_III {
    public List<List<Integer>> combinationSum3(int k , int n ){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        build(n , 1, k, nums, ans);
        return ans;
    }
    public void build(int sum , int last, int k, List<Integer>nums, List<List<Integer>> ans){
        if(sum==0 && nums.size()==k){
            ans.add(new ArrayList<>(nums));
            return;
        }
        if(sum<=0  || nums.size()>k)return;

        for(int i = last;i<=9;i++){
            if(i<=sum){
                nums.add(i);
                build(sum-i, i+1, k ,nums, ans);
                nums.remove(nums.size()-1);
            }else{
                break;
            }
        }
    }
    public static void main(String[] args) {
        p013CombinationSum_III sol = new p013CombinationSum_III();
        int k = 3; // Number of elements in the combination
        int n = 7; // Target sum
        List<List<Integer>> result = sol.combinationSum3(k, n);

        // Print the result
        for (List<Integer> combination : result) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
