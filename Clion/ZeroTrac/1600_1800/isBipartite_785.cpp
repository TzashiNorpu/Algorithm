//
// Created by TzashiNorpu on 8/9/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

bool dfs(vector<vector<int>> graph, vector<int> &colors, int node, int color) {
  if (colors[node]) return colors[node] == color;
  colors[node] = color;
  for (auto &adjacent: graph[node])
    if (!dfs(graph, colors, adjacent, -color)) return false;
  return true;
}

bool Solution::isBipartite(vector<vector<int>> &graph) {
  int n = graph.size();
  vector<int> colors(n, 0);
  for (int i = 0; i < n; i++)
    if (colors[i] == 0 && !dfs(graph, colors, i, 1)) return false;
  return true;
}