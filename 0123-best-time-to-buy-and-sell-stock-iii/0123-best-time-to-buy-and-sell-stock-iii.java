class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return getans(prices, n, 0, 0, 2, dp);
    }

    static int getans(int[] arr, int n, int ind, int buy, int cap, int[][][] dp) {
        if (ind == n || cap == 0) {
            return 0;
        }
        if (dp[ind][buy][cap] != -1) {
            return dp[ind][buy][cap];
        }

        int profit = 0; // Initialize `profit` to ensure it has a value in all cases.

        if (buy == 0) {
            profit = Math.max(0 + getans(arr, n, ind + 1, 0, cap, dp),
                    -arr[ind] + getans(arr, n, ind + 1, 1, cap, dp));
        } else if (buy == 1) {
            profit = Math.max(0 + getans(arr, n, ind + 1, 1, cap, dp),
                    arr[ind] + getans(arr, n, ind + 1, 0, cap - 1, dp));
        }

        return dp[ind][buy][cap] = profit;
    }
}
