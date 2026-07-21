class Solution {
    int dp[];
    int n;
    int fun(int i, int[]cost) {
        if(i>=n)return 0;
        
        if(dp[i]!=-1)
        return dp[i];
        return dp[i]=cost[i]+Math.min(fun(i+1,cost),fun(i+2,cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        n=cost.length;
          dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(fun(0,cost),fun(1,cost));
    }
}
