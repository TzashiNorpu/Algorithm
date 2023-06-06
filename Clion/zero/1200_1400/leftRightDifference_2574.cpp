//
// Created by TzashiNorpu on 2023/6/6.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::leftRightDifference(vector<int> &nums) {
  int len = nums.size();
  vector<int> left_sum(len, 0);
  vector<int> right_sum(len, 0);
  vector<int> res(len, 0);
  for (int i = 1; i < len; ++i) {
    left_sum[i] += (left_sum[i - 1] + nums[i - 1]);
  }

  for (int i = len - 2; i >= 0; --i) {
    right_sum[i] += (right_sum[i + 1] + nums[i + 1]);
  }
  for (int i = 0; i < len; ++i) {
    res[i] = abs(right_sum[i] - left_sum[i]);
  }
  return res;
}