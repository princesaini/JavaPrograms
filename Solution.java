// 121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {

        int maximumProfit = 0;
        int minimumPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minimumPrice)
                minimumPrice = prices[i];
            else if ((prices[i] - minimumPrice) > maximumProfit)
                maximumProfit = prices[i] - minimumPrice;
        }

        return maximumProfit;
    }
}