class Solution {
    Integer dp[][];

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        dp = new Integer[n][m];
       
        return solve(triangle, 0, 0);

    }

    public int solve(List<List<Integer>> triangle, int i, int j) {
        int n = triangle.size();
    
        if (i == n - 1 )
            return triangle.get(i).get(j);


        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int down = solve(triangle, i + 1, j);

        int diagonal = solve(triangle, i + 1, j + 1);

        return dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagonal);
    }

}