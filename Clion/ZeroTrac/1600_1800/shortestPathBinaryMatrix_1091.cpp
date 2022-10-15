//
// Created by TzashiNorpu on 9/7/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::shortestPathBinaryMatrix(vector<vector<int>> &grid) {
  queue<int> q;
  vector<vector<int>> dirs = {{0,  1},
                              {0,  -1},
                              {1,  0},
                              {-1, 0},
                              {1,  1},
                              {-1, -1},
                              {1,  -1},
                              {-1, 1}};
  int n = grid.size();
  vector<bool> visited(n * n, false);
  if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;
  q.push(0);
  visited[0] = true;
  int step = 1;
  while (!q.empty()) {
    int size = q.size();
    for (int i = 0; i < size; ++i) {
      int p = q.front();
      q.pop();
      int x = p / n, y = p % n;
      if (x == n - 1 && y == n - 1) return step;
      for (auto &dir: dirs) {
        int newx = x + dir[0];
        int newy = y + dir[1];
        int pw = newx * n + newy;
        if (newx >= 0 && newx < n && newy >= 0 && newy < n && grid[newx][newy] == 0 && !visited[pw])
          q.push(pw), visited[pw] = true;
      }
    }
    step++;
    if (q.empty()) return -1;
  }
  return -1;
}