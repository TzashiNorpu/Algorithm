//
// Created by TzashiNorpu on 3/30/2023.
//
#include "tree_r1.h"

using namespace Tree;

vector<vector<int>> Solution::combinationSum2(vector<int> &candidates, int target) {
  vector<vector<int>> res;
  vector<int> path;
  std::sort(candidates.begin(), candidates.end());
  int n = candidates.size();
  function<void(int, int)> helper = [&](int i, int target) -> void {
      if (target < 0) return;
      if (target == 0) {
        res.push_back(path);
        return;
      }
      for (int j = i; j < n; ++j) {
        // j>i -> 相同层级选过的值就不能再选了【j>i:相同层级选择不同的元素】
        if (j > 0 && candidates[j] == candidates[j - 1] && j > i) continue;
        path.push_back(candidates[j]);
        helper(j + 1, target - candidates[j]);
        path.pop_back();
      }
  };
  helper(0, target);
  return res;
}