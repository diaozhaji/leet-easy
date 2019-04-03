package medium;

public class MinimumPathSum64 {

    //动态规划，在原矩阵基础上修改成到该点的最小距离
    //基本抄答案 faster than 100.00%
    public static int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        //确定第一行和第一列
        for (int i = 1; i < n; i++) {
            grid[0][i] = grid[0][i - 1] + grid[0][i];
        }

        for (int j = 1; j < m; j++) {
            grid[j][0] = grid[j - 1][0] + grid[j][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }


        return grid[m - 1][n - 1];
    }
}
