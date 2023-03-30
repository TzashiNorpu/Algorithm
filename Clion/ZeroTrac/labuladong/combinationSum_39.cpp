//
// Created by TzashiNorpu on 3/30/2023.
//
#include "tree_r1.h"

using namespace Tree;

vector<vector<int>> Solution::combinationSum(vector<int> &candidates, int target) {
  vector<vector<int>> res;
  vector<int> path;
  int n = candidates.size();
  function<void(int, int)> helper = [&](int i, int target) -> void {
      if (i == n || target < 0)return;
      if (target == 0) {
        res.push_back(path);
        return;
      }
      // 不选当前节点，到下一个节点去
      helper(i + 1, target);
      // 选当前节点
      path.push_back(candidates[i]);
      helper(i, target - candidates[i]);
      path.pop_back();
  };
  helper(0, target);
  return res;
}