package src.arrays.medium;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class p023_longestConsecutive {
    public static int longestConsecutive(int nums[]){
        if(nums.length==0){
            return 0;
        }
        int longest=1;
        int count=0;
        int lastSmaller=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i] -1 ==lastSmaller){
                count+=1;
                lastSmaller=nums[i];
            } else if (nums[i]!=lastSmaller) {
                count=1;
                lastSmaller=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

    //Optimal Solution
    //using hashset + single traversal

    public static int optimalLongestConsecutive(int nums[]){
        int n =nums.length;
        if(n==0)return 0;
        int longest=1;
        Set<Integer> newList= new HashSet<>();
        for(int i =0;i<n;i++){
            newList.add(nums[i]);
        }

        for(int it:newList){
            if(!newList.contains(it-1)){
                int count =1;
                int x=it;
                while(newList.contains(x+1)){
                    x=x+1;
                    count+=1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2,5,8,7,6};
        System.out.println("The longest consecutive sequence is "+ optimalLongestConsecutive(a));
    }
}
