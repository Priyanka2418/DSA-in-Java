/*
Problem: Count Occurrences in a Sorted Array

Brute Force:
TC: O(n)
SC: O(1)

Optimal:
TC: O(log n)
SC: O(1)
*/


package src.BinarySearch.bs_on_1DArrays;

public class p06countOccurence_SortedArray {
    public static int firstOccurence(int arr[],int n, int target){
        int low=0;
        int high= n-1;
        int first=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target ){
                first=mid;
                high=mid-1;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }

    public static int lastOccurence(int arr[], int n, int target){
        int low=0;
        int high= n-1;
        int last=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target ){
                last=mid;
                low=mid+1;
            } else if (arr[mid] < target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }

    public  static int[] countOccurence(int arr[],int n ,int target){
        int first = firstOccurence(arr, n , target);
        if(first==-1)return new int[]{-1,-1};
        int last= lastOccurence(arr,n,target);
        if(last==-1) return new int[]{-1,-1};
        return new int[]{first,last};
    }

    public static int count(int arr[],int n , int target ){
        int[] ans = countOccurence(arr, n, target);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 0;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
