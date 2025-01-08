/*LeetCode link:- https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/ */

public class bestTimeToBuyAndSellStrock {
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0; // No profit can be made
        }

        int profit = 0;
        int buy = prices[0];
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
            }
            else if(prices[i] - buy > profit)
            {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
