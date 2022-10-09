//
// Created by TzashiNorpu on 10/9/2022.
//

#include "header.h"

using namespace ZeroTrac;

int Solution::kthLargestValue(vector<vector<int>> &matrix, int k) {
  int m = matrix.size(), n = matrix[0].size();
  vector<int> reses(m * n);
  vector<vector<int>> xor_matrix(m + 1, vector<int>(n + 1));
  for (int i = 1; i <= m; ++i) {
    for (int j = 1; j <= n; ++j) {
      xor_matrix[i][j] = (matrix[i - 1][j - 1] xor xor_matrix[i - 1][j]
                          xor xor_matrix[i][j - 1] xor xor_matrix[i - 1][j - 1]);
      reses.push_back(xor_matrix[i][j]);
    }
  }
  std::sort(reses.begin(), reses.end(), greater<int>());
  return reses[k - 1];
}