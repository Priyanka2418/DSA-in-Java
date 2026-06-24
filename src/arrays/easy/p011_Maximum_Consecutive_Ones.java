package src.arrays.easy;/*
  PROBLEM: Maximum Consecutive Ones
  Approach:
  Traverse the array and maintain a count of consecutive 1s.
  Reset the count whenever a 0 is encountered and keep track

  Time Complexity: O(n)
  Space Complexity: O(1)
*/

public class p011_Maximum_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int arr[]){
        int maxCount=0;
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[]={1,0,1,1,1,0,0,0,1,1};

        System.out.println("The maximum consecutive 1's are "+ findMaxConsecutiveOnes(nums));
    }
}
