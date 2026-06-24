package src.arrays.medium;

public class p015_Sort_array_of_0s_1s_and_2s {
    public static void sortZeroOneTwo(int nums[]){
        int count0=0;
        int count1=0;
        int count2=0;
        for(int num:nums){
            if(num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }
        for(int i =0;i<count0;i++){
            nums[i]=0;
        }
        for(int i =count0;i<count0+count1;i++){
            nums[i]=1;
        }
        for(int i =count0+count1;i<nums.length;i++){
            nums[i]=2;
        }

    }
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1};
        System.out.println("After Sorting: ");
        sortZeroOneTwo(nums);
                for(int num:nums){
                    System.out.print(num+" ");
                }
    }
}
