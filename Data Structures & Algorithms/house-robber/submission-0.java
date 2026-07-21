class Solution {
       int dp[];
    int n;
    int fun(int i, int[]cost) {
        if(i>=n)return 0;
        
        if(dp[i]!=-1)
        return dp[i];
        return dp[i]=Math.max(fun(i+1,cost),cost[i]+fun(i+2,cost));
    }
    public int rob(int[] cost) {
         n=cost.length;
          dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.max(fun(0,cost),fun(1,cost));
    }
}
