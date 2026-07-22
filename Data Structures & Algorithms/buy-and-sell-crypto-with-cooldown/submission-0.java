class Solution {

    Integer[][] dp;

    int fun(int i, int holding, int[] prices) {

        if (i >= prices.length)
            return 0;

        if (dp[i][holding] != null)
            return dp[i][holding];

        if (holding == 1) {

            int sell = prices[i] + fun(i + 2, 0, prices);
            int hold = fun(i + 1, 1, prices);

            return dp[i][holding] = Math.max(sell, hold);
        }

        int buy = -prices[i] + fun(i + 1, 1, prices);
        int skip = fun(i + 1, 0, prices);

        return dp[i][holding] = Math.max(buy, skip);
    }

    public int maxProfit(int[] prices) {

        dp = new Integer[prices.length][2];

        return fun(0, 0, prices);
    }
}