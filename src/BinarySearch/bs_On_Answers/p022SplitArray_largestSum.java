/*
Problem : SplitArray_LargestSum
TC: O(N * log(sum(arr[])-max(arr[])+1))
SC: O(1)
 */
package src.BinarySearch.bs_On_Answers;
import java.util.Arrays;

public class p022SplitArray_largestSum {
    public static int SplitArray(int arr[], int k){
        int low = Arrays.stream(arr).max().getAsInt();
        int high =Arrays.stream(arr).sum();

        while(low<=high){
            int mid =low+(high-low)/2;
            int countPartitions= countPartitions(arr,mid);
            if(countPartitions>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

    private static int countPartitions(int[] arr, int maxSum) {
        int partitions=1;
        long subArray=0;
        for(int num:arr){
            if(subArray+num<=maxSum){
                subArray+=num;
            }else{
                partitions++;
                subArray=num;
            }
        }
        return partitions;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int k = 3;
        System.out.println(SplitArray(a,k));
    }
}
