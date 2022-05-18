package algo.tzashinorpu.SpecialSubject.Top;

public class rotate_48 {
    // 对于矩阵中第 i 行的第 j 个元素，在旋转后，它出现在倒数第 i 列的第 j 个位置
    // 矩阵中的元素 matrix[row][col]，在旋转后，它的新位置为 matrix[col][n−row−1] ==> 列号变为新的行号  n - 原来的行号 - 1变为新的列号

     /*
     temp = matrix[col][n−row−1]
     matrix[col][n−row−1] =matrix[row][col]
     */

    // matrix[col][n−row−1] 经过旋转操作之后到的位置==> 列号变为新的行号  n - 原来的行号 - 1变为新的列号 ==> matrix[n−row−1][n−col−1]
    /*
    temp =matrix[n−row−1][n−col−1]
    matrix[n−row−1][n−col−1] = matrix[col][n−row−1]
    matrix[col][n−row−1] = matrix[row][col]
    */

    // matrix[n−row−1][n−col−1] 经过旋转操作之后到的位置==> 列号变为新的行号  n - 原来的行号 - 1变为新的列号 ==> matrix[n−col−1][n−(n−row−1)−1]=matrix[n−col−1][row]
    /*
    temp = matrix[n−col−1][row]
    matrix[n−col−1][row]=matrix[n−row−1][n−col−1]
    matrix[n−row−1][n−col−1] = matrix[col][n−row−1]
    matrix[col][n−row−1] = matrix[row][col]
    */
    // matrix[n−col−1][row] 经过旋转操作之后到的位置==> 列号变为新的行号  n - 原来的行号 - 1变为新的列号 ==> matrix[row][col]
    /*
    每一次原地交换四个位置
    matrix[row][col] = matrix[n−col−1][row]
    matrix[n−col−1][row]=matrix[n−row−1][n−col−1]
    matrix[n−row−1][n−col−1] = matrix[col][n−row−1]
    matrix[col][n−row−1] = matrix[row][col]
    ===>
    temp = matrix[row][col]
    matrix[row][col] = matrix[n−col−1][row]
    matrix[n−col−1][row]=matrix[n−row−1][n−col−1]
    matrix[n−row−1][n−col−1] = matrix[col][n−row−1]
    matrix[col][n−row−1] = temp
    n 为偶数时，我们需要枚举 n^2 / 4 = (n/2) * (n/2) 个位置，可以将该图形分为四块
    n 为奇数时，由于中心的位置经过旋转后位置不变，我们需要枚举 (n^2-1) / 4 =((n−1)/2)×((n+1)/2) 个位置
    */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
}
