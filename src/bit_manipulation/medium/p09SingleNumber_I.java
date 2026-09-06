/*
Problem : Find the number that appears once, and the other numbers twice
TC:  O(N). Where N is the size of the array
SC:  O(1). No extra space used
 */
package src.bit_manipulation.medium;

public class p09SingleNumber_I {
    public int singleNumber(int []arr){
        int ans =0;
        for(int num :arr){
            ans^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        p09SingleNumber_I obj = new p09SingleNumber_I();
        int ans = obj.singleNumber(arr);
        System.out.println("The single element is: " + ans);
    }
}
