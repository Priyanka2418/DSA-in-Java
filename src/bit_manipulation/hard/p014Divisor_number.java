/*
Problem : Print all Divisors of a given Number
TC: O(sqrt(N)), we check for every number between 1 and sqaure root of N.
SC: O(k), extra space used for storing the k divisors.
 */
package src.bit_manipulation.hard;

import java.util.ArrayList;
import java.util.List;

public class p014Divisor_number {
    public List<Integer> getDivisors(int N){
        List<Integer> res = new ArrayList<>();
        for(int i =1 ; i* i <=N ; i++){
            if(N%i == 0){
                res.add(i);
            }
            //to not add the second copy
            if(i!= N/i){
                res.add(N/i);
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
