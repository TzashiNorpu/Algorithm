//
// Created by TzashiNorpu on 3/30/2023.
//
#include "tree_r1.h"

using namespace Tree;

vector<vector<int>> Solution::permute(vector<int> &nums) {
  vector<vector<int>> res;
  int n = nums.size();
  vector<bool> visited = vector(n, false);
  vector<int> path;
  function<void()> helper = [&]() -> void {
      if (path.size() == n) {
        res.push_back(path);
        return;
      }
      for (int i = 0; i < n; ++i) {
        if (visited[i]) continue;
        path.push_back(nums[i]);
        visited[i] = true;
        helper();
        visited[i] = false;
        path.pop_back();
      }
  };
  helper();
  return res;
}