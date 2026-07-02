/*
Problem: Floor and Ceil in Sorted Array

 */
package src.BinarySearch.bs_on_1DArrays;

public class p05FloorCeilFinder {
    public int findFloor(int []arr, int x){
        int n =arr.length;
        int low=0,high=n-1;
        int ans = -1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid]<=x ){
                ans=arr[mid];
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int findCeil(int arr[],int x){
        int low =0,high=arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[]getFloorAndCeil(int arr[],int x){
        int f= findFloor(arr,x);
        int c= findCeil(arr,x);
        return new int[]{f,c};
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;

        p05FloorCeilFinder obj = new p05FloorCeilFinder();
        int result[]= obj.getFloorAndCeil(arr,x);
        System.out.println("The Floor and Ceil are:  "+ result[0]+" "+result[1]);
    }
}
