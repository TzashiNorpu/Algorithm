//
// Created by TzashiNorpu on 10/17/2022.
//
#include "g"

using namespace G;

bool Solution::isBipartite(vector<vector<int>> &graph) {
  bool bi_part = true;
  int n = graph.size();
  vector<bool> visited(n, false);
  vector<bool> color(n, false);
  function<void(int)> dfs = [&](int index) -> void {
      if (!bi_part || visited[index]) return;
      visited[index] = true;
      for (auto v: graph[index]) {
        if (!visited[v]) {
          color[v] = !color[index];
          dfs(v);
        } else {
          if (color[v] == color[index]) {
            bi_part = false;
            return;
          }
        }
      }
  };
  for (int i = 0; i < n; ++i) {
    if (!visited[i])dfs(i);
  }
  return bi_part;
}