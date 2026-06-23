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
