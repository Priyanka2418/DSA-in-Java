package src.arrays.medium;/*
Problem: Rearrange Array Elements by Sign

Brute Force:
- Store positive and negative numbers in separate lists.
- Alternate elements from both lists into the answer array.

TC: O(n)
SC: O(n)

Optimal:
- Create an answer array.
- Place positive numbers at even indices (0, 2, 4, ...).
- Place negative numbers at odd indices (1, 3, 5, ...).

TC: O(n)
SC: O(n)   // Answer array excluded: O(1) extra space
*/

public class p020_rearrangeBySign {
    public static int[] rearrangeBySign(int[]A){
        int n=A.length;
        int []ans= new int[n];
        int positiveIndex=0, negativeIndex=1;
        for(int i =0;i<n;i++){
            if (A[i]<0){
                ans[negativeIndex]=A[i];
                negativeIndex+=2;
            }else{
                ans[positiveIndex]=A[i];
                positiveIndex+=2;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr= {1, 2, -4, -5};
         int []result = rearrangeBySign(arr);
        for(int num : result){
            System.out.print(num+ " ");
        }
    }
}
