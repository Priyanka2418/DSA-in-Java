/*
Problem : FourSum
Brute:
- 4 loops.
- TC: O(n^4)
- SC: O(1)

Better:
- Fix 2 + HashSet.
- TC: O(n^3)
- SC: O(n)

Optimal:
- Sort + Fix 2 + Two Pointers.
- Skip duplicates.
- TC: O(n^3)
- SC: O(1) (excluding output)
*/


package src.arrays.hard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p032_fourSum {
    public  List<List<Integer>> FourSum(int arr[],int target){
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1])continue;
            for(int j =i+1;j<n-2;j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) left++;
                        while (left < right && arr[right] == arr[right + 1]) right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        p032_fourSum obj = new p032_fourSum();
        List<List<Integer>> result = obj.FourSum(arr,target);
        for(List<Integer> ans: result){
            System.out.println(ans);
        }

    }
}
