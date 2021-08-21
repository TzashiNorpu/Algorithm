package algo.tzashinorpu.Week05.Chapter12.Exercise;

public class LeetCode_5_063 {
    // https://leetcode-cn.com/problems/unique-paths-ii/
    // Bottom up 递推
    // 每次只能向下或者向右移动一步
    // 状态转移方程 or 动态规划方程 opt-->optimal
    // opt[i,j]=opt[i+1,j] + opt[i,j+1]
    // 完整逻辑:
    // if a[i,j] ='空地' :
    //     opt[i,j]=opt[i+1,j] + opt[i,j+1]
    // else
    //     opt[i,j] = 0
    // elePath 只需要存储 下侧和左侧的步数
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // m列   n行
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;
        int[][] elePath = new int[n][m];
        // 初始化终点元素步骤数目
        if (obstacleGrid[n - 1][m - 1] == 0) {
            elePath[n - 1][m - 1] = 1;
        } else {
            elePath[n - 1][m - 1] = 0;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                // 初始化最后一行(除终点)
                if (i == n - 1 && j != m - 1) {
                    if (obstacleGrid[i][j] == 0 && elePath[i][j + 1] == 1) {
                        elePath[i][j] = 1;
                    } else {
                        elePath[i][j] = 0;
                    }
                }
                // 初始化最后一列(除终点)
                else if (j == m - 1 && i != n - 1) {
                    if (obstacleGrid[i][j] == 0 && elePath[i + 1][j] == 1) {
                        elePath[i][j] = 1;
                    } else {
                        elePath[i][j] = 0;
                    }
                } else if(i != n - 1 && j != m - 1) {
                    if (obstacleGrid[i][j] == 0) {
                        elePath[i][j] = elePath[i + 1][j] + elePath[i][j + 1];
                    } else {
                        elePath[i][j] = 0;
                    }
                }
            }
        }
        return elePath[0][0];
    }

    public static void main(String[] args) {
        LeetCode_5_063 test = new LeetCode_5_063();
        int[][] boards = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(test.uniquePathsWithObstacles(boards));
    }
}
