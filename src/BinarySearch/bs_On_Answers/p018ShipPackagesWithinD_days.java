/*
 * Problem: Ship Packages Within D Days
 * Approach: Binary Search on the answer (minimum ship capacity).
 * TC: O(n * log(sum - maxWeight))
 * SC: O(1)
 */

package src.BinarySearch.bs_On_Answers;

import java.util.Arrays;

public class p018ShipPackagesWithinD_days {

    public static int daysNeeded(int[]weights, int capacity){
        int days =1;
        int currentLoad=0;
        for(int w:weights){
            if(currentLoad+w>capacity){
                days++;
                currentLoad=w;
            }else{
                currentLoad+=w;
            }
        }
        return days;
    }

    public static int shipWithinDays(int []weights, int day){
        int low = Arrays.stream(weights).max().getAsInt();
        int high= Arrays.stream(weights).sum();
        while(low<=high){
            int mid = (low+high)/2;
            int needed= daysNeeded(weights, mid);
            if(needed<=day){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {

    }
}
