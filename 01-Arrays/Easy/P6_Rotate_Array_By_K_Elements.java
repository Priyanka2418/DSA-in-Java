//Problem 6: Rotate Array By k Elements

public class  P6_Rotate_Array_By_K_Elements {
    public static  void reverseArray(int nums[],int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static int[] rotateArray(int nums[],int k ,String direction){
        int n =nums.length;
        if (n == 0 || k == 0) return nums;

        k=k%n;
        if(direction.equals("right")){
            reverseArray(nums,0,n-1);
            reverseArray(nums,0,k-1);
            reverseArray(nums,k,n-1);
        } else if (direction.equals("left")) {
            reverseArray(nums,0,k-1);
            reverseArray(nums,k,n-1);
            reverseArray(nums,0,n-1);
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k =2;
        String direction ="left";
        int result[]= rotateArray(nums,k,direction);

        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
