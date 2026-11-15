class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {

            // Check if selling gives profit
            if (prices[right] > prices[left]) {
 
                int profit = prices[right] - prices[left];

                maxProfit = Math.max(maxProfit, profit);

            } else {

                // Found a cheaper buying price
                left = right;
            }

            right++;
        }

        return maxProfit;
    }
}