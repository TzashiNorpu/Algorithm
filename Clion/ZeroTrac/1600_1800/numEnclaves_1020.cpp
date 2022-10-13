//
// Created by TzashiNorpu on 7/28/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::numEnclaves_1020(vector<vector<int>> &grid) {
  int m = grid.size();
  int n = grid[0].size();
  int can_reach = 0;
  vector<vector<int>> dirs = {{-1, 0},
                              {0,  -1},
                              {0,  1},
                              {1,  0}};
  vector<vector<bool>> vis(m, vector<bool>(n, false));
  function<void(int, int)> dfs = [&](int x, int y) {
      if (x < 0 || x >= m || y < 0 || y >= n) return;
      if (grid[x][y] && !vis[x][y]) {
        vis[x][y] = true;
        ++can_reach;
        for (auto &dir: dirs)
          dfs(x + dir[0], y + dir[1]);
      }
  };
  int one_count = 0;
  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      if (grid[i][j] == 1) {
        one_count++;
        if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
          dfs(i, j);
      }

    }
  }
  return one_count - can_reach;
}