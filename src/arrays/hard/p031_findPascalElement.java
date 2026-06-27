package src.arrays.hard;

public class p031_findPascalElement {
    public static Long findPascal(int row,int col){
        int n =row-1;
        int k =col-1;

        long result =1;
        for(int i =0;i<k;i++){
            result*=(n-i);
            result/=(i+1);
        }
        return result;
    }
    public static void main(String[] args) {
        int r=5, c=3;
        System.out.println(findPascal(r,c));
    }
}
