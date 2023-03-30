//
// Created by TzashiNorpu on 3/30/2023.
//
#include "tree_r1.h"

using namespace Tree;

vector<vector<int>> Solution::combinationSum3(int k, int n) {
  vector<vector<int>> res;
  vector<int> path;
  function<void(int, int)> helper = [&](int i, int target) -> void {
      if (target < 0 || k < 0 || i > 10) return;
      if (target == 0 && k == 0) {
        res.push_back(path);
        return;
      }
      // 不选
      helper(i + 1, target);
      // 选一次
      k--;
      path.push_back(i);
      helper(i + 1, target - i);
      path.pop_back();
      k++;
  };
  helper(1, n);
  return res;
}