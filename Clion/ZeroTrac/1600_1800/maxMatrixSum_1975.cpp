//
// Created by TzashiNorpu on 8/15/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

long long Solution::maxMatrixSum(vector<vector<int>> &matrix) {
  long long sum = 0, zeros = 0, negs = 0, min_abs = INT_MAX;
  for (int i = 0; i < matrix.size(); ++i)
    for (int j = 0; j < matrix[i].size(); ++j) {
      sum += abs(matrix[i][j]);
      zeros += matrix[i][j] == 0;
      negs += matrix[i][j] < 0;
      min_abs = min(min_abs, (long long) abs(matrix[i][j]));
    }
  return sum - (zeros || negs % 2 == 0 ? 0 : 2 * min_abs);
}