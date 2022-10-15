//
// Created by TzashiNorpu on 9/7/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::unhappyFriends(int n, vector<vector<int>> &preferences, vector<vector<int>> &pairs) {
  vector<unordered_map<int, int>> m(n);
  vector<int> dist(n);
  for (int i = 0; i < n; ++i) {
    for (int distance = 0; distance < preferences[i].size(); ++distance)
      m[i][preferences[i][distance]] = distance;
  }
  // pair 之间的距离
  for (auto &p: pairs) {
    dist[p[0]] = m[p[0]][p[1]];
    dist[p[1]] = m[p[1]][p[0]];
  }

  int res = 0;
  for (int x = 0; x < n; ++x) {
    // dist[x] -> y
    for (int distance1 = 0; distance1 < dist[x]; ++distance1) {
      int u = preferences[x][distance1];
      // dist[u] -> v
      for (int distance2 = 0; distance2 < dist[u]; ++distance2) {
        // preferences[u][distance2] -> x1
        if (x == preferences[u][distance2]) {
          ++res;
          // 退出循环
          distance1 = distance2 = n;
        }
      }
    }
  }
  return res;
}