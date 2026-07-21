class Solution {
    int dp[];
    int fun(int n) {
        if(n<0)return 0;
        if(n==0)return 1;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=fun(n-1)+fun(n-2);
    }

    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n);
    }
}
