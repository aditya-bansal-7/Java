class Solution {
    int[][][] dp;

    public int maxProfit(int k,int[] prices) {
        int n = prices.length;
        k *= 2;
        dp = new int[n][k+1][2];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < k+1; j++)
                Arrays.fill(dp[i][j], -1);

        return maxProfit(prices, 0, 0, k);
    }

    public int maxProfit(int[] prices, int i, int holding, int selltime) {

        if (selltime == 0 || i == prices.length)
            return 0;

        if (dp[i][selltime][holding] != -1)
            return dp[i][selltime][holding];

        int skip = maxProfit(prices, i + 1, holding, selltime);

        int profit;

        if (holding == 0) {
            profit = -prices[i] + maxProfit(prices, i + 1, 1, selltime - 1);
        } else {
            profit = prices[i] + maxProfit(prices, i + 1, 0, selltime - 1);
        }

        return dp[i][selltime][holding] = Math.max(skip, profit);
    }
}