package src.BinarySearch.bs_On_Answers;

public class po26kKthElementOf2SortedArray {
    public static int kthElement(int []arr1, int[]arr2, int k ){
        int n1=arr1.length;
        int n2 =arr2.length;
        if(n1>n2)
            return kthElement(arr2,arr1,k);
        int left=k;
        int low = Math.max(0,k-n1);
        int high =Math.min(k,n1);

        while(low<=high){
            int mid1=(low+high)/2;
            int mid2= left-mid1;

            int left1= (mid1>0)?arr1[mid1-1]:Integer.MIN_VALUE;
            int left2=(mid2>0)?arr2[mid2-1]:Integer.MIN_VALUE;

            int right1=(mid1<n1)?arr1[mid1]:Integer.MAX_VALUE;
            int right2=(mid2<n2)?arr2[mid2]:Integer.MAX_VALUE;

            if(left1<=right2 && left2<=right1){
                return Math.max(left1,left2);
            } else if (left1>right2) {
                high=mid1-1;
            }else{
                low=mid1+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;

        System.out.println(kthElement(a,b, k));
    }
}
