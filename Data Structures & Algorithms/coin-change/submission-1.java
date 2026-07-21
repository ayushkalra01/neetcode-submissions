class Solution {

    int n;
    int[] dp;

    int fun(int[] c, int amount) {

        if (amount == 0)
            return 0;

        if (amount < 0)
            return Integer.MAX_VALUE;

        if (dp[amount] != -2)
            return dp[amount];

        int ans = Integer.MAX_VALUE;

        for (int coin : c) {

            int curr = fun(c, amount - coin);

            if (curr != Integer.MAX_VALUE)
                ans = Math.min(ans, 1 + curr);
        }

        dp[amount] = ans;
        return ans;
    }

    public int coinChange(int[] coins, int amount) {

        n = coins.length;

        dp = new int[amount + 1];
        Arrays.fill(dp, -2);

        int ans = fun(coins, amount);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}