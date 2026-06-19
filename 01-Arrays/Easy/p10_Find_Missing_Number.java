public class p10_Find_Missing_Number {
    public static int findNumber(int arr[],int n ){
        int expectedSum =(n*(n+1)/2);
        int actualSum = 0;
        for(int num:arr){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        System.out.println("MISSING NUMEBER IS : " + findNumber(arr, n));
    }
}

//more optimal(XOR method)
//a^0=a
//a^a=0
