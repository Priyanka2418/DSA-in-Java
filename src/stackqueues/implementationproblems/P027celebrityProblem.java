/*
Problem : Celebrity Problem
TC: O(N)
SC: O(1)
 */
package src.stackqueues.implementationproblems;

public class P027celebrityProblem {
    public static int findCelebrity(int [][]arr){

        int candidate =0;
        for(int i =1;i<arr.length ;i++){
            if(arr[candidate][i]==1){
                candidate = i;
            }
        }

        for(int i =0;i < arr.length; i++){
            if(i ==candidate){
                continue;
            }
            if(arr[candidate][i] ==1 || arr[i][candidate]==0){
                return -1;
             }
        }
        return candidate;

    }
}
