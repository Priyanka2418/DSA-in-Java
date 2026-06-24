

import java.util.HashMap;
import java.util.Map;

public class p016_Length_of_longest_subarray_with_zero_Sum {
    public static int maxLen(int nums[]){
        Map<Integer,Integer>map= new HashMap<>();
        int maxLen=0;
        int prefixSum=0;
        for(int i =0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(prefixSum==0){
                maxLen=i+1;
            }else{
                if(map.containsKey(prefixSum)){
                    int start=map.get(prefixSum)+1;
                    int end=i;
                    maxLen=Math.max(maxLen,end-start+1);
                }else{
                    map.put(prefixSum,i);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] A = new int[]{9, -3, 3, -1, 6, -5};
        System.out.println("maxLength: "+ maxLen(A));
    }
}
