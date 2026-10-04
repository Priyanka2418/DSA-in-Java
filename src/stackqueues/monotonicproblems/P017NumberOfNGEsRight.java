/*
Problem : Count Greater on Right Queries
TC: O(N * queries)
SC: O(1)
 */
package src.stackqueues.monotonicproblems;

public class P017NumberOfNGEsRight {
    public static int count(int arr[], int index) {
        int count = 0;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                count++;
            }
        }
        return count;
    }

        public static int[] countIndexNGEs(int  arr[], int indexes[]){
        int ans []=  new int [indexes.length];

        for(int i =0 ;i<indexes.length ;i++){
            ans[i] = count(arr, indexes[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 7, 5, 8, 10, 6 };
        int[] indices = { 0, 5 };

        int[] ans = countIndexNGEs(arr, indices);

        for (int x : ans)
            System.out.print(x + " ");
    }

}
