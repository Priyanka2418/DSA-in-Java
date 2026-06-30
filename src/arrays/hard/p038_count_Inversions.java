/*
Problem: Count Inversions

Approach: Merge Sort
- Divide the array recursively.
- Count inversions while merging the sorted halves.

TC: O(n log n)
SC: O(n)
*/

package src.arrays.hard;

public class p038_count_Inversions {

    public int inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public int mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;

        int count = 0;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;
    }

    public int merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        int countInversion = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                countInversion += (mid - left + 1);
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy merged elements back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return countInversion;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};

        p038_count_Inversions obj = new p038_count_Inversions();

        int inversions = obj.inversionCount(arr);

        System.out.println("Number of inversions: " + inversions);
    }
}