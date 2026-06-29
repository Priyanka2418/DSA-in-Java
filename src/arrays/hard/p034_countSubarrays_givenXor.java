/*
PROBLEM: Count Subarrays with Given XOR
Brute Force:
- Generate all subarrays and calculate XOR.
TC: O(n^2)
SC: O(1)

Optimal (Prefix XOR + HashMap):
- Store prefix XOR frequencies and count matching XORs.
TC: O(n)
SC: O(n)
*/

package src.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class p034_countSubarrays_givenXor {
    public static int countXor(int arr[],int k){

        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0,1);
        int count=0;
        int xor=0;
        for(int num:arr){
            xor^=num;

            int target= xor^k;
            if(freq.containsKey(target)){
                count+=freq.get(target);
            }
            freq.put(xor, freq.getOrDefault(xor,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {5, 6, 7, 8, 9};
        int k = 6;

        System.out.println(countXor(A,k));
    }
}
