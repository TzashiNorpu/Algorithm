//
// Created by TzashiNorpu on 8/10/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::makeConnected(int n, vector<vector<int>> &connections) {
  if (connections.size() < n - 1)
    return -1;
  vector<vector<int>> adj(n);
  for (auto v: connections) {
    adj[v[0]].push_back(v[1]);
    adj[v[1]].push_back(v[0]);
  }
  vector<bool> visited(n, false);

  int components = 0;


  function<void(vector<vector<int>> &adj, vector<bool> &visited, int src)> dfs =
          [&](vector<vector<int>> &adj, vector<bool> &visited, int src) {
              visited[src] = true;
              for (int i: adj[src])
                if (!visited[i])
                  dfs(adj, visited, i);
          };

  for (int i = 0; i < n; i++)
    if (!visited[i]) {
      dfs(adj, visited, i);
      components++;
    }
  return components - 1;
}