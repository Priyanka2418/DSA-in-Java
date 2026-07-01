package src.BinarySearch.bs_on_1DArrays;

public class p02UpperBound {
    public static int UpperBound(int nums[],int x){
        int low =0;
        int high =nums.length-1;
        int ans= nums.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<=x){
                low=mid+1;
            } else {
                ans =mid;
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println("The upper bound index is : "+ UpperBound(arr,x));
    }
}
