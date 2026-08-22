/*
Problem : Count all subsequences with sum K
TC: O(2^n)
SC:  O(n)
 */
package src.recursion.easy_medium_questions;

public class p09CountAllSubsequence_SumK {
    public int countSubsequences(int[]nums, int index, int k, int sum){
        if(sum==k)return 1;
        if(index== nums.length || sum >k)return 0;

        int take = countSubsequences(nums, index+1,k , sum+ nums[index]);
        int skip = countSubsequences(nums, index+1, k , sum);

        return take +skip ;
    }
    public static void main(String[] args) {
        p09CountAllSubsequence_SumK obj = new p09CountAllSubsequence_SumK();

        int[] nums = {4,9,2,5,1};
        int k = 10;

        int count = obj.countSubsequences(nums, 0, k, 0);

        System.out.println("Count: " + count);
    }
}
