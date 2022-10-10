//
// Created by TzashiNorpu on 10/10/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::getMaximumGold(vector<vector<int>> &grid) {
  int res = 0;
  int m = grid.size(), n = grid[0].size();
  function<int(vector<vector<int>> &, int, int)> dfs = [&](vector<vector<int>> &g, int i, int j) -> int {
      if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] <= 0) return 0;
      g[i][j] = -g[i][j];
      int ans = max({dfs(g, i + 1, j), dfs(g, i, j + 1), dfs(g, i - 1, j), dfs(g, i, j - 1)});
      g[i][j] = -g[i][j];
      return g[i][j] + ans;
  };
  for (int i = 0; i < m; ++i)
    for (int j = 0; j < n; ++j)
      res = max(res, dfs(grid, i, j));
  return res;
}