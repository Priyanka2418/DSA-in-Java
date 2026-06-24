package src.arrays.easy;

/*
 Problem: Find the number that appears once
  Approach1: Using Hashmap
  traverse the array ,store the frequency of each number in hashmap
  and traverse the hashmap and return the element whose frequency is 1.
  TC: 0(n), SC: O(n)

  Approach2 : Using XOR
  a^a=0 and a^0=a;
  TC: O(n),  SC: O(1);


 */
public class p012_Find_the_Number_Appearing_Once {
    public static int getSingleElement(int arr[]){
        int xor=0;
        for(int num:arr){
            xor^=num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int num[]={4,4,8,8,1,1,4};
        System.out.println("The single element is: "+getSingleElement(num));
    }
}
