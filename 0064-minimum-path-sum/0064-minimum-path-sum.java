class Solution {
    int dp[][];

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(grid,0,0);

    }

    public int solve(int[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        if (i == n - 1 && j == m - 1)
            return grid[i][j];

        if (i >= n || j >= m)
            return Integer.MAX_VALUE;


        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int right = solve(grid, i, j + 1);

        int left =solve(grid, i + 1, j);

        return dp[i][j]=grid[i][j] + Math.min(right, left);
    }
}