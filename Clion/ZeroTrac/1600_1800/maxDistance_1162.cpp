//
// Created by TzashiNorpu on 10/9/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::maxDistance(vector<vector<int>> &grid) {
  /*int n = grid.size();
  int res = 0;
  vector<vector<int>> dirs = {
          {0,  1},
          {0,  -1},
          {1,  0},
          {-1, 0}
  };
  deque<int> dq;

  for (int i = 0; i < n; ++i) {
    for (int j = 0; j < n; ++j) {
      int distance = 0;
      int g = grid[i][j];
      if (g == 0) {
        vector<vector<bool>> visited(n, vector<bool>(n, false));
        dq.push_back(i * n + j);
        while (!dq.empty()) {
          distance++;
          int len = dq.size();
          for (int k = 0; k < len; ++k) {
            int x = dq.front();
            dq.pop_front();
            visited[x / n][x % n] = true;
            for (auto dir: dirs) {
              int newx = x / n + dir[0];
              int newy = x % n + dir[1];
              if (newx >= 0 && newx < n && newy >= 0 && newy < n && !visited[newx][newy]) {
                if (grid[newx][newy] == 0) dq.push_back(newx * n + newy);
                else {
                  res = max(res, distance);
                  dq.clear();
                  len = 0;
                  break;
                }
              }
            }
          }
        }
      }
    }
  }
  return res == 0 ? -1 : res;*/
  int x[] = {-1, 0, 1, 0};
  int y[] = {0, 1, 0, -1};
  int n = grid.size();

  queue<pair<int, int>> q;

  // step 1 : pushing all coordinates of land
  for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
      if (grid[i][j] == 1)
        q.push({i, j});

  // if matrix has no water then ans = -1 so return
  if (q.size() == n * n)
    return -1;

  int dist = 0;

  // standard BFS
  while (q.size()) {
    int size = q.size();
    dist++;
    while (size--) {
      auto [si, sj] = q.front();
      q.pop();

      for (int i = 0; i < 4; i++) {
        int newi = si + x[i];
        int newj = sj + y[i];
        if (newi >= 0 and newi < n and newj >= 0 and newj < n and grid[newi][newj] == 0)
          q.push({newi, newj}), grid[newi][newj] = 1;
      }
    }
  }
  return dist - 1;
}