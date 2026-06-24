package src.arrays.easy;

import java.util.ArrayList;
import java.util.List;


//brute force -Using Set
public class p9_Union_Of_Two_Sorted_Arrays {
    public List<Integer> findUnion(int arr1[], int arr2[], int n , int m){

        List<Integer> result= new ArrayList<>();

        int i =0,j=0;
        while(i<n && j<m){
            //result should not be empty and if result matches the last element with current element of arr1 then continue;
            if(!result.isEmpty() && result.get(result.size()-1)==arr1[i]){
                i++;
                continue;
            }
            if(!result.isEmpty() && result.get(result.size()-1)==arr2[j]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                result.add(arr1[i]);
                i++;
            } else if (arr1[i]>arr2[j]) {
                result.add(arr2[j]);
            }else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            //
            if(result.isEmpty() || result.get(result.size()-1)!=arr1[i]){
                result.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(result.isEmpty() || result.get(result.size()-1)!=arr2[j]){
                result.add(arr2[j]);
            }
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        p9_Union_Of_Two_Sorted_Arrays obj = new p9_Union_Of_Two_Sorted_Arrays();
        List<Integer> result = obj.findUnion(arr1, arr2, n, m);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result)
            System.out.print(val + " ");
    }
}
