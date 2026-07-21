class Solution {

    int[] dp;

    int fun(int i, int[] nums, int end) {

        if (i >= end)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        return dp[i] = Math.max(
                fun(i + 1, nums, end),
                nums[i] + fun(i + 2, nums, end)
        );
    }

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return nums[0];

        dp = new int[n];
        Arrays.fill(dp, -1);

        int takeFirst = nums[0] + fun(2, nums, n - 1);

        Arrays.fill(dp, -1);

        int skipFirst = fun(1, nums, n);

        return Math.max(takeFirst, skipFirst);
    }
}