/*
Problem : Subset sum-Sum of all Subsets
TC:  O(2n),Each element has two choices, Sorting the sums adds O(2n log(2n)),
     making the total O(2n log(2n)).
SC: O(2n),The result array holds all subset sums, requiring O(2n) space. Recursion uses an
    additional O(n) stack space due to function calls, so total auxiliary space is O(2n + n).
 */
package src.recursion.easy_medium_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p012Subsets_I {
    public List<Integer> subsetI(int[]nums){
        List<Integer> result = new ArrayList<>();
        build(nums, 0,0, result );
        Collections.sort(result);
        return result;
    }
    public void build(int[]nums, int index, int sum , List<Integer>ans){
        if(index == nums.length){
            ans.add(sum);
            return;
        }
        build(nums, index+1,sum + nums[index],ans);
        build(nums, index+1, sum,ans);
    }
    public static void main(String[] args) {
        p012Subsets_I sol = new p012Subsets_I();
        int[] arr = {5, 2, 1};
        List<Integer> result = sol.subsetI(arr);

        for (int sum : result) {
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
