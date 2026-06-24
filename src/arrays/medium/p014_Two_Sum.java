package src.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class p014_Two_Sum {
    public static String twoSumIndices(int arr[],int target){
        int sum =0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int complement= target-arr[i];
            if(map.containsKey(complement)){
                return "YES";
                //return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return "NO";
        //return new int[]{-1,-1}

    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        System.out.println(twoSumIndices(arr,target));
    }
}
