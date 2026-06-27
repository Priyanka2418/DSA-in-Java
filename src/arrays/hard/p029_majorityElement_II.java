/*
Problem: Majority Element II

Brute Force: Check frequency of every element.
TC: O(n²), SC: O(1)

Better: Use HashMap to count frequencies.
TC: O(n), SC: O(n)

Optimal: Boyer-Moore Voting Algorithm.
TC: O(n), SC: O(1)
*/

package src.arrays.hard;
import java.util.ArrayList;
import java.util.List;

public class p029_majorityElement_II {
    public static List<Integer> majorityElement(int nums[]){
        int n =nums.length;
        int count1=0, count2=0;
        int elem1=Integer.MIN_VALUE , elem2=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(count1==0 && elem2!=nums[i]){
                count1++;
                elem1= nums[i];
            } else if (count2==0 && elem1!=nums[i]) {
                count2++;
                elem2=nums[i];
            } else if (nums[i]==elem1) {
                count1++;
            } else if (nums[i] ==elem2) {
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i =0;i<n;i++){
            if(nums[i]==elem1)count1++;
            if (nums[i]==elem2)count2++;
        }

        int mini = n / 3 + 1;
        List<Integer> result = new ArrayList<>();
        if (count1 >= mini) result.add(elem1);
        if (count2 >= mini && elem1 != elem2) result.add(elem2);

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

        p029_majorityElement_II sol= new p029_majorityElement_II();

        List<Integer> ans = sol.majorityElement(arr);
        System.out.print("the majority elements are: ");
        for(int it:ans){
            System.out.print(it +" ");
        }
        System.out.println();
    }
}
