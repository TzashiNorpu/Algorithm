//
// Created by TzashiNorpu on 2023/6/5.
//
#include "../header/header.h"

using namespace zero;

bool Solution::checkXMatrix(vector <vector<int>> &grid) {
  int n = grid.size();
  for (int i = 0; i < n; ++i) {
    for (int j = 0; j < n; ++j) {
      // 对角线
      if (i == j || (i + j) == n - 1) {
        if (grid[i][j] == 0) return false;
      } else {
        if (grid[i][j] != 0) return false;
      }
    }
  }
  return true;
}