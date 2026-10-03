/*
Problem : Set the rightmost bit
TC: O(1)
SC: O(1)
 */
package src.bit_manipulation.easy;

public class p05SetUnsetRightMostUnsetBit {
    public int SetRightmostBit(int num){
        for(int i =0;i<32;i++){
            if((num & (1<<i))==0){
                return num | (1<<i);
            }
        }
        return num;
    }
    public static void main(String[] args) {
        p05SetUnsetRightMostUnsetBit obj = new p05SetUnsetRightMostUnsetBit();

         int n =obj.SetRightmostBit(12);
        System.out.println(n);
    }
}
