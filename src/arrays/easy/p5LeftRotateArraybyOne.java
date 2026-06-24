package src.arrays.easy;

import java.util.Arrays;

//Problem - 5: Left Rotate the Array by One
public class p5LeftRotateArraybyOne {
    public static int[] leftRotate(int arr[]){
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int n =arr.length;
        int temp =arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before Rotation : " + Arrays.toString(arr));

        leftRotate(arr);

        System.out.println("After Rotation  : " + Arrays.toString(arr));

    }
}
