//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

int Solution::longestOnes(vector<int> &nums, int k) {
  int i = 0, j = 0;
  int n = nums.size();
  for (; j < n; j++) {
    if (nums[j] == 0) k--;
    if (k < 0 && nums[i++] == 0)k++;
  }
  return j - i;
}