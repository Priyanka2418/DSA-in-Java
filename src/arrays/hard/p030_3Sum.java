/*
Brute Force:
- 3 nested loops.
- TC: O(n^3)
- SC: O(1)

Optimal:
- Sort + Two Pointers.
- Skip duplicates.
- TC: O(n^2)
- SC: O(1) (excluding output)
*/


package src.arrays.hard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p030_3Sum {
    public List<List<Integer>> threeSum(int arr[]){
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(arr);
        int n =arr.length;
        for(int i =0;i<n-2;i++){
            int left =i+1;
            int right =n-1;
            if(i>0 && arr[i]==arr[i-1])continue;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while(left<right && arr[left]==arr[left-1])left++;
                    while(left<right && arr[right]==arr[right+1])right--;
                } else if (sum<0) {
                    left++;
                }else right--;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        p030_3Sum obj = new p030_3Sum();
        List<List<Integer>> res = obj.threeSum(arr);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
