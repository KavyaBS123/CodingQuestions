class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;    // Number of rows
        int m = obstacleGrid[0].length; // Number of columns

        // Initialize the dp array
        int dp[][] = new int[n][m];

        // Fill the dp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If there's an obstacle, no paths can go through this cell
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

                // If it's the starting cell, there's one path
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                // Calculate the number of paths from the top and left cells
                int up = (i > 0) ? dp[i - 1][j] : 0;
                int left = (j > 0) ? dp[i][j - 1] : 0;

                // Total paths to this cell
                dp[i][j] = up + left;
            }
        }

        // Return the number of paths to the bottom-right corner
        return dp[n - 1][m - 1];
    }
}