/*
 * Problem: Minimum Days to Make M Bouquets
 * Approach: Binary Search on the answer (minimum day).
 * TC: O(n * log(maxBloomDay - minBloomDay))
 * SC: O(1)
 */

package src.BinarySearch.bs_On_Answers;

public class p016MinimumDays_makeMbouqets {
    public static int flowerGarden(int arr[], int kAdjacent, int minBouquets){
        if((long)kAdjacent * minBouquets > arr.length) return -1;
        int minDay=Integer.MAX_VALUE;
        int maxDay=Integer.MIN_VALUE;

        for(int bloom:arr){
            minDay=Math.min(minDay, bloom);
            maxDay=Math.max(maxDay, bloom);
        }
        int low =minDay, high=maxDay, result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(arr, mid, minBouquets, kAdjacent)){
                result=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return result;

    }

    public static boolean isPossible(int []bloomDays, int day, int  m , int k){
        int count=0; //count consecutive bloom days
        int bouqets=0;  // numbers of bouquets made
        for(int bloom: bloomDays){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouqets++;
                    count=0;
                }
                }else {
                count=0;
            }
        }
        return bouqets>=m;
    }
    public static void main(String[] args) {

    }
}
