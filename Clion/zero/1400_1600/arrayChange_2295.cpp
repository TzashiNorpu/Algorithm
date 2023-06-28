//
// Created by TzashiNorpu on 2023/6/28.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::arrayChange(vector<int> &nums, vector <vector<int>> &operations) {
  unordered_map<int, int> m;
  int n = nums.size();
  for (int i = 0; i < n; ++i) {
    m[nums[i]] = i;
  }
  for (auto &op: operations) {
    nums[m[op[0]]] = op[1];
    m[op[1]] = m[op[0]];
    m.erase(op[0]);
  }
  return nums;
}