/*LeetCode link:- https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/ */

public class numberOfSmoothDescentPeriodsOfAStock {
    public static long getDescentPeriods(int[] prices) {
        long total = 1;
        int current_length = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) {
                current_length++;
            } else {
                current_length = 1;
            }
            total += current_length;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] prices1 = { 3, 2, 1, 4 };
        System.out.println(getDescentPeriods(prices1)); // Output: 7

        int[] prices2 = { 8, 6, 7, 7 };
        System.out.println(getDescentPeriods(prices2)); // Output: 4

        int[] prices3 = { 1 };
        System.out.println(getDescentPeriods(prices3)); // Output: 1
    }
}
