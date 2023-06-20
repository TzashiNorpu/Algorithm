//
// Created by TzashiNorpu on 2023/6/20.
//
#include "../header/header.h"

using namespace zero;

int Solution::orangesRotting(vector <vector<int>> &grid) {
  queue <pair<int, int>> q;
  int m = grid.size(), n = grid[0].size();
  int fresh = 0, ans = -1;
  for (int i = 0; i < m; ++i) {
    for (int j = 0; j < n; ++j) {
      if (grid[i][j] == 2) q.push({i, j});
      if (grid[i][j] == 1) fresh++;
    }
  }
  int dirs[4][2] = {{0,  -1}, // up
                    {0,  1},//down
                    {-1, 0},//left
                    {1,  0}}; //right
  while (!q.empty()) {
    int sz = q.size();
    for (int i = 0; i < sz; ++i) {
      auto pos = q.front();
      q.pop();
      for (int j = 0; j < 4; ++j) {
        int r = pos.first + dirs[j][0];
        int c = pos.second + dirs[j][1];
        if (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == 1) {
          grid[r][c] = 2;
          fresh--;
          q.push({r, c});
        }
      }
    }
    ans++;
  }
  if (fresh > 0) return -1;
  if (ans == -1) return 0;
  return ans;
}