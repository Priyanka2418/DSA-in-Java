package src.arrays.easy;

import java.util.Arrays;

public class p8_Linear_Search {
    public static int linearSearch(int arr[], int num){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int num = 30;
        System.out.println(Arrays.toString(arr));

        int result = linearSearch(arr, num);

        System.out.println(result);
    }
}
