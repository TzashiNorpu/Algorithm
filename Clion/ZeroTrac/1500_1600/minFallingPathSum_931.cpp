//
// Created by TzashiNorpu on 7/20/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

void minFallingPathSum_931::helper(int colIndex, int rowIndex, int sum, vector<vector<int>> &matrix) {
  if (rowIndex == matrix.size()) {
    res = min(res, sum);
    return;
  }
  for (int i = -1; i <= 1; ++i) {
    if (colIndex + i < 0 || colIndex + i >= matrix.size())
      continue;
    helper(colIndex + i, rowIndex + 1, sum + matrix[rowIndex][colIndex + i], matrix);
  }
}

int minFallingPathSum_931::minFallingPathSum(vector<vector<int>> &matrix) {
  for (int i = 0; i < matrix.size(); ++i) {
    helper(i, 1, matrix[0][i], matrix);
  }
  return res;
}

int minFallingPathSumDp(vector<vector<int>> &matrix) {
  /*int n = matrix.size();
  vector<vector<int>> dp(n, vector<int>(n, 0));
  int res = 20000;
  for (int i = 0; i < n; ++i) {
      dp[0][i] = matrix[0][i];
      if (n == 1) res = min(res, dp[0][i]);
  }
  for (int i = 1; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
          if (j == 0) dp[i][j] = min(dp[i - 1][j + 1], dp[i - 1][j]) + matrix[i][j];
          else if (j == n - 1) dp[i][j] = min(dp[i - 1][j - 1], dp[i - 1][j]) + matrix[i][j];
          else dp[i][j] = min(min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]) + matrix[i][j];
          if (i == n - 1) res = min(res, dp[i][j]);
      }
  }
  return res;*/
  for (auto i = 1; i < matrix.size(); ++i)
    for (auto j = 0; j < matrix.size(); ++j)
      matrix[i][j] += min(
              {matrix[i - 1][j], matrix[i - 1][max(0, j - 1)],
               matrix[i - 1][min((int) matrix.size() - 1, j + 1)]});
  return *min_element(begin(matrix[matrix.size() - 1]), end(matrix[matrix.size() - 1]));
}