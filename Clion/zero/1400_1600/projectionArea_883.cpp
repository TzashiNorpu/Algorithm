//
// Created by TzashiNorpu on 2023/6/15.
//
#include "../header/header.h"

using namespace zero;

int Solution::projectionArea(vector <vector<int>> &grid) {
  int n = grid.size();
  int t1 = 0;
  int t2 = 0;
  int t3 = 0;
  for (int i = 0; i < n; ++i) {
    int colMax = -1;
    int rowMax = -1;
    for (int j = 0; j < n; ++j) {
      colMax = max(colMax, grid[j][i]);
      rowMax = max(rowMax, grid[i][j]);
      t1 += grid[j][i] == 0 ? 0 : 1;
    }
    t3 += colMax;
    t2 += rowMax;
  }
  return t1 + t2 + t3;
}