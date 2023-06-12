//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

vector<bool> Solution::checkArithmeticSubarrays(vector<int> &nums, vector<int> &l, vector<int> &r) {
  function<bool(vector < int > &)> isArith = [&](vector<int> &nums) -> bool {
      std::sort(nums.begin(), nums.end());
      int n = nums.size();
      if (n <= 2) return true;
      int diff = nums[1] - nums[0];
      for (int i = 2; i < n; ++i) {
        if (nums[i] - nums[i - 1] != diff) return false;
      }
      return true;
  };
  int n = l.size();
  vector<bool> res(n, false);
  for (int i = 0; i < n; ++i) {
    vector<int> tmp(nums.begin() + l[i], nums.begin() + r[i] + 1);
    res[i] = isArith(tmp);
  }
  return res;
}