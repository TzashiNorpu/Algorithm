//
// Created by TzashiNorpu on 2023/6/16.
//
#include "../header/header.h"

using namespace zero;

vector <vector<int>> Solution::differenceOfDistinctValues(vector <vector<int>> &grid) {
  int row = grid.size();
  int col = grid[0].size();
  vector <vector<int>> res(row, vector<int>(col, 0));
  for (int i = 0; i < row; ++i) {
    for (int j = 0; j < col; ++j) {
      unordered_set<int> up;
      unordered_set<int> bottom;
      int r = i - 1, c = j - 1;
      while (r >= 0 && c >= 0) {
        up.insert(grid[r][c]);
        r--, c--;
      }
      r = i + 1, c = j + 1;
      while (r < row && c < col) {
        bottom.insert(grid[r][c]);
        r++, c++;
      }
      int u = up.size();
      int b = bottom.size();
      res[i][j] = abs(u - b);
    }
  }
  return res;
}