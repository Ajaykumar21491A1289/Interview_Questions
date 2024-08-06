package Arrays;

public class PathToLast {
    
    public static int countWays(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // DP table to store the number of ways to reach each cell
        int[][] dp = new int[rows][cols];
        
        // Initialize the DP table
        dp[0][0] = 1; // Starting point
        
        // Fill the DP table
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = 0; // If it's a wall, no way to reach this cell
                } else {
                    // If not on the top row, add ways from the cell above
                    if (i > 0) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    // If not on the leftmost column, add ways from the cell on the left
                    if (j > 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        // The number of ways to reach the bottom-right corner
        return dp[rows - 1][cols - 1];
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
        		 {0, 0, 1},
        	        {0, 0, 1},
        	        {1, 0, 0}
        };

        System.out.println(countWays(matrix)); // Output: 2
    }
}

