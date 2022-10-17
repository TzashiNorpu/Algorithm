//
// Created by TzashiNorpu on 10/17/2022.
//
#include "g"

using namespace G;

bool Solution::possibleBipartition(int n, vector<vector<int>> &dislikes) {
  vector<vector<int>> graph(n + 1, vector<int>());
  for (auto &edge: dislikes) {
    int v = edge[0], w = edge[1];
    graph[v].push_back(w);
    graph[w].push_back(v);
  }
  bool bi_part = true;
  vector<bool> visited(n, false);
  vector<bool> color(n, false);
  function<void(int)> dfs = [&](int index) -> void {
      if (!bi_part || visited[index]) return;
      visited[index] = true;
      for (auto x: graph[index]) {
        if (!visited[x]) {
          color[x] = !color[index];
          dfs(x);
        } else {
          if (color[x] == color[index]) {
            bi_part = false;
            return;
          }
        }
      }
  };
  for (int i = 0; i < n; ++i) {
    if (!visited[i]) dfs(i);
  }
  return bi_part;
}