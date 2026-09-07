/*
 Problem: Count Prime Numbers in Given Ranges
 TC: O(M log (log M + Q)), M = maximum value in queries, Q = number of queries.
 SC: O(M), Used for the prime and prefix arrays.
 */
package src.bit_manipulation.hard;
import java.util.Arrays;

public class p015CountPrimesinRange {
    public int[] countPrimes(int[][]queries){
        int max = 0;
        for(int[] query: queries){
            max= Math.max(max, query[1]);
        }
        boolean []isPrime = new boolean[max+1];
        Arrays.fill(isPrime, true);
        if(max>=0) isPrime[0] = false;
        if(max>=1) isPrime[1] = false;

        for(int i =2;i*i<=max;i++){
            if(isPrime[i]){
                for(int j =i*i ;j<=max ;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        int[]prefix = new int[max+1];
        for(int i =1;i<=max;i++){
            prefix[i] = prefix[i-1];
            if(isPrime[i]){
                prefix[i]++;
            }
        }
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            result[i] = prefix[R] - prefix[L - 1];
        }

        return result;
    }
    public static void main(String[] args) {
        p015CountPrimesinRange obj = new p015CountPrimesinRange();

        int[][] queries = {
                {1, 10},
                {10, 20},
                {5, 15}
        };

        int[] result = obj.countPrimes(queries);

        System.out.println(Arrays.toString(result));
    }
}
