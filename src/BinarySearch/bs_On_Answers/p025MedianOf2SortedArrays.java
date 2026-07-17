/*
 * Problem: Median of Two Sorted Arrays (LeetCode 4)
 *
 * Approach: Binary Search on the smaller array to find the correct partition.
 *
 * Time Complexity: O(log(min(n, m)))
 * Space Complexity: O(1)
 */

package src.BinarySearch.bs_On_Answers;

public class p025MedianOf2SortedArrays {
    public static double medianSortedArrays(int []nums1, int[]nums2){
        int n1= nums1.length;
        int n2=nums2.length;
        if(n1>n2){
            return medianSortedArrays(nums2,nums1);
        }
        int low =0;
        int high=n1;
        while(low<=high){
            int cut1=(low+high)/2;
            int cut2= (n1+n2+1)/2 -cut1;

            int left1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
            int right1=(cut1==n1)?Integer.MAX_VALUE:nums1[cut1];

            int left2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            int right2=(cut2==n2)?Integer.MAX_VALUE:nums2[cut2];

            if(left1<=right2 && left2<=right1){
                if((n1+n2)%2==1){
                    return Math.max(left1,left2);
                }
                    return (Math.max(left1,left2)+ Math.min(right1,right2))/2.0;
            } else if (left1>right2) {
                high=cut1-1;
            }else{
                low=cut1+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []nums1={1,3,4,6};
        int []nums2={5,8,9};
        System.out.println(medianSortedArrays(nums1,nums2));
    }
}
