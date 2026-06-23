/*
Problem: Stock Buy and Sell – Max one Transaction Allowed
Brute Force:
Check every buy-sell pair and track the maximum profit.
TC: O(n²)
SC: O(1)

Optimal:
rack the minimum price seen so far.
Calculate profit at each day and update the maximum profit.

TC: O(n)
SC: O(1)
 */

public class p019_stockbuySell {
    public static int stockBuySell(int []prices){
        int minValue= Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<minValue){
                minValue=price;
            }else{
                maxProfit=Math.max(maxProfit,price-minValue);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("The overall profit is 8: "+ stockBuySell(prices));
    }
}
