package src.BinarySearch.bs_on_1DArrays;

public class p01LowerBound {
    public static  int LowerBound(int arr[], int x){
        int ans = arr.length;
        int low =0;
        int high =arr.length-1;


        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+=1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};  // Sorted array
        int x = 9;

        System.out.println("The lower bound is the index: "+ LowerBound(arr,x));
    }
}
