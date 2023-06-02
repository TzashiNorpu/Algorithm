//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../../header/header.h"

using namespace labuladong;

int Solution::removeElement(vector<int> &nums, int val) {
  int pos = 0;
  for (int i = 0; i < nums.size(); ++i) {
    if (nums[i] != val)
      nums[pos++] = nums[i];
  }
  return pos;
}