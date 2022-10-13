//
// Created by TzashiNorpu on 7/22/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int waysToMakeFair_1664::waysToMakeFair(vector<int> &nums) {
  int res = 0, n = nums.size(), left[2] = {}, right[2] = {};
  for (int i = 0; i < n; i++) right[i % 2] += nums[i];
  for (int i = 0; i < n; ++i) {
    right[i % 2] -= nums[i];
    res += (left[0] + right[1] == left[1] + right[0]);
    left[i % 2] += nums[i];
  }
  return res;
}