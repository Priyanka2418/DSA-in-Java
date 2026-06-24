package src.arrays.easy;//Problem 7: Move Zeros to End

import java.util.Arrays;

public class p7_Move_Zeros_to_End {
    public void moveZeroes(int nums[]){
       int j =-1;
       for(int i =0;i<nums.length;i++){
           if(nums[i]==0){
               j=i;
               break;
           }
       }
       if(j==-1) return ;

       for(int i=j+1 ; i<nums.length ;i++){
           if (nums[i] != 0) {
               int temp =nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               j++;
           }
       }
    }
    public static void main(String[] args) {
        p7_Move_Zeros_to_End sol= new p7_Move_Zeros_to_End();
        int nums[]={0,1,4,0,5,0,3,0,0};
        System.out.println("Before: "+ Arrays.toString(nums));

        sol.moveZeroes(nums);
        System.out.println("After: " +Arrays.toString(nums));

    }
}
