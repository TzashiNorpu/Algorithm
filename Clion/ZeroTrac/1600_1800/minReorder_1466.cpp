//
// Created by TzashiNorpu on 8/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::minReorder(int n, vector<vector<int>> &connections) {

  function<int(vector<vector<int>> &, vector<bool> &, int)> dfs =
          [&](vector<vector<int>> &a, vector<bool> &visited, int from) -> int {
              auto change = 0;
              visited[from] = true;
              for (auto to: a[from])
                if (!visited[abs(to)])
                  change += dfs(a, visited, abs(to)) + (to > 0);
              return change;
          };


  vector<vector<int>> al(n);
  for (auto &c: connections) {
    al[c[0]].push_back(c[1]);
    al[c[1]].push_back(-c[0]);
  }
  return dfs(al, vector<bool>(n) = {}, 0);
}