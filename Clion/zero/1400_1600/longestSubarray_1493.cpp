//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

int Solution::longestSubarray(vector<int> &nums) {
  // 区间内有一个0
  int i = 0, j = 0, k = 1;
  int n = nums.size();
  for (; j < n; j++) {
    if (nums[j] == 0) k--;
    if (k < 0 && nums[i++] == 0)k++;
  }
  return j - i - 1;
}