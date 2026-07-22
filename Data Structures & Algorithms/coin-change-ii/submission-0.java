class Solution {

    int[][] dp;

    int fun(int i, int amount, int[] coins) {

        if (amount == 0)
            return 1;

        if (amount < 0)
            return 0;

        if (dp[i][amount] != -1)
            return dp[i][amount];

        int ans = 0;

        for (int k = i; k < coins.length; k++) {
            ans += fun(k, amount - coins[k], coins);
        }

        return dp[i][amount] = ans;
    }

    public int change(int amount, int[] coins) {

        dp = new int[coins.length][amount + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return fun(0, amount, coins);
    }
}