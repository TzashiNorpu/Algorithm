//
// Created by TzashiNorpu on 8/9/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool validColor(vector<vector<int>> graph, vector<int> colors, int color, int node) {
//  if (colors[node]) return colors[node] == color;
  colors[node] = color;
  for (int adjacent: graph[node]) {
    if (colors[adjacent] == -color) continue;
    if (colors[adjacent] == color || !validColor(graph, colors, -color, adjacent))
      return false;
  }
  return true;
}

bool Solution::isBipartite(vector<vector<int>> &graph) {
  vector<int> colors(graph.size(), 0);
  for (int i = 0; i < graph.size(); i++)
    if (colors[i] == 0 && !validColor(graph, colors, 1, i))
      return false;
  return true;
}