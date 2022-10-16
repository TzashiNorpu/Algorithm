//
// Created by TzashiNorpu on 10/12/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::closedIsland(vector<vector<int>> &grid) {
  int m = grid.size(), n = grid[0].size();
  function<int(vector<vector<int>> &, int, int)> dfs = [&](vector<vector<int>> &grid, int i, int j) -> int {
      if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j]) return 0;
      return (grid[i][j] = 1) + dfs(grid, i + 1, j) + dfs(grid, i - 1, j)
             + dfs(grid, i, j + 1) + dfs(grid, i, j - 1);
  };

  int res = 0;
  for (int i = 0; i < m; ++i)
    for (int j = 0; j < n; ++j)
      if (i * j == 0 || i == m - 1 || j == n - 1) dfs(grid, i, j);
  for (int i = 0; i < m; ++i)
    for (int j = 0; j < n; ++j)
      res += (dfs(grid, i, j) > 0);

  return res;
}