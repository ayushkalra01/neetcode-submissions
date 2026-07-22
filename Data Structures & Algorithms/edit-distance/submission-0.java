class Solution {

    Integer[][] dp;

    int fun(int i, int j, String word1, String word2) {

        if (i == word1.length())
            return word2.length() - j;

        if (j == word2.length())
            return word1.length() - i;

        if (dp[i][j] != null)
            return dp[i][j];

        if (word1.charAt(i) == word2.charAt(j))
            return dp[i][j] = fun(i + 1, j + 1, word1, word2);

        int insert = 1 + fun(i, j + 1, word1, word2);

        int delete = 1 + fun(i + 1, j, word1, word2);

        int replace = 1 + fun(i + 1, j + 1, word1, word2);

        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }

    public int minDistance(String word1, String word2) {

        dp = new Integer[word1.length() + 1][word2.length() + 1];

        return fun(0, 0, word1, word2);
    }
}