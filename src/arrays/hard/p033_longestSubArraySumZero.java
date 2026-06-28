/*
Brute Force:
- Check all subarrays.
- TC: O(n^2)
- SC: O(1)

Optimal:
- Prefix Sum + HashMap.
- Store first occurrence of each prefix sum.
- Same prefix sum ⇒ subarray sum = 0.
- TC: O(n)
- SC: O(n)
*/

package src.arrays.hard;
import java.util.HashMap;
import java.util.Map;

public class p033_longestSubArraySumZero {
    public static int longestSubArray(int nums[]){
        int n =nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        int maxCount= 0;
        int sum=0;

        for(int i =0 ; i<n ; i++){
            sum+=nums[i];
            if(sum==0) {
                maxCount=i+1;
            }else{
                if(map.containsKey(sum)){
                    maxCount=Math.max(maxCount,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        return maxCount;

    }
    public static void main(String[] args) {
        int[] A = new int[]{9, -3, 3, -1, 6, -5};
        System.out.println(longestSubArray(A));
    }
}
