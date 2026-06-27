/*
Problem: Count Subarray Sum Equal to K

Brute Force:
TC: O(n²)
SC: O(1)

Optimal (Prefix Sum + HashMap):
TC: O(n)
SC: O(n)
*/

package src.arrays.medium;
import java.util.HashMap;

public class p027_subarraySum {
    public static int prefixSum(int nums[],int k){
        if(nums.length==0)return 0;
        int prefixsum=0;
        int count =0;
        HashMap<Integer,Integer> prefixSumCount= new HashMap<>();

        prefixSumCount.put(0, 1);
        //we've seen prefix sum 0 one time
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int remove= prefixsum-k;
            if(prefixSumCount.containsKey(remove)){
                //we cant use count++ only because if the remove has occured more
                // than one time in the past ,we need to increase the count that many times.
                count+=prefixSumCount.get(remove);
            }
            //Store the current prefix sum for future indices
            prefixSumCount.put(prefixsum,prefixSumCount.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3};
        int k= 3;
        System.out.print(prefixSum(arr,k));
    }
}
