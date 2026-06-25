package src.arrays.medium;

public class p021_nextPermutation {
    public static void nextPermutation(int arr[]){
        int index=-1;
        int n =arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]) {
                index = i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
            return;
        }

        //here we will swap
        for(int i=n-1 ; i>index ; i--){
            if(arr[i]>arr[index]){
                swap(arr,index,i);
                break;
            }
        }
        reverse(arr,index+1,n-1);
    }
    public static void swap(int arr[],int i,int j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

    }
    public static void reverse(int arr[],int start,int end){
        while(start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int arr[]= {2,3,5,1,9,8,};
        nextPermutation(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
