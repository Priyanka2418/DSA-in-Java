/*
PROBLEM: Merge Two Sorted Arrays Without Extra Space

Brute Force:
- Merge using an extra array.
TC: O(n + m)
SC: O(n + m)

Optimal (Two Pointers from End / Backfill Merge):
- Use two pointers from end of both arrays and fill nums1 from back.
- Place larger element at the end index.
TC: O(n + m)
SC: O(1)
*/

package src.arrays.hard;
public class p036_Merge_two_Sorted_Arrays_Without_Extra_Space {
    public  void merge(int nums1[],int nums2[], int m , int n){
        int i =m-1;
        int j =n-1;
        int k =m +n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 9, 0, 0, 0};
        int[] nums2 = {2, 4, 8};
        int m = 3, n = 3;

        new p036_Merge_two_Sorted_Arrays_Without_Extra_Space().merge(nums1,nums2,m,n);
        for(int num:nums1){
            System.out.print(num+" ");
        }
    }
}
